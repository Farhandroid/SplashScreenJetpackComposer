package com.farhan.tanvir.splashscreenjetpackcompose.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.farhan.tanvir.splashscreenjetpackcompose.screen.main.MainScreen
import com.farhan.tanvir.splashscreenjetpackcompose.screen.splash.SplashScreen


@Composable
fun SetupAppNavigation(navController: NavHostController) {
    NavHost(navController = navController,
        startDestination = Screens.SplashScreen.name) {
        composable(Screens.SplashScreen.name) {
            SplashScreen(navController = navController)
        }
        composable(Screens.MainScreen.name) {
            MainScreen()
        }
    }
}