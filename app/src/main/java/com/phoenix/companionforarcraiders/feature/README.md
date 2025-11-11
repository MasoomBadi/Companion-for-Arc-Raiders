# Feature Module Structure

This directory contains all feature modules organized by feature-wise clean architecture.

## Feature-Wise Architecture

Each feature is self-contained with its own:
- **data**: Data layer (repositories, data sources, DTOs)
- **domain**: Domain layer (entities, use cases, repository interfaces)
- **presentation**: Presentation layer (screens, ViewModels, UI components)

## Benefits

1. **Modularity**: Each feature is independent and can be developed/tested separately
2. **Scalability**: Easy to add new features without affecting existing ones
3. **Team Organization**: Teams can own specific features
4. **Code Navigation**: Easy to find all related code for a feature
5. **Separation of Concerns**: Clear boundaries within each feature

## Structure Example

```
feature/
├── home/
│   ├── data/
│   │   ├── repository/
│   │   ├── local/
│   │   ├── remote/
│   │   └── model/
│   ├── domain/
│   │   ├── model/
│   │   ├── repository/
│   │   └── usecase/
│   └── presentation/
│       ├── HomeScreen.kt
│       ├── HomeViewModel.kt
│       └── components/
├── profile/
│   ├── data/
│   ├── domain/
│   └── presentation/
└── [other features]/
```

## Adding a New Feature

1. Create feature directory: `feature/yourfeature/`
2. Create subdirectories: `data/`, `domain/`, `presentation/`
3. Implement from domain → data → presentation
4. Add navigation route in `core/navigation/NavGraph.kt`
5. Add dependency injection in `di/` if needed

## Clean Architecture Principles

- **Domain** should not depend on data or presentation
- **Data** implements interfaces defined in domain
- **Presentation** depends on domain (through ViewModels/Use Cases)
- Communication between layers through clearly defined interfaces
