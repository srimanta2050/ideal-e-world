# Ideal-e-World (Android)

A modern Android application for **Ideal-e-World** ("ShoPperZ"), rewritten with Kotlin and Jetpack Compose. Ideal-e-World is an integrated retail hub offering mobile devices, electronics, traditional & modern apparel, telecom SIM services, LIC life insurance consultations, and Customer Service Point (CSP) online banking services.

## Features Ported & Re-architected

1. **Mobility & Electronics Catalog**:
   - Complete catalog of mobile accessories, mobile phones (Moto E13, Jio Phone, Nokia 106, AMAQ Q2), earphones (U&i, ULOVE Chilli, Efiniya), Bluetooth speakers, chargers, original fast cables, replacement batteries (Alfa, ERD), screen protectors (OG Glass), and memory cards/flash drives (4GB to 128GB).
   - Category filtering, instant search, warranty & replacement badges (2–4 days replacement, up to 2 years warranty).

2. **Ideal Fashion House**:
   - Apparel collection covering Women's Wear (Designer Sarees from ₹200 to ₹500, Kurtis/Churidar sets, Leggings, Jeans), Kid's Wear (Milky Baby Dresses, Cotton Vests), and Men's Wear (Khadi Rumal).
   - Direct integration link with Ideal-e-World's official Vyapar store.

3. **Mobile Connections & Offers**:
   - Operator coverage for Jio, Airtel, Vi, and BSNL.
   - Truly unlimited 5G plans, validity packs, data benefits, and entertainment inclusions.
   - Interactive New SIM activation and MNP porting request booking.

4. **LIC Life Protection**:
   - Life insurance policy portfolio (LIC Jeevan Pragati Plan 838, LIC Jeevan Labh Plan 936, LIC Tech-Term & New Jeevan Amar).
   - Policy highlights, eligibility, sum assured details, and free consultation request submission.

5. **Customer Service Point (CSP) & Banking Services**:
   - AEPS (Aadhaar ATM cash withdrawal & balance inquiry).
   - Domestic Money Transfer (DMT) across all banks in India.
   - Micro ATM debit card transactions.
   - NSDL/UTI PAN card registration and correction.
   - BBPS Utility bill payments & FASTag/DTH recharges.
   - Online government certificates application assistance.

6. **Cart & Checkout Experience**:
   - Add to cart, quantity adjustment, and item removal.
   - Price breakdown with free delivery calculations.
   - Direct WhatsApp order messaging with pre-formatted bill details, plus Cash on Delivery and UPI options.

7. **Store Information & Support**:
   - Operating hours (9:00 AM - 9:00 PM, 7 days a week), physical location, warranty policy, customer care, and social channels.

## Tech Stack

- **Platform**: Android (minSdk 26, targetSdk 36, compileSdk 36)
- **Language**: Kotlin 2.2 with Java 21
- **UI Toolkit**: Jetpack Compose with Material 3 Design
- **Architecture**: MVVM (ViewModel + StateFlow + Repository)
- **Image Loading**: Coil Compose with local Android asset rendering
- **Build System**: Gradle 9.3.1 with Android Gradle Plugin 9.1.1
