# Arc Raiders Theme Setup

## Overview

This project features a beautiful, professional theme inspired by the Arc Raiders game, following Material 3 Expressive Design guidelines. The theme captures the warm, post-apocalyptic aesthetic of the game while maintaining a clean, modern interface.

## Theme Characteristics

### Color Palette

The color scheme is inspired by the Arc Raiders website's dominant warm beige (#ECE2D0) and creates a unique "post-post-apocalyptic" aesthetic:

**Light Theme:**
- **Primary**: Warm sandstone (#D4A574) - inviting and earthy
- **Secondary**: Earthy clay (#A67C52) - grounded and natural
- **Tertiary**: Warm amber (#E8925C) - energetic accent
- **Background**: Light beige (#FAF7F2) - soft and welcoming
- **Surface**: White with beige containers

**Dark Theme:**
- **Primary**: Lighter tan (#CFB997) - warm contrast
- **Secondary**: Bronze (#B8956F) - weathered metal
- **Tertiary**: Copper glow (#D99E6F) - futuristic warmth
- **Background**: Dark ash (#2A2520) - deep and immersive
- **Surface**: Dark surface (#352F28) with smoky containers

### Typography

The theme uses the **Barlow** font family (matching the official Arc Raiders website):

- **Display Text**: Barlow Semi Condensed Bold - for large, impactful headers
- **Headlines**: Barlow Bold/SemiBold - for section headers
- **Body Text**: Barlow Regular/Medium - for readable content
- **Labels**: Barlow Medium/SemiBold - for buttons and UI elements

All typography follows Material 3 type scale with proper sizing, line heights, and letter spacing.

## Architecture

The project follows **Clean MVVM Architecture** with:

```
app/
├── core/
│   ├── constants/     # App-wide constants
│   └── util/          # Utility classes (Resource, etc.)
├── data/
│   ├── local/         # Local data sources (Room, DataStore)
│   ├── remote/        # Remote data sources (Retrofit)
│   ├── repository/    # Repository implementations
│   └── model/         # Data models (DTOs)
├── domain/
│   ├── model/         # Domain entities
│   ├── repository/    # Repository interfaces
│   └── usecase/       # Business logic use cases
├── presentation/
│   ├── home/          # Home screen UI & ViewModel
│   ├── navigation/    # Navigation graph
│   └── [features]/    # Other feature modules
├── di/                # Dependency injection (Hilt modules)
└── ui/
    └── theme/         # Theme, colors, typography
```

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

1. **Custom Color Schemes**: Both light and dark themes with Arc Raiders branding
2. **Typography System**: Complete Material 3 type scale with Barlow fonts
3. **System Bar Theming**: Automatic status bar and navigation bar coloring
4. **Dynamic Color Support**: Optional Android 12+ dynamic colors (disabled by default to maintain brand identity)

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

### Theme Customization

```kotlin
// Force dark theme
CompanionForArcRaidersTheme(darkTheme = true) {
    // Your content
}

// Enable dynamic colors (Android 12+)
CompanionForArcRaidersTheme(dynamicColor = true) {
    // Your content
}
```

## Design Decisions

1. **Warm Color Palette**: Unlike typical dark, cyberpunk sci-fi themes, Arc Raiders embraces warmth and approachability
2. **Barlow Font**: Matches official website for brand consistency
3. **Material 3 Expressive**: Provides more personality than standard Material Design
4. **Disabled Dynamic Color**: Maintains brand identity across all Android versions
5. **Edge-to-Edge**: Modern Android experience with proper inset handling

## Next Steps

As you develop the app, consider:

1. **Feature Modules**: Add new screens in `presentation/[feature]/`
2. **Data Layer**: Implement repositories and data sources in `data/`
3. **Use Cases**: Add business logic in `domain/usecase/`
4. **Testing**: Create unit tests for ViewModels and use cases
5. **UI Components**: Build reusable components using the theme system

## Resources

- [Material 3 Design Kit](https://m3.material.io/)
- [Arc Raiders Official Site](https://arcraiders.com/en/)
- [Jetpack Compose Documentation](https://developer.android.com/jetpack/compose)
- [Hilt Documentation](https://developer.android.com/training/dependency-injection/hilt-android)

---

Built with ❤️ for Arc Raiders fans
