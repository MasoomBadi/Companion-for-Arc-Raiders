# Arc Raiders Theme Setup

## Overview

This project features a beautiful, professional **dark theme** inspired by the Arc Raiders game, following Material 3 Expressive Design guidelines. The theme captures the warm, post-apocalyptic aesthetic of the game while maintaining a clean, modern interface.

## Theme Characteristics

### Color Palette

The color scheme is inspired by the Arc Raiders website's dominant warm beige (#ECE2D0) and creates a unique "post-post-apocalyptic" aesthetic. **The app uses only dark theme** to match the game's immersive atmosphere.

**Dark Theme (Only):**
- **Primary**: Warm tan (#CFB997) - main brand color with warm undertones
- **Secondary**: Bronze (#B8956F) - weathered metallic tone
- **Tertiary**: Copper glow (#D99E6F) - futuristic warmth accent
- **Background**: Deep warm black (#1C1815) - immersive dark base
- **Surface**: Dark warm surface (#2A2520) - layered depth
- **Surface Containers**: Multiple elevation levels (#352F28, #3A3530, #4A453F)
- **Text**: Warm beige (#ECE2D0) on dark backgrounds

### Typography

The theme uses the **Poppins** font family - a modern, clean, and beautiful geometric sans-serif:

- **Display Text**: Poppins Bold/SemiBold - for large, impactful headers
- **Headlines**: Poppins Bold/SemiBold - for section headers
- **Body Text**: Poppins Regular/Normal - for readable content
- **Labels**: Poppins Medium/SemiBold - for buttons and UI elements

All typography follows Material 3 type scale with proper sizing, line heights, and letter spacing.

## Architecture

The project follows **Feature-Wise Clean MVVM Architecture**:

```
app/
├── feature/           # Feature modules
│   └── home/
│       ├── data/      # Repositories, data sources, DTOs
│       ├── domain/    # Entities, use cases, repository interfaces
│       └── presentation/  # Screens, ViewModels, UI components
│           └── HomeScreen.kt
├── core/
│   ├── constants/     # App-wide constants
│   ├── util/          # Utility classes (Resource, etc.)
│   ├── navigation/    # Navigation graph
│   └── theme/         # Theme, colors, typography
└── di/                # Dependency injection (Hilt modules)
```

**Benefits of Feature-Wise Architecture:**
- Each feature is self-contained and independent
- Easy to add new features without affecting existing ones
- Clear code organization and navigation
- Better team collaboration (teams can own features)
- Scalable for large projects

## Technology Stack

### Core Dependencies

- **Kotlin**: Modern Android development
- **Jetpack Compose**: Declarative UI framework
- **Material 3**: Latest Material Design components
- **Material 3 Adaptive**: Responsive design for different screen sizes

### Architecture Components

- **Dagger Hilt**: Dependency injection
- **ViewModel**: UI state management
- **Navigation Compose**: Type-safe navigation
- **Lifecycle**: Lifecycle-aware components

### Design System

- **Google Fonts**: Barlow font family integration
- **Material 3 Expressive**: Enhanced design guidelines
- **Edge-to-Edge**: Modern Android UI with system bar integration

## Key Features

### Theme System

1. **Dark-Only Theme**: Consistent Arc Raiders aesthetic matching the game
2. **Typography System**: Complete Material 3 type scale with Barlow fonts
3. **System Bar Theming**: Automatic dark status bar and navigation bar
4. **No Dynamic Colors**: Fixed brand colors for consistent experience

### MVVM Architecture

1. **Separation of Concerns**: Clear layer separation (data, domain, presentation)
2. **Dependency Injection**: Hilt for modular, testable code
3. **Navigation**: Centralized navigation graph
4. **Resource Wrapper**: Consistent error handling with Resource sealed class

### Material 3 Expressive Design

1. **Surface Containers**: Multiple elevation levels for depth
2. **Color Roles**: Complete token system (primary, secondary, tertiary, etc.)
3. **Semantic Colors**: Error, warning, success states
4. **Accessibility**: Proper contrast ratios and text sizing

## Usage Examples

### Accessing Theme Colors

```kotlin
// In Compose
Text(
    text = "Arc Raiders",
    color = MaterialTheme.colorScheme.primary,
    style = MaterialTheme.typography.displayLarge
)
```

### Using Typography

```kotlin
// Display text with condensed font
Text(
    text = "ARC RAIDERS",
    style = MaterialTheme.typography.displayLarge
)

// Body text with Barlow
Text(
    text = "Description text",
    style = MaterialTheme.typography.bodyLarge
)
```

### Using the Theme

```kotlin
// The theme is always dark - no parameters needed
CompanionForArcRaidersTheme {
    // Your content
}
```

## Design Decisions

1. **Dark-Only Theme**: Matches the game's immersive atmosphere and provides consistent experience
2. **Warm Color Palette**: Unlike typical dark, cyberpunk sci-fi themes, Arc Raiders embraces warmth and approachability
3. **Poppins Font**: Modern, clean, geometric sans-serif for beautiful readability
4. **Material 3 Expressive**: Provides more personality than standard Material Design
5. **Feature-Wise Architecture**: Scalable, modular structure for growing app
6. **Edge-to-Edge**: Modern Android experience with proper inset handling

## Next Steps

As you develop the app, consider:

1. **Add New Features**: Create new feature modules in `feature/[feature_name]/`
2. **Data Layer**: Implement repositories and data sources in each feature's `data/` directory
3. **Use Cases**: Add business logic in each feature's `domain/usecase/` directory
4. **ViewModels**: Create ViewModels in each feature's `presentation/` directory
5. **Testing**: Create unit tests for ViewModels and use cases
6. **UI Components**: Build reusable components using the theme system
7. **Navigation**: Add new routes in `core/navigation/NavGraph.kt`

See `feature/README.md` for detailed instructions on adding new features.

## Resources

- [Material 3 Design Kit](https://m3.material.io/)
- [Arc Raiders Official Site](https://arcraiders.com/en/)
- [Jetpack Compose Documentation](https://developer.android.com/jetpack/compose)
- [Hilt Documentation](https://developer.android.com/training/dependency-injection/hilt-android)

---

Built with ❤️ for Arc Raiders fans
