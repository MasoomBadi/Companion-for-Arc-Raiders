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
 * Arc Raiders Cyberpunk Color Scheme
 * Futuristic neon aesthetic with vibrant electric accents
 * Following Material 3 Expressive Design guidelines
 */
private val ArcRaidersCyberpunkColorScheme = darkColorScheme(
    // Primary colors - Neon Teal
    primary = ArcPrimary,
    onPrimary = ArcOnPrimary,
    primaryContainer = ArcPrimaryVariant,
    onPrimaryContainer = ArcTextPrimary,

    // Secondary colors - Magenta Highlight
    secondary = ArcSecondary,
    onSecondary = ArcOnSecondary,
    secondaryContainer = ArcSecondaryVariant,
    onSecondaryContainer = ArcTextPrimary,

    // Tertiary colors - Neon Green
    tertiary = ArcTertiary,
    onTertiary = ArcOnTertiary,
    tertiaryContainer = ArcTertiaryVariant,
    onTertiaryContainer = ArcTextPrimary,

    // Background & Surface - Deep cosmic blue-black
    background = ArcBlack,
    onBackground = ArcTextPrimary,
    surface = ArcSurface,
    onSurface = ArcTextPrimary,
    surfaceVariant = ArcSurfaceVariant,
    onSurfaceVariant = ArcTextSecondary,

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

    // Outline - Subtle borders
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
 * Cyberpunk neon aesthetic with vibrant electric colors
 * No light theme or dynamic colors - maintains consistent futuristic aesthetic
 *
 * Features:
 * - Deep cosmic blue-black backgrounds (#0B0F19)
 * - Neon accent colors (teal, magenta, green)
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
    val colorScheme = ArcRaidersCyberpunkColorScheme

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