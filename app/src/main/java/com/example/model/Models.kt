package com.example.model

enum class Department(val title: String) {
    ALL("All Products"),
    ELECTRONICS("Mobility & Electronics"),
    FASHION("Ideal Fashion House"),
    SIM_OFFERS("SIM Offers & Plans"),
    LIC("LIC Life Protection"),
    BANKING("Online & Banking")
}

enum class ProductCategory(val label: String, val department: Department) {
    ALL("Show all", Department.ALL),
    MOBILE("Mobiles", Department.ELECTRONICS),
    EARPHONE("Earphones", Department.ELECTRONICS),
    SPEAKERS("Bluetooth Speakers", Department.ELECTRONICS),
    CHARGER_CABLE("Chargers & Cable", Department.ELECTRONICS),
    BATTERY("Battery", Department.ELECTRONICS),
    SCREEN_PROTECTOR("Screen Protector", Department.ELECTRONICS),
    COVERS("Back Cover", Department.ELECTRONICS),
    DISPLAY("Display", Department.ELECTRONICS),
    MEMORY("Memory Card & Pendrive", Department.ELECTRONICS),
    KIDS("Kid's Wear", Department.FASHION),
    WOMEN("Women's Wear", Department.FASHION),
    MEN("Men's Wear", Department.FASHION)
}

data class Product(
    val id: String,
    val name: String,
    val price: Double,
    val originalPrice: Double,
    val department: Department,
    val category: ProductCategory,
    val info: String,
    val imageAssetPath: String,
    val rating: Float = 4.5f,
    val ratingCount: Int = 120,
    val vyaparUrl: String = "https://vyaparapp.in/store/idealeworld",
    val inStock: Boolean = true,
    val description: String = ""
)

data class CartItem(
    val product: Product,
    val quantity: Int
)

data class SimPlan(
    val operator: String,
    val planName: String,
    val price: String,
    val validity: String,
    val data: String,
    val calls: String,
    val benefits: String
)

data class LicPlan(
    val title: String,
    val planNo: String,
    val minSumAssured: String,
    val minAge: String,
    val maxAge: String,
    val highlights: List<String>,
    val description: String
)

data class BankingService(
    val id: String,
    val title: String,
    val category: String,
    val description: String,
    val fee: String,
    val requirements: List<String>
)

data class ServiceInquiry(
    val id: String,
    val serviceCategory: String,
    val customerName: String,
    val phone: String,
    val details: String,
    val timestamp: Long = System.currentTimeMillis()
)
