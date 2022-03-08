package com.farhan.tanvir.splashscreenjetpackcompose.screen.splash

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.farhan.tanvir.splashscreenjetpackcompose.R
import com.farhan.tanvir.splashscreenjetpackcompose.navigation.Screens
import com.farhan.tanvir.splashscreenjetpackcompose.ui.theme.Purple700
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    val scale = remember {
        Animatable(0f)
    }

    LaunchedEffect(key1 = true, block = {
        scale.animateTo(targetValue = 1f,
            animationSpec = tween(
                durationMillis = 2000,
            ))
        delay(2000L)
        navController.popBackStack()
        navController.navigate(Screens.MainScreen.name)
    })

    Box(
        modifier = Modifier
            .background(color = Purple700)
            .scale(scale.value)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = R.drawable.love),
                contentDescription = "Love",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(150.dp))
            Text(text = "JC is Awesome",
                style = MaterialTheme.typography.h5,
                color = Color.LightGray)
        }
    }
}