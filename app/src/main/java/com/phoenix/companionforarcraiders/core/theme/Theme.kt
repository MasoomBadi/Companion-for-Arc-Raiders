package com.phoenix.companionforarcraiders.core.theme

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

/**
 * Arc Raiders Dark Color Scheme
 * Inspired by the game's warm, post-apocalyptic aesthetic
 * Following Material 3 Expressive Design guidelines
 */
private val ArcRaidersDarkColorScheme = darkColorScheme(
    // Primary colors - Warm tan/beige
    primary = ArcPrimary,
    onPrimary = ArcOnPrimary,
    primaryContainer = ArcPrimaryVariant,
    onPrimaryContainer = ArcOnBackground,

    // Secondary colors - Bronze
    secondary = ArcSecondary,
    onSecondary = ArcOnSecondary,
    secondaryContainer = ArcSecondaryVariant,
    onSecondaryContainer = ArcOnBackground,

    // Tertiary colors - Copper glow
    tertiary = ArcTertiary,
    onTertiary = ArcOnTertiary,
    tertiaryContainer = ArcTertiaryVariant,
    onTertiaryContainer = ArcOnBackground,

    // Background & Surface
    background = ArcBackground,
    onBackground = ArcOnBackground,
    surface = ArcSurface,
    onSurface = ArcOnSurface,
    surfaceVariant = ArcSurfaceVariant,
    onSurfaceVariant = ArcOnSurfaceVariant,

    // Surface containers - Material 3 elevation system
    surfaceContainerLowest = ArcSurfaceContainerLowest,
    surfaceContainerLow = ArcSurfaceContainerLow,
    surfaceContainer = ArcSurfaceContainer,
    surfaceContainerHigh = ArcSurfaceContainerHigh,
    surfaceContainerHighest = ArcSurfaceContainerHighest,

    // Inverse colors
    inverseSurface = ArcInverseSurface,
    inverseOnSurface = ArcInverseOnSurface,
    inversePrimary = ArcInversePrimary,

    // Outline
    outline = ArcOutline,
    outlineVariant = ArcOutlineVariant,

    // Scrim
    scrim = ArcScrim,

    // Error colors
    error = ArcError,
    onError = ArcOnError,
    errorContainer = ArcErrorContainer,
    onErrorContainer = ArcOnErrorContainer
)

/**
 * Main theme composable for Companion for Arc Raiders
 *
 * Always uses dark theme with Arc Raiders brand colors
 * No light theme or dynamic colors - maintains consistent game aesthetic
 *
 * Features:
 * - Warm, post-apocalyptic color palette (#ECE2D0 inspired)
 * - Poppins font family for clean, modern typography
 * - Material 3 Expressive Design guidelines
 * - Edge-to-edge display with proper system bar theming
 *
 * @param content The composable content to be themed
 */
@Composable
fun CompanionForArcRaidersTheme(
    content: @Composable () -> Unit
) {
    val colorScheme = ArcRaidersDarkColorScheme

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            // Set system bar appearance (dark icons for light bars, light icons for dark bars)
            // Note: statusBarColor and navigationBarColor are deprecated.
            // Use enableEdgeToEdge() in MainActivity instead for proper edge-to-edge support
            WindowCompat.getInsetsController(window, view)?.apply {
                isAppearanceLightStatusBars = false
                isAppearanceLightNavigationBars = false
            }
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}