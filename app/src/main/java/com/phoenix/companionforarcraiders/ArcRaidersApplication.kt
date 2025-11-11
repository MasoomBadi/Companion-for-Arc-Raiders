package com.phoenix.companionforarcraiders

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Main Application class for Companion for Arc Raiders
 * Annotated with @HiltAndroidApp to enable Hilt dependency injection
 */
@HiltAndroidApp
class ArcRaidersApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // Initialize any app-wide components here
    }
}
