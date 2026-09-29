package com.example.data

import com.example.model.BankingService
import com.example.model.Department
import com.example.model.LicPlan
import com.example.model.Product
import com.example.model.ProductCategory
import com.example.model.SimPlan

object CatalogRepository {

    val bannerImages = listOf(
        "image/mobility/download (3).jpeg",
        "image/mobility/cloths/hq720.jpg",
        "image/mobility/cloths/istockphoto-901409596-612x612.jpg",
        "image/mobility/cloths/Zara_Full_27830.jpg",
        "image/mobility/moto e13.jpeg",
        "image/mobility/BOAT AIR.jpeg",
        "image/mobility/MEMORY CARDS/32GB.jpeg",
        "image/lic/images.jpeg",
        "image/mobility/LIC/download (2).jpeg",
        "image/mobility/LIC/download.jpeg",
        "image/mobility/LIC/download.png",
        "image/mobility/LIC/images.jpeg",
        "image/mobility/DRUGS/DRUG1.jpg"
    )

    val products = listOf(
        Product(
            id = "cl_1",
            name = "Vest For Boys Cotton Blend  (White)",
            price = 50.0,
            originalPrice = 62.5,
            department = Department.FASHION,
            category = ProductCategory.KIDS,
            info = "2 days replace available",
            imageAssetPath = "image/fassion house/sando ganji.webp",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/65",
            description = "Premium quality clothing item from Ideal Fashion House. 2 days replace available"
        ),
        Product(
            id = "cl_2",
            name = "Khadi Rumal  (White)",
            price = 20.0,
            originalPrice = 25.0,
            department = Department.FASHION,
            category = ProductCategory.MEN,
            info = "replace Not available",
            imageAssetPath = "image/fassion house/khadi rumal",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/144",
            description = "Premium quality clothing item from Ideal Fashion House. replace Not available"
        ),
        Product(
            id = "cl_3",
            name = "Milky Baby Dress",
            price = 100.0,
            originalPrice = 125.0,
            department = Department.FASHION,
            category = ProductCategory.KIDS,
            info = "2 days replace available",
            imageAssetPath = "image/fassion house/milk baby dress.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/",
            description = "Premium quality clothing item from Ideal Fashion House. 2 days replace available"
        ),
        Product(
            id = "cl_4",
            name = "leggings",
            price = 100.0,
            originalPrice = 125.0,
            department = Department.FASHION,
            category = ProductCategory.MEN,
            info = "2 days replace available",
            imageAssetPath = "image/fassion house/leggings.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/66",
            description = "Premium quality clothing item from Ideal Fashion House. 2 days replace available"
        ),
        Product(
            id = "cl_5",
            name = "Saree Only For 500.00/Pcs",
            price = 500.0,
            originalPrice = 625.0,
            department = Department.FASHION,
            category = ProductCategory.MEN,
            info = "2 days replace available",
            imageAssetPath = "image/fassion house/saree@500.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/69",
            description = "Premium quality clothing item from Ideal Fashion House. 2 days replace available"
        ),
        Product(
            id = "cl_6",
            name = "Saree Only For 350.00/Pcs",
            price = 350.0,
            originalPrice = 437.5,
            department = Department.FASHION,
            category = ProductCategory.MEN,
            info = "2 days replace available",
            imageAssetPath = "image/fassion house/saree@350.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/68",
            description = "Premium quality clothing item from Ideal Fashion House. 2 days replace available"
        ),
        Product(
            id = "cl_7",
            name = "Saree Only For 300.00/Pcs",
            price = 300.0,
            originalPrice = 375.0,
            department = Department.FASHION,
            category = ProductCategory.MEN,
            info = "2 days replace available",
            imageAssetPath = "image/fassion house/saree@300.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/67",
            description = "Premium quality clothing item from Ideal Fashion House. 2 days replace available"
        ),
        Product(
            id = "cl_8",
            name = "Saree Only For 200.00/Pcs",
            price = 200.0,
            originalPrice = 250.0,
            department = Department.FASHION,
            category = ProductCategory.MEN,
            info = "2 days replace available",
            imageAssetPath = "image/fassion house/saree@200.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/70",
            description = "Premium quality clothing item from Ideal Fashion House. 2 days replace available"
        ),
        Product(
            id = "cl_9",
            name = "KURTI",
            price = 250.0,
            originalPrice = 312.5,
            department = Department.FASHION,
            category = ProductCategory.MEN,
            info = "2 days replace available",
            imageAssetPath = "image/fassion house/churidar (1).jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/",
            description = "Premium quality clothing item from Ideal Fashion House. 2 days replace available"
        ),
        Product(
            id = "cl_10",
            name = "KURTI",
            price = 250.0,
            originalPrice = 312.5,
            department = Department.FASHION,
            category = ProductCategory.MEN,
            info = "2 days replace available",
            imageAssetPath = "image/fassion house/churidar (2).jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/",
            description = "Premium quality clothing item from Ideal Fashion House. 2 days replace available"
        ),
        Product(
            id = "cl_11",
            name = "KURTI",
            price = 350.0,
            originalPrice = 437.5,
            department = Department.FASHION,
            category = ProductCategory.MEN,
            info = "2 days replace available",
            imageAssetPath = "image/fassion house/churidar (3).jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/",
            description = "Premium quality clothing item from Ideal Fashion House. 2 days replace available"
        ),
        Product(
            id = "cl_12",
            name = "KURTI",
            price = 250.0,
            originalPrice = 312.5,
            department = Department.FASHION,
            category = ProductCategory.MEN,
            info = "2 days replace available",
            imageAssetPath = "image/fassion house/churidar (4).jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/",
            description = "Premium quality clothing item from Ideal Fashion House. 2 days replace available"
        ),
        Product(
            id = "cl_13",
            name = "JEANS",
            price = 500.0,
            originalPrice = 625.0,
            department = Department.FASHION,
            category = ProductCategory.MEN,
            info = "2 days replace available",
            imageAssetPath = "image/fassion house/jens1.webp",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/",
            description = "Premium quality clothing item from Ideal Fashion House. 2 days replace available"
        ),
        Product(
            id = "cl_14",
            name = "JEANS",
            price = 250.0,
            originalPrice = 312.5,
            department = Department.FASHION,
            category = ProductCategory.MEN,
            info = "2 days replace available",
            imageAssetPath = "image/fassion house/jens2.webp",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/",
            description = "Premium quality clothing item from Ideal Fashion House. 2 days replace available"
        ),
        Product(
            id = "mob_1",
            name = "BL 5C Battery[ERD]",
            price = 230.0,
            originalPrice = 287.5,
            department = Department.ELECTRONICS,
            category = ProductCategory.BATTERY,
            info = "6 Months Warenty available for this item",
            imageAssetPath = "image/mobility/BATTERY/ERD BL5C.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/7",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 6 Months Warenty available for this item"
        ),
        Product(
            id = "mob_2",
            name = "ULOVE Chilli 3 Wireless Headphone",
            price = 600.0,
            originalPrice = 750.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.BATTERY,
            info = "6 Months Warenty available for this item",
            imageAssetPath = "image/mobility/earphone/ulove chilli 3.webp",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/23",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 6 Months Warenty available for this item"
        ),
        Product(
            id = "mob_3",
            name = "BLUEFIRE CHOTA BOMB LED SPEAKER",
            price = 330.0,
            originalPrice = 412.5,
            department = Department.ELECTRONICS,
            category = ProductCategory.SPEAKERS,
            info = "4 Days replace/return available",
            imageAssetPath = "image/mobility/speaker/bluefire chota bomb.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/74",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 4 Days replace/return available"
        ),
        Product(
            id = "mob_4",
            name = "Morebyte 32gb 2.0 USB Pen Drive/Flash Drive with Metal Body External Storage Device Silver",
            price = 330.0,
            originalPrice = 412.5,
            department = Department.ELECTRONICS,
            category = ProductCategory.MEMORY,
            info = "2 Years garranty available",
            imageAssetPath = "image/mobility/MEMORY CARDS/32 PENDRIVE.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/75",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 2 Years garranty available"
        ),
        Product(
            id = "mob_5",
            name = "Finger Sleeve Game Controller for PUBG, Free Fire - 1 Pair",
            price = 20.0,
            originalPrice = 25.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.MEMORY,
            info = "Repalce or Return Not available",
            imageAssetPath = "image/mobility/finger glubs.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/75",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. Repalce or Return Not available"
        ),
        Product(
            id = "mob_6",
            name = "Smart Watch Band Strap",
            price = 20.0,
            originalPrice = 25.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.MEMORY,
            info = "3 Days Repalce or Return available",
            imageAssetPath = "image/mobility/watch belt.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/75",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 3 Days Repalce or Return available"
        ),
        Product(
            id = "mob_7",
            name = "FLIP/DIARY COVER",
            price = 150.0,
            originalPrice = 187.5,
            department = Department.ELECTRONICS,
            category = ProductCategory.COVERS,
            info = "4 Days replace/return available",
            imageAssetPath = "image/mobility/back cover/flip cover.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 4 Days replace/return available"
        ),
        Product(
            id = "mob_8",
            name = "TRANSPARENT HARD COVER",
            price = 150.0,
            originalPrice = 187.5,
            department = Department.ELECTRONICS,
            category = ProductCategory.COVERS,
            info = "4 Days replace/return available",
            imageAssetPath = "image/mobility/back cover/transferent hard cover.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 4 Days replace/return available"
        ),
        Product(
            id = "mob_9",
            name = "TRANSPARENT SILICON BACK COVER",
            price = 100.0,
            originalPrice = 125.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.COVERS,
            info = "4 Days replace/return available",
            imageAssetPath = "image/mobility/back cover/transferent cover.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 4 Days replace/return available"
        ),
        Product(
            id = "mob_10",
            name = "COLORING SILICON COVER",
            price = 120.0,
            originalPrice = 150.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.COVERS,
            info = "4 Days replace/return available",
            imageAssetPath = "image/mobility/back cover/silicon cover.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 4 Days replace/return available"
        ),
        Product(
            id = "mob_11",
            name = "CROME COVER",
            price = 120.0,
            originalPrice = 150.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.COVERS,
            info = "4 Days replace/return available",
            imageAssetPath = "image/mobility/back cover/crome cover.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 4 Days replace/return available"
        ),
        Product(
            id = "mob_12",
            name = "CD COVER",
            price = 120.0,
            originalPrice = 150.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.COVERS,
            info = "4 Days replace/return available",
            imageAssetPath = "image/mobility/back cover/cd cover.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 4 Days replace/return available"
        ),
        Product(
            id = "mob_13",
            name = "OG GLASS",
            price = 100.0,
            originalPrice = 125.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.SCREEN_PROTECTOR,
            info = "BEST SCREEN PROTECTOR & FULLY COVERED ON YOUR MOBILE DISPLY",
            imageAssetPath = "image/mobility/screen protector/og glass.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. BEST SCREEN PROTECTOR & FULLY COVERED ON YOUR MOBILE DISPLY"
        ),
        Product(
            id = "mob_14",
            name = "NORMAL SCREEN PROTECTOR",
            price = 60.0,
            originalPrice = 75.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.SCREEN_PROTECTOR,
            info = "NORMAL SCREEN PROTECTION SLIM GLASS",
            imageAssetPath = "image/mobility/screen protector/normal.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. NORMAL SCREEN PROTECTION SLIM GLASS"
        ),
        Product(
            id = "mob_15",
            name = "BL 5C Battery[ALFA INT]",
            price = 230.0,
            originalPrice = 287.5,
            department = Department.ELECTRONICS,
            category = ProductCategory.BATTERY,
            info = "6 Months Warenty available for this item",
            imageAssetPath = "image/mobility/BATTERY/ALFA 5C.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/8",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 6 Months Warenty available for this item"
        ),
        Product(
            id = "mob_16",
            name = "Nokia 106",
            price = 1600.0,
            originalPrice = 2000.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.MOBILE,
            info = "1 year Warenty available for this item",
            imageAssetPath = "image/mobility/nokia 106.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/39",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 1 year Warenty available for this item"
        ),
        Product(
            id = "mob_17",
            name = "Karbonn Bharat k1[4g]-Jio Phone",
            price = 1000.0,
            originalPrice = 1250.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.MOBILE,
            info = "1 year Warenty available for this item",
            imageAssetPath = "image/mobility/jio phone.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/40",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 1 year Warenty available for this item"
        ),
        Product(
            id = "mob_18",
            name = "Moto E13 4/64",
            price = 7000.0,
            originalPrice = 8750.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.MOBILE,
            info = "1 year Warenty available for this item",
            imageAssetPath = "image/mobility/moto e13.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/41",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 1 year Warenty available for this item"
        ),
        Product(
            id = "mob_19",
            name = "AMAQ Q2",
            price = 1000.0,
            originalPrice = 1250.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.MOBILE,
            info = "1 year Warenty available for this item",
            imageAssetPath = "image/mobility/amaq2.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/15",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 1 year Warenty available for this item"
        ),
        Product(
            id = "mob_20",
            name = "J5/J2PRO/J3 BATTERY [ERD]",
            price = 400.0,
            originalPrice = 500.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.BATTERY,
            info = "6 Months Garranty available for this item",
            imageAssetPath = "image/mobility/BATTERY/ERD J5.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/21",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 6 Months Garranty available for this item"
        ),
        Product(
            id = "mob_21",
            name = "MI Type C ORIGINAL CABLE",
            price = 200.0,
            originalPrice = 250.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.CHARGER_CABLE,
            info = "4 Days Replace / Return available",
            imageAssetPath = "image/mobility/WhatsApp Image 2023-11-01 at 13.11.21.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/34",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 4 Days Replace / Return available"
        ),
        Product(
            id = "mob_22",
            name = "Efiniya E01 Earphone",
            price = 200.0,
            originalPrice = 250.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.EARPHONE,
            info = "4 Days Replace / Return available",
            imageAssetPath = "image/mobility/db93ce6a-21ad-4199-920d-21526fcdef0c.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/9",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 4 Days Replace / Return available"
        ),
        Product(
            id = "mob_23",
            name = "4 GB MEMORY CARD",
            price = 200.0,
            originalPrice = 250.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.MEMORY,
            info = "6 Months Garranty available for this item",
            imageAssetPath = "image/mobility/MEMORY CARDS/4GB.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/35",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 6 Months Garranty available for this item"
        ),
        Product(
            id = "mob_24",
            name = "8 GB MEMORY CARD",
            price = 250.0,
            originalPrice = 312.5,
            department = Department.ELECTRONICS,
            category = ProductCategory.MEMORY,
            info = "2 YEAR Garranty available for this item",
            imageAssetPath = "image/mobility/MEMORY CARDS/8GB.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/37",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 2 YEAR Garranty available for this item"
        ),
        Product(
            id = "mob_25",
            name = "16 GB MEMORY CARD",
            price = 300.0,
            originalPrice = 375.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.MEMORY,
            info = "2 YEAR Garranty available for this item",
            imageAssetPath = "image/mobility/MEMORY CARDS/16GB.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/36",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 2 YEAR Garranty available for this item"
        ),
        Product(
            id = "mob_26",
            name = "32 GB MEMORY CARD",
            price = 350.0,
            originalPrice = 437.5,
            department = Department.ELECTRONICS,
            category = ProductCategory.MEMORY,
            info = "2 YEAR Garranty available for this item",
            imageAssetPath = "image/mobility/MEMORY CARDS/32GB.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/20",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 2 YEAR Garranty available for this item"
        ),
        Product(
            id = "mob_27",
            name = "64 GB MEMORY CARD",
            price = 450.0,
            originalPrice = 562.5,
            department = Department.ELECTRONICS,
            category = ProductCategory.MEMORY,
            info = "2 YEAR Garranty available for this item",
            imageAssetPath = "image/mobility/MEMORY CARDS/64GB.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/19",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 2 YEAR Garranty available for this item"
        ),
        Product(
            id = "mob_28",
            name = "128 GB MEMORY CARD",
            price = 700.0,
            originalPrice = 875.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.MEMORY,
            info = "2 YEAR Garranty available for this item",
            imageAssetPath = "image/mobility/MEMORY CARDS/128GB.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/38",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 2 YEAR Garranty available for this item"
        ),
        Product(
            id = "mob_29",
            name = "U&i Web Series Wired Gaming Earphone with Adjustable Mic Wired Gaming Headset  (Red2, In the Ear)",
            price = 370.0,
            originalPrice = 462.5,
            department = Department.ELECTRONICS,
            category = ProductCategory.EARPHONE,
            info = "4 days replace/return available",
            imageAssetPath = "image/mobility/download (1).jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/64",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 4 days replace/return available"
        ),
        Product(
            id = "mob_30",
            name = "Jio Phone Battery",
            price = 230.0,
            originalPrice = 287.5,
            department = Department.ELECTRONICS,
            category = ProductCategory.MOBILE,
            info = "6 months Garranty available for this item",
            imageAssetPath = "image/mobility/download.jpeg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/63",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 6 months Garranty available for this item"
        ),
        Product(
            id = "mob_31",
            name = "USB JIO CHARGER",
            price = 130.0,
            originalPrice = 162.5,
            department = Department.ELECTRONICS,
            category = ProductCategory.MOBILE,
            info = "6 months Garranty available for this item",
            imageAssetPath = "image/mobility/earphone/usb jio charger.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/60",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 6 months Garranty available for this item"
        ),
        Product(
            id = "mob_32",
            name = "OUD PARTY BLUETOOTH EARPHONE",
            price = 500.0,
            originalPrice = 625.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.MOBILE,
            info = "4 days replace/return available",
            imageAssetPath = "image/mobility/earphone/oud bluetooth @500.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/62",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 4 days replace/return available"
        ),
        Product(
            id = "mob_33",
            name = "2.4 MICRO CABLE (BOLT)",
            price = 100.0,
            originalPrice = 125.0,
            department = Department.ELECTRONICS,
            category = ProductCategory.MOBILE,
            info = "6 months Garranty available for this item",
            imageAssetPath = "image/mobility/earphone/bolt 2.4 micro cable.jpg",
            vyaparUrl = "https://vyaparapp.in/store/idealeworld/61",
            description = "Authentic mobility and electronics accessory from Ideal-e-World. 6 months Garranty available for this item"
        )
    )

