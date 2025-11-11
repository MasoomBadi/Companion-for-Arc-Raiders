package com.phoenix.companionforarcraiders.core.theme

import androidx.compose.ui.graphics.Color

/**
 * Arc Raiders Cyberpunk Theme Colors
 * Futuristic neon aesthetic with vibrant accents
 * Deep cosmic backgrounds with electric highlights
 */

// Base Colors - Deep cosmic blue-black
val ArcBlack = Color(0xFF0B0F19)                // Background — deep cosmic blue-black
val ArcSurface = Color(0xFF121826)              // Surface — card & container base
val ArcSurfaceVariant = Color(0xFF1A2332)       // Elevated surfaces

// Primary - Neon Teal (main accent)
val ArcPrimary = Color(0xFF00E5A8)              // Neon teal — primary accent
val ArcPrimaryVariant = Color(0xFF00B88A)       // Deeper teal variant
val ArcOnPrimary = Color(0xFF0B0F19)            // Dark text on primary

// Secondary - Magenta Highlight
val ArcSecondary = Color(0xFFFF2D95)            // Magenta highlight — secondary accent
val ArcSecondaryVariant = Color(0xFFE0197D)     // Deeper magenta
val ArcOnSecondary = Color(0xFF0B0F19)          // Dark text on secondary

// Tertiary - Neon Green (active elements)
val ArcTertiary = Color(0xFF3AFF1E)             // Neon green — icons / active elements
val ArcTertiaryVariant = Color(0xFF2DE619)      // Deeper neon green
val ArcOnTertiary = Color(0xFF0B0F19)           // Dark text on tertiary

// Text Colors
val ArcTextPrimary = Color(0xFFE6F0FF)          // Main readable text
val ArcTextSecondary = Color(0xFFA8B5CC)        // Muted text for labels / captions

// Surface Container Colors - Material 3 elevation system
val ArcSurfaceContainerLowest = Color(0xFF0B0F19)  // Deepest - same as background
val ArcSurfaceContainerLow = Color(0xFF0F1420)     // Slightly elevated
val ArcSurfaceContainer = Color(0xFF121826)        // Standard containers
val ArcSurfaceContainerHigh = Color(0xFF1A2332)    // Elevated containers
val ArcSurfaceContainerHighest = Color(0xFF1F2A3E) // Highest elevation

// Outline & Borders
val ArcOutline = Color(0xFF1E2A3F)              // Subtle borders
val ArcOutlineVariant = Color(0xFF151F2E)       // Very subtle dividers

// Inverse Colors - For contrast elements
val ArcInverseSurface = Color(0xFFE6F0FF)
val ArcInverseOnSurface = Color(0xFF0B0F19)
val ArcInversePrimary = Color(0xFF00B88A)

// Scrim - Overlays
val ArcScrim = Color(0xFF000000)

// Semantic Colors
val ArcError = Color(0xFFFF5370)               // Error / alert tone
val ArcOnError = Color(0xFFE6F0FF)             // Light text on error
val ArcErrorContainer = Color(0xFF3D1D26)      // Error container
val ArcOnErrorContainer = Color(0xFFFFB3C1)    // Light text on error container

// Success & Warning (complementary colors)
val ArcSuccess = Color(0xFF3AFF1E)             // Reuse tertiary for success
val ArcWarning = Color(0xFFFFB800)             // Amber warning