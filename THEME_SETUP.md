# Arc Raiders Theme Setup

## Overview

This project features a stunning **cyberpunk neon theme** inspired by Arc Raiders' futuristic aesthetic, following Material 3 Expressive Design guidelines. The theme creates an immersive sci-fi experience with vibrant electric accents on deep cosmic backgrounds.

## Theme Characteristics

### Color Palette

The color scheme embraces a **cyberpunk aesthetic** with neon accents and deep space backgrounds. **The app uses only dark theme** to match the game's futuristic atmosphere.

**Cyberpunk Theme Colors:**

| Color              | Hex       | Usage                                    |
| ------------------ | --------- | ---------------------------------------- |
| **ArcBlack**       | `#0B0F19` | Background — deep cosmic blue-black      |
| **ArcSurface**     | `#121826` | Surface — card & container base          |
| **ArcPrimary**     | `#00E5A8` | Neon teal — primary accent               |
| **ArcSecondary**   | `#FF2D95` | Magenta highlight — secondary accent     |
| **ArcTertiary**    | `#3AFF1E` | Neon green — for icons / active elements |
| **ArcTextPrimary** | `#E6F0FF` | Main readable text                       |
| **ArcTextSecondary** | `#A8B5CC` | Muted text for labels / captions       |
| **ArcOutline**     | `#1E2A3F` | Subtle borders                           |
| **ArcError**       | `#FF5370` | Error / alert tone                       |

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

1. **Cyberpunk Theme**: Futuristic neon aesthetic with vibrant accents
2. **Triple Color System**: Neon teal (primary), magenta (secondary), green (tertiary)
3. **Typography System**: Complete Material 3 type scale with Poppins fonts
4. **System Bar Theming**: Automatic dark status bar and navigation bar
5. **No Dynamic Colors**: Fixed neon brand colors for consistent cyberpunk experience

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
// Neon teal primary accent
Text(
    text = "Arc Raiders",
    color = MaterialTheme.colorScheme.primary, // #00E5A8
    style = MaterialTheme.typography.displayLarge
)

// Magenta secondary highlight
Button(
    colors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.secondary // #FF2D95
    )
) { Text("Action") }

// Neon green for active elements
Icon(
    imageVector = Icons.Default.Check,
    tint = MaterialTheme.colorScheme.tertiary // #3AFF1E
)
```

### Using Typography

```kotlin
// Display text with Poppins Bold
Text(
    text = "ARC RAIDERS",
    style = MaterialTheme.typography.displayLarge,
    color = MaterialTheme.colorScheme.primary
)

// Body text with Poppins Regular
Text(
    text = "Description text",
    style = MaterialTheme.typography.bodyLarge,
    color = MaterialTheme.colorScheme.onSurfaceVariant
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

1. **Cyberpunk Neon Theme**: Futuristic aesthetic with vibrant electric colors
2. **Deep Cosmic Backgrounds**: Dark blue-black (#0B0F19) for immersive experience
3. **Triple Neon Accents**: Teal, magenta, and green for visual impact
4. **Poppins Font**: Modern, clean, geometric sans-serif for beautiful readability
5. **Material 3 Expressive**: Enhanced personality and dynamic feel
6. **Feature-Wise Architecture**: Scalable, modular structure for growing app
7. **Edge-to-Edge**: Modern Android experience with proper inset handling

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