    val simPlans = listOf(
        SimPlan(
            operator = "Jio",
            planName = "True 5G Unlimited",
            price = "₹299",
            validity = "28 Days",
            data = "2 GB / Day (Unlimited 5G)",
            calls = "Unlimited Calls",
            benefits = "Free JioTV, JioCinema, JioCloud"
        ),
        SimPlan(
            operator = "Airtel",
            planName = "Truly Unlimited 5G",
            price = "₹349",
            validity = "28 Days",
            data = "1.5 GB / Day + 5G Unlimited",
            calls = "Unlimited Calls + 100 SMS/day",
            benefits = "Apollo 24|7, Free Hellotunes, Wynk Music"
        ),
        SimPlan(
            operator = "Vi",
            planName = "Hero Unlimited Hero",
            price = "₹299",
            validity = "28 Days",
            data = "1.5 GB / Day + Binge All Night",
            calls = "Unlimited Calls",
            benefits = "Weekend Data Rollover + Vi Movies & TV"
        ),
        SimPlan(
            operator = "BSNL",
            planName = "Voice & Super Data",
            price = "₹199",
            validity = "30 Days",
            data = "2 GB / Day",
            calls = "Unlimited Voice",
            benefits = "National Roaming Free + 100 SMS/day"
        ),
        SimPlan(
            operator = "Jio",
            planName = "Quarterly Value Pack",
            price = "₹749",
            validity = "72 Days",
            data = "2 GB / Day (5G Included)",
            calls = "Unlimited Local/STD",
            benefits = "Full suite of Jio apps subscription"
        ),
        SimPlan(
            operator = "Airtel",
            planName = "Annual Mega Pack",
            price = "₹1999",
            validity = "365 Days",
            data = "24 GB Total + 5G Boost",
            calls = "Unlimited Calls 1 Year",
            benefits = "Year-long validity without frequent recharge"
        )
    )

