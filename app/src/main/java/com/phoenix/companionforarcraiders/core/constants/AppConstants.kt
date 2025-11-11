package com.phoenix.companionforarcraiders.core.constants

/**
 * Application-wide constants for Companion for Arc Raiders
 */
object AppConstants {
    // App Info
    const val APP_NAME = "Companion for Arc Raiders"
    const val APP_VERSION = "1.0.0"

    // Navigation Routes
    object Routes {
        const val HOME = "home"
        const val SETTINGS = "settings"
    }

    // Network
    object Network {
        const val TIMEOUT_SECONDS = 30L
        const val BASE_URL = "https://api.example.com/" // TODO: Update with actual API URL
    }

    // Database
    object Database {
        const val DATABASE_NAME = "arc_raiders_companion_db"
        const val DATABASE_VERSION = 1
    }

    // Preferences
    object Preferences {
        const val PREFERENCES_NAME = "arc_raiders_prefs"
        const val KEY_THEME_MODE = "theme_mode"
        const val KEY_DYNAMIC_COLOR = "dynamic_color"
    }
}
