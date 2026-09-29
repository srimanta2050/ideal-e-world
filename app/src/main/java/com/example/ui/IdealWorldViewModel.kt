package com.example.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.CatalogRepository
import com.example.model.BankingService
import com.example.model.CartItem
import com.example.model.Department
import com.example.model.LicPlan
import com.example.model.Product
import com.example.model.ProductCategory
import com.example.model.ServiceInquiry
import com.example.model.SimPlan
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn

enum class MainNavTab(val label: String) {
    HOME("Home"),
    CATALOG("Shop"),
    SERVICES("Services"),
    CART("Cart"),
    ABOUT("About")
}

class IdealWorldViewModel : ViewModel() {

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _selectedDepartment = MutableStateFlow(Department.ALL)
    val selectedDepartment: StateFlow<Department> = _selectedDepartment.asStateFlow()

    private val _selectedCategory = MutableStateFlow(ProductCategory.ALL)
    val selectedCategory: StateFlow<ProductCategory> = _selectedCategory.asStateFlow()

    private val _cartItems = MutableStateFlow<List<CartItem>>(emptyList())
    val cartItems: StateFlow<List<CartItem>> = _cartItems.asStateFlow()

    private val _wishlist = MutableStateFlow<Set<String>>(emptySet())
    val wishlist: StateFlow<Set<String>> = _wishlist.asStateFlow()

    private val _selectedProduct = MutableStateFlow<Product?>(null)
    val selectedProduct: StateFlow<Product?> = _selectedProduct.asStateFlow()

    private val _activeTab = MutableStateFlow(MainNavTab.HOME)
    val activeTab: StateFlow<MainNavTab> = _activeTab.asStateFlow()

    private val _inquiries = MutableStateFlow<List<ServiceInquiry>>(emptyList())
    val inquiries: StateFlow<List<ServiceInquiry>> = _inquiries.asStateFlow()

    private val _orderPlacedMessage = MutableStateFlow<String?>(null)
    val orderPlacedMessage: StateFlow<String?> = _orderPlacedMessage.asStateFlow()

    private val _inquirySuccessMessage = MutableStateFlow<String?>(null)
    val inquirySuccessMessage: StateFlow<String?> = _inquirySuccessMessage.asStateFlow()

    val bannerImages: List<String> = CatalogRepository.bannerImages
    val simPlans: List<SimPlan> = CatalogRepository.simPlans
    val licPlans: List<LicPlan> = CatalogRepository.licPlans
    val bankingServices: List<BankingService> = CatalogRepository.bankingServices

    val filteredProducts: StateFlow<List<Product>> = combine(
        _selectedDepartment,
        _selectedCategory,
        _searchQuery
    ) { dept, cat, query ->
        CatalogRepository.products.filter { product ->
            val matchesDept = when (dept) {
                Department.ALL -> true
                else -> product.department == dept
            }
            val matchesCategory = when (cat) {
                ProductCategory.ALL -> true
                else -> product.category == cat
            }
            val matchesQuery = query.isBlank() ||
                    product.name.contains(query, ignoreCase = true) ||
                    product.info.contains(query, ignoreCase = true) ||
                    product.category.label.contains(query, ignoreCase = true)

            matchesDept && matchesCategory && matchesQuery
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), CatalogRepository.products)

    val cartItemCount: StateFlow<Int> = combine(_cartItems) { items ->
        items[0].sumOf { it.quantity }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), 0)

    val cartTotalPrice: StateFlow<Double> = combine(_cartItems) { items ->
        items[0].sumOf { it.product.price * it.quantity }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), 0.0)

    fun onSearchQueryChanged(newQuery: String) {
        _searchQuery.value = newQuery
    }

    fun selectDepartment(dept: Department) {
        _selectedDepartment.value = dept
        _selectedCategory.value = ProductCategory.ALL
    }

    fun selectCategory(cat: ProductCategory) {
        _selectedCategory.value = cat
        if (cat != ProductCategory.ALL) {
            _selectedDepartment.value = cat.department
        }
    }

    fun selectTab(tab: MainNavTab) {
        _activeTab.value = tab
    }

    fun selectProduct(product: Product?) {
        _selectedProduct.value = product
    }

    fun toggleWishlist(productId: String) {
        val current = _wishlist.value.toMutableSet()
        if (current.contains(productId)) {
            current.remove(productId)
        } else {
            current.add(productId)
        }
        _wishlist.value = current
    }

    fun addToCart(product: Product, quantity: Int = 1) {
        val current = _cartItems.value.toMutableList()
        val existingIndex = current.indexOfFirst { it.product.id == product.id }
        if (existingIndex >= 0) {
            val existing = current[existingIndex]
            current[existingIndex] = existing.copy(quantity = existing.quantity + quantity)
        } else {
            current.add(CartItem(product = product, quantity = quantity))
        }
        _cartItems.value = current
    }

    fun updateCartQuantity(productId: String, delta: Int) {
        val current = _cartItems.value.toMutableList()
        val index = current.indexOfFirst { it.product.id == productId }
        if (index >= 0) {
            val updatedQty = current[index].quantity + delta
            if (updatedQty <= 0) {
                current.removeAt(index)
            } else {
                current[index] = current[index].copy(quantity = updatedQty)
            }
            _cartItems.value = current
        }
    }

    fun removeFromCart(productId: String) {
        _cartItems.value = _cartItems.value.filterNot { it.product.id == productId }
    }

    fun clearCart() {
        _cartItems.value = emptyList()
    }

    fun placeOrder(
        customerName: String,
        phone: String,
        address: String,
        paymentMethod: String
    ) {
        val total = cartTotalPrice.value
        val itemsCount = cartItemCount.value
        val orderId = "ORD-${System.currentTimeMillis() % 100000}"
        _orderPlacedMessage.value = "Order #$orderId placed successfully for ₹$total ($itemsCount items). We will contact you at $phone for delivery to $address via $paymentMethod."
        clearCart()
    }

    fun dismissOrderDialog() {
        _orderPlacedMessage.value = null
    }

    fun submitServiceInquiry(
        category: String,
        customerName: String,
        phone: String,
        details: String
    ) {
        val inquiry = ServiceInquiry(
            id = "INQ-${System.currentTimeMillis() % 10000}",
            serviceCategory = category,
            customerName = customerName,
            phone = phone,
            details = details
        )
        _inquiries.value = _inquiries.value + inquiry
        _inquirySuccessMessage.value = "Your $category request has been submitted! An Ideal-e-World executive will contact you at $phone shortly."
    }

    fun dismissInquiryDialog() {
        _inquirySuccessMessage.value = null
    }
}
