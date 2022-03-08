package com.farhan.tanvir.splashscreenjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.farhan.tanvir.splashscreenjetpackcompose.navigation.SetupAppNavigation
import com.farhan.tanvir.splashscreenjetpackcompose.ui.theme.SplashScreenJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreenJetpackComposeTheme {
                val navController = rememberNavController()
                SetupAppNavigation(navController = navController)
            }
        }
    }
}