package com.phoenix.companionforarcraiders.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Hilt module for providing app-level dependencies
 * Installed in SingletonComponent for application-wide scope
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    /**
     * Provides application context
     * Can be used throughout the app for context-dependent operations
     */
    @Provides
    @Singleton
    fun provideApplicationContext(@ApplicationContext context: Context): Context {
        return context
    }

    // Add more app-level dependencies here as needed
    // Example: Database, Network client, Repositories, etc.
}
