package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MiscellaneousServices
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Storefront
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.example.ui.IdealWorldViewModel
import com.example.ui.MainNavTab
import com.example.ui.screens.CatalogScreen
import com.example.ui.screens.CartScreen
import com.example.ui.screens.HomeScreen
import com.example.ui.screens.ProductDetailBottomSheet
import com.example.ui.screens.ServicesScreen
import com.example.ui.screens.StoreInfoScreen
import com.example.ui.theme.AmberAccent
import com.example.ui.theme.AmberGold
import com.example.ui.theme.DeepIndigo
import com.example.ui.theme.IdealEWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IdealEWorldTheme {
                MainAppScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainAppScreen(
    viewModel: IdealWorldViewModel = viewModel()
) {
    val activeTab by viewModel.activeTab.collectAsState()
    val filteredProducts by viewModel.filteredProducts.collectAsState()
    val searchQuery by viewModel.searchQuery.collectAsState()
    val selectedDepartment by viewModel.selectedDepartment.collectAsState()
    val selectedCategory by viewModel.selectedCategory.collectAsState()
    val cartItems by viewModel.cartItems.collectAsState()
    val cartCount by viewModel.cartItemCount.collectAsState()
    val cartTotal by viewModel.cartTotalPrice.collectAsState()
    val wishlist by viewModel.wishlist.collectAsState()
    val selectedProduct by viewModel.selectedProduct.collectAsState()
    val orderPlacedMsg by viewModel.orderPlacedMessage.collectAsState()
    val inquirySuccessMsg by viewModel.inquirySuccessMessage.collectAsState()

    // Handle back button gracefully
    BackHandler(enabled = activeTab != MainNavTab.HOME || selectedProduct != null) {
        if (selectedProduct != null) {
            viewModel.selectProduct(null)
        } else {
            viewModel.selectTab(MainNavTab.HOME)
        }
    }

    Scaffold(
        contentWindowInsets = WindowInsets.safeDrawing,
        topBar = {
            TopAppBar(
                title = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        AsyncImage(
                            model = "file:///android_asset/image/mobility/images.png",
                            contentDescription = "Ideal-e-World Logo",
                            modifier = Modifier
                                .height(34.dp)
                                .width(80.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Column {
                            Text(
                                text = "Ideal-e-World",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.White
                            )
                            Text(
                                text = "Electronics • Fashion • Services",
                                style = MaterialTheme.typography.labelSmall,
                                color = AmberGold
                            )
                        }
                    }
                },
                actions = {
                    if (activeTab != MainNavTab.CATALOG) {
                        IconButton(
                            onClick = {
                                viewModel.selectTab(MainNavTab.CATALOG)
                            },
                            modifier = Modifier.testTag("top_search_btn")
                        ) {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "Search Catalog",
                                tint = Color.White
                            )
                        }
                    }
                    IconButton(
                        onClick = { viewModel.selectTab(MainNavTab.CART) },
                        modifier = Modifier.testTag("top_cart_btn")
                    ) {
                        BadgedBox(
                            badge = {
                                if (cartCount > 0) {
                                    Badge(
                                        containerColor = AmberAccent,
                                        contentColor = DeepIndigo
                                    ) {
                                        Text("$cartCount", fontWeight = FontWeight.Bold)
                                    }
                                }
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Default.ShoppingCart,
                                contentDescription = "Cart",
                                tint = Color.White
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = DeepIndigo,
                    titleContentColor = Color.White
                )
            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.surface,
                tonalElevation = 8.dp
            ) {
                NavigationBarItem(
                    selected = activeTab == MainNavTab.HOME,
                    onClick = { viewModel.selectTab(MainNavTab.HOME) },
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = DeepIndigo,
                        indicatorColor = DeepIndigo.copy(alpha = 0.15f)
                    ),
                    modifier = Modifier.testTag("nav_home")
                )
                NavigationBarItem(
                    selected = activeTab == MainNavTab.CATALOG,
                    onClick = { viewModel.selectTab(MainNavTab.CATALOG) },
                    icon = { Icon(Icons.Default.Storefront, contentDescription = "Shop") },
                    label = { Text("Shop") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = DeepIndigo,
                        indicatorColor = DeepIndigo.copy(alpha = 0.15f)
                    ),
                    modifier = Modifier.testTag("nav_catalog")
                )
                NavigationBarItem(
                    selected = activeTab == MainNavTab.SERVICES,
                    onClick = { viewModel.selectTab(MainNavTab.SERVICES) },
                    icon = { Icon(Icons.Default.MiscellaneousServices, contentDescription = "Services") },
                    label = { Text("Services") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = DeepIndigo,
                        indicatorColor = DeepIndigo.copy(alpha = 0.15f)
                    ),
                    modifier = Modifier.testTag("nav_services")
                )
                NavigationBarItem(
                    selected = activeTab == MainNavTab.CART,
                    onClick = { viewModel.selectTab(MainNavTab.CART) },
                    icon = {
                        BadgedBox(
                            badge = {
                                if (cartCount > 0) {
                                    Badge(
                                        containerColor = AmberAccent,
                                        contentColor = DeepIndigo
                                    ) {
                                        Text("$cartCount", fontWeight = FontWeight.Bold)
                                    }
                                }
                            }
                        ) {
                            Icon(Icons.Default.ShoppingCart, contentDescription = "Cart")
                        }
                    },
                    label = { Text("Cart") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = DeepIndigo,
                        indicatorColor = DeepIndigo.copy(alpha = 0.15f)
                    ),
                    modifier = Modifier.testTag("nav_cart")
                )
                NavigationBarItem(
                    selected = activeTab == MainNavTab.ABOUT,
                    onClick = { viewModel.selectTab(MainNavTab.ABOUT) },
                    icon = { Icon(Icons.Default.Info, contentDescription = "About") },
                    label = { Text("About") },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = DeepIndigo,
                        indicatorColor = DeepIndigo.copy(alpha = 0.15f)
                    ),
                    modifier = Modifier.testTag("nav_about")
                )
            }
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            when (activeTab) {
                MainNavTab.HOME -> HomeScreen(
                    bannerImages = viewModel.bannerImages,
                    featuredProducts = filteredProducts,
                    wishlist = wishlist,
                    onProductClick = { viewModel.selectProduct(it) },
                    onAddToCart = { viewModel.addToCart(it) },
                    onToggleWishlist = { viewModel.toggleWishlist(it) },
                    onNavigateTab = { viewModel.selectTab(it) },
                    onSelectDepartment = { viewModel.selectDepartment(it) }
                )
                MainNavTab.CATALOG -> CatalogScreen(
                    products = filteredProducts,
                    searchQuery = searchQuery,
                    selectedDepartment = selectedDepartment,
                    selectedCategory = selectedCategory,
                    wishlist = wishlist,
                    onSearchQueryChanged = { viewModel.onSearchQueryChanged(it) },
                    onDepartmentSelected = { viewModel.selectDepartment(it) },
                    onCategorySelected = { viewModel.selectCategory(it) },
                    onProductClick = { viewModel.selectProduct(it) },
                    onAddToCart = { viewModel.addToCart(it) },
                    onToggleWishlist = { viewModel.toggleWishlist(it) }
                )
                MainNavTab.SERVICES -> ServicesScreen(
                    simPlans = viewModel.simPlans,
                    licPlans = viewModel.licPlans,
                    bankingServices = viewModel.bankingServices,
                    onSubmitInquiry = { cat, name, phone, details ->
                        viewModel.submitServiceInquiry(cat, name, phone, details)
                    }
                )
                MainNavTab.CART -> CartScreen(
                    cartItems = cartItems,
                    totalPrice = cartTotal,
                    onUpdateQuantity = { id, delta -> viewModel.updateCartQuantity(id, delta) },
                    onRemoveItem = { id -> viewModel.removeFromCart(id) },
                    onPlaceOrder = { name, phone, addr, payMethod ->
                        viewModel.placeOrder(name, phone, addr, payMethod)
                    },
                    onStartShopping = { viewModel.selectTab(MainNavTab.CATALOG) }
                )
                MainNavTab.ABOUT -> StoreInfoScreen()
            }
        }
    }

    // Product Detail Bottom Sheet
    selectedProduct?.let { product ->
        ProductDetailBottomSheet(
            product = product,
            onDismiss = { viewModel.selectProduct(null) },
            onAddToCart = { prod, qty -> viewModel.addToCart(prod, qty) }
        )
    }

    // Order Success Dialog
    orderPlacedMsg?.let { message ->
        AlertDialog(
            onDismissRequest = { viewModel.dismissOrderDialog() },
            title = { Text("Order Confirmed!", fontWeight = FontWeight.Bold) },
            text = { Text(message) },
            confirmButton = {
                TextButton(onClick = { viewModel.dismissOrderDialog() }) {
                    Text("OK")
                }
            }
        )
    }

    // Inquiry Success Dialog
    inquirySuccessMsg?.let { message ->
        AlertDialog(
            onDismissRequest = { viewModel.dismissInquiryDialog() },
            title = { Text("Inquiry Submitted", fontWeight = FontWeight.Bold) },
            text = { Text(message) },
            confirmButton = {
                TextButton(onClick = { viewModel.dismissInquiryDialog() }) {
                    Text("Great!")
                }
            }
        )
    }
}
