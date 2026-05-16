package com.dailyquotes.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dailyquotes.app.ui.screens.HomeScreen
import com.dailyquotes.app.ui.screens.ProfileScreen
import com.dailyquotes.app.ui.screens.ThemesScreen
import com.dailyquotes.app.ui.theme.DailyQuotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DailyQuotesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation()
                }
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(
                onNavigateToProfile = { navController.navigate("profile") },
                onNavigateToThemes = { navController.navigate("themes") }
            )
        }
        composable("profile") {
            ProfileScreen(
                onBack = { navController.popBackStack() }
            )
        }
        composable("themes") {
            ThemesScreen(
                onBack = { navController.popBackStack() }
            )
        }
    }
}
