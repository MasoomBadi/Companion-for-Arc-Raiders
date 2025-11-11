package com.phoenix.companionforarcraiders.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.phoenix.companionforarcraiders.core.constants.AppConstants
import com.phoenix.companionforarcraiders.presentation.home.HomeScreen

/**
 * Main navigation graph for the app
 * Defines all routes and navigation between screens
 */
@Composable
fun NavGraph(
    navController: NavHostController,
    startDestination: String = AppConstants.Routes.HOME
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(AppConstants.Routes.HOME) {
            HomeScreen(navController = navController)
        }

        // Add more destinations here as the app grows
    }
}