    val licPlans = listOf(
        LicPlan(
            title = "LIC Jeevan Pragati",
            planNo = "Plan 838",
            minSumAssured = "₹1,50,000",
            minAge = "12 Years",
            maxAge = "45 Years",
            highlights = listOf(
                "Sum Assured automatically increases every 5 years",
                "Combination of savings and financial protection",
                "Loan facility available after 3 continuous years",
                "Optional Accidental Death and Disability Benefit Rider"
            ),
            description = "A non-linked, with-profits, endowment assurance plan where the risk cover increases every 5 years during policy term, giving higher security as financial needs expand."
        ),
        LicPlan(
            title = "LIC Jeevan Labh",
            planNo = "Plan 936",
            minSumAssured = "₹2,00,000",
            minAge = "8 Years",
            maxAge = "59 Years",
            highlights = listOf(
                "Limited premium paying endowment plan",
                "High return with bonus additions",
                "Ideal for child education and marriage planning",
                "Tax exemption under Section 80C & 10(10D)"
            ),
            description = "Offers protection and savings together. You pay premium for a limited period and enjoy long-term maturity benefits along with simple reversionary bonuses."
        ),
        LicPlan(
            title = "LIC Tech-Term & New Jeevan Amar",
            planNo = "Plan 854/855",
            minSumAssured = "₹50,00,000",
            minAge = "18 Years",
            maxAge = "65 Years",
            highlights = listOf(
                "Pure protection term assurance plan",
                "Lowest premium rate for high financial cover",
                "Flexibility of choosing Level or Increasing Sum Assured",
                "Special discount rates for non-smokers and women"
            ),
            description = "Comprehensive financial shield for your family in your absence. Pure term insurance offering high sum assured with affordable premium rates."
        )
    )

