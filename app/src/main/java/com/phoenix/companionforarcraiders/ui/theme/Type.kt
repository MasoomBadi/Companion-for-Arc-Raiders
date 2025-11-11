package com.phoenix.companionforarcraiders.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.unit.sp
import com.phoenix.companionforarcraiders.R

// Configure Google Fonts provider
val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

// Barlow font family - matching Arc Raiders website aesthetic
val barlowFontName = GoogleFont("Barlow")
val barlowSemiCondensedFontName = GoogleFont("Barlow Semi Condensed")

val BarlowFontFamily = FontFamily(
    Font(googleFont = barlowFontName, fontProvider = provider, weight = FontWeight.Light),
    Font(googleFont = barlowFontName, fontProvider = provider, weight = FontWeight.Normal),
    Font(googleFont = barlowFontName, fontProvider = provider, weight = FontWeight.Medium),
    Font(googleFont = barlowFontName, fontProvider = provider, weight = FontWeight.SemiBold),
    Font(googleFont = barlowFontName, fontProvider = provider, weight = FontWeight.Bold),
    Font(googleFont = barlowFontName, fontProvider = provider, weight = FontWeight.ExtraBold)
)

val BarlowSemiCondensedFontFamily = FontFamily(
    Font(googleFont = barlowSemiCondensedFontName, fontProvider = provider, weight = FontWeight.Medium),
    Font(googleFont = barlowSemiCondensedFontName, fontProvider = provider, weight = FontWeight.SemiBold),
    Font(googleFont = barlowSemiCondensedFontName, fontProvider = provider, weight = FontWeight.Bold),
    Font(googleFont = barlowSemiCondensedFontName, fontProvider = provider, weight = FontWeight.ExtraBold)
)

// Material 3 Expressive Typography - Arc Raiders Edition
// Using Barlow for clean, professional, futuristic look
val Typography = Typography(
    // Display styles - Large, impactful text
    displayLarge = TextStyle(
        fontFamily = BarlowSemiCondensedFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp
    ),
    displayMedium = TextStyle(
        fontFamily = BarlowSemiCondensedFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 45.sp,
        lineHeight = 52.sp,
        letterSpacing = 0.sp
    ),
    displaySmall = TextStyle(
        fontFamily = BarlowSemiCondensedFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 36.sp,
        lineHeight = 44.sp,
        letterSpacing = 0.sp
    ),

    // Headline styles - Section headers
    headlineLarge = TextStyle(
        fontFamily = BarlowFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = BarlowFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = BarlowFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),

    // Title styles - Smaller headers
    titleLarge = TextStyle(
        fontFamily = BarlowFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = TextStyle(
        fontFamily = BarlowFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    titleSmall = TextStyle(
        fontFamily = BarlowFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),

    // Body styles - Regular content
    bodyLarge = TextStyle(
        fontFamily = BarlowFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = BarlowFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    bodySmall = TextStyle(
        fontFamily = BarlowFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    ),

    // Label styles - Buttons, tabs
    labelLarge = TextStyle(
        fontFamily = BarlowFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    labelMedium = TextStyle(
        fontFamily = BarlowFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    labelSmall = TextStyle(
        fontFamily = BarlowFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)