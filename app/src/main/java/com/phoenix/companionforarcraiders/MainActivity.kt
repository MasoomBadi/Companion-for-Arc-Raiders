package com.phoenix.companionforarcraiders

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.phoenix.companionforarcraiders.presentation.navigation.NavGraph
import com.phoenix.companionforarcraiders.ui.theme.CompanionForArcRaidersTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * Main Activity for Companion for Arc Raiders
 * Entry point of the application with Hilt dependency injection
 *
 * Features:
 * - Material 3 Expressive Design with Arc Raiders theme
 * - Edge-to-edge display
 * - Navigation using Jetpack Compose Navigation
 * - Dependency injection with Hilt
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CompanionForArcRaidersTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavGraph(navController = navController)
                }
            }
        }
    }
}