    val bankingServices = listOf(
        BankingService(
            id = "bk_1",
            title = "Aadhaar ATM & AEPS Cash Withdrawal",
            category = "Cash & Banking",
            description = "Withdraw cash instantly from any bank account using your Aadhaar number and biometric fingerprint without needing a debit card.",
            fee = "Free / Nominal",
            requirements = listOf("Aadhaar Number", "Bank linked with Aadhaar", "Fingerprint verification")
        ),
        BankingService(
            id = "bk_2",
            title = "Domestic Money Transfer (DMT)",
            category = "Fund Transfer",
            description = "Instant IMPS/NEFT fund transfer to any bank in India 24x7 with immediate SMS confirmation to sender and receiver.",
            fee = "Starting from ₹10",
            requirements = listOf("Beneficiary Account Number", "IFSC Code", "Sender Mobile Number")
        ),
        BankingService(
            id = "bk_3",
            title = "Mini ATM / Micro ATM Card Swipe",
            category = "Cash & Banking",
            description = "Cash withdrawal and balance check using Rupay, Visa, or Mastercard Debit Cards with instant printed slip receipt.",
            fee = "Free",
            requirements = listOf("Active Debit Card", "Card PIN")
        ),
        BankingService(
            id = "bk_4",
            title = "PAN Card Application & Correction",
            category = "Government & Identity",
            description = "New NSDL/UTI PAN card registration, photo/signature update, address correction, and instant e-PAN generation within 2 hours.",
            fee = "₹107 Govt + Nominal assist",
            requirements = listOf("Aadhaar Card", "2 Passport size photos", "Mobile linked for OTP")
        ),
        BankingService(
            id = "bk_5",
            title = "Utility Bill & Mobile / DTH Recharge",
            category = "Bill Payments",
            description = "BBPS authorized bill payment center for Electricity, Water, Gas, FASTag, Landline, Mobile Postpaid, and DTH recharges.",
            fee = "Free / Zero surcharge",
            requirements = listOf("Consumer ID / Bill Number", "Customer Mobile Number")
        ),
        BankingService(
            id = "bk_6",
            title = "Online Certificates & Govt Portals",
            category = "Citizen Services",
            description = "Online application for Income Certificate, Caste Certificate, Resident Certificate, Ration Card update, and Voter ID.",
            fee = "As per state portal",
            requirements = listOf("Aadhaar Card", "Address Proof", "Relevant family documents")
        )
    )
}
