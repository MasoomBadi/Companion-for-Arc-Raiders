package com.phoenix.companionforarcraiders.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

/**
 * Arc Raiders Light Color Scheme
 * Warm, inviting palette inspired by the game's post-apocalyptic beige aesthetic
 * Following Material 3 Expressive Design guidelines
 */
private val ArcRaidersLightColorScheme = lightColorScheme(
    // Primary colors - Warm sandstone
    primary = ArcSandstone,
    onPrimary = Color.White,
    primaryContainer = ArcBeigeLight,
    onPrimaryContainer = ArcTextLight,

    // Secondary colors - Earthy clay
    secondary = ArcClay,
    onSecondary = Color.White,
    secondaryContainer = ArcBeige,
    onSecondaryContainer = ArcTextLight,

    // Tertiary colors - Warm amber
    tertiary = ArcAmber,
    onTertiary = Color.White,
    tertiaryContainer = ArcBeigeLight,
    onTertiaryContainer = ArcTextLight,

    // Background & Surface
    background = ArcBgLight,
    onBackground = ArcTextLight,
    surface = ArcSurfaceLight,
    onSurface = ArcTextLight,
    surfaceVariant = ArcFog,
    onSurfaceVariant = ArcTextSecondaryLight,

    // Surface containers for elevated components
    surfaceContainer = ArcBeige,
    surfaceContainerHigh = ArcBeigeLight,
    surfaceContainerHighest = Color.White,
    surfaceContainerLow = ArcFog,
    surfaceContainerLowest = Color.White,

    // Inverse colors
    inverseSurface = ArcAsh,
    inverseOnSurface = ArcTextDark,
    inversePrimary = ArcTanDark,

    // Outline
    outline = ArcDust,
    outlineVariant = ArcBeigeDark,

    // Scrim
    scrim = Color.Black.copy(alpha = 0.32f),

    // Semantic colors
    error = ArcDanger,
    onError = Color.White,
    errorContainer = ArcDanger.copy(alpha = 0.12f),
    onErrorContainer = ArcDanger
)

/**
 * Arc Raiders Dark Color Scheme
 * Weathered, futuristic palette for dark mode
 * Maintains the warm aesthetic while providing contrast
 */
private val ArcRaidersDarkColorScheme = darkColorScheme(
    // Primary colors - Lighter tan for visibility
    primary = ArcTanDark,
    onPrimary = ArcAsh,
    primaryContainer = ArcSandstoneVariant,
    onPrimaryContainer = ArcBeigeLight,

    // Secondary colors - Bronze
    secondary = ArcBronze,
    onSecondary = ArcAsh,
    secondaryContainer = ArcClayVariant,
    onSecondaryContainer = ArcBeige,

    // Tertiary colors - Copper glow
    tertiary = ArcCopperGlow,
    onTertiary = ArcAsh,
    tertiaryContainer = ArcAmberVariant,
    onTertiaryContainer = ArcBeigeLight,

    // Background & Surface
    background = ArcBgDark,
    onBackground = ArcTextDark,
    surface = ArcSurfaceDark,
    onSurface = ArcTextDark,
    surfaceVariant = ArcSmoke,
    onSurfaceVariant = ArcTextSecondaryDark,

    // Surface containers for elevated components
    surfaceContainer = ArcSmoke,
    surfaceContainerHigh = ArcDust,
    surfaceContainerHighest = Color(0xFF655F58),
    surfaceContainerLow = ArcAsh,
    surfaceContainerLowest = ArcBgDark,

    // Inverse colors
    inverseSurface = ArcFog,
    inverseOnSurface = ArcTextLight,
    inversePrimary = ArcSandstone,

    // Outline
    outline = ArcDust,
    outlineVariant = ArcSmoke,

    // Scrim
    scrim = Color.Black.copy(alpha = 0.5f),

    // Semantic colors
    error = ArcDanger.copy(red = 0.8f, green = 0.4f, blue = 0.35f),
    onError = Color.White,
    errorContainer = ArcDanger.copy(alpha = 0.2f),
    onErrorContainer = ArcDanger.copy(red = 0.9f, green = 0.5f, blue = 0.45f)
)

/**
 * Main theme composable for Companion for Arc Raiders
 *
 * Features:
 * - Custom Arc Raiders color palette inspired by the game's warm, post-apocalyptic aesthetic
 * - Barlow font family matching the official website
 * - Material 3 Expressive Design guidelines
 * - Support for light/dark themes and dynamic colors
 * - Edge-to-edge display with proper system bar handling
 *
 * @param darkTheme Whether to use dark theme (defaults to system preference)
 * @param dynamicColor Whether to use dynamic colors on Android 12+ (defaults to false to maintain brand consistency)
 * @param content The composable content to be themed
 */
@Composable
fun CompanionForArcRaidersTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Disable dynamic color by default to maintain Arc Raiders brand identity
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> ArcRaidersDarkColorScheme
        else -> ArcRaidersLightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            window.navigationBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).apply {
                isAppearanceLightStatusBars = !darkTheme
                isAppearanceLightNavigationBars = !darkTheme
            }
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}