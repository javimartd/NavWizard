package com.javimartd.navwizard.ui.navigation.main

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(mainNavigator: MainNavigator) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Main screen",
            textAlign = TextAlign.Center
        )
        Button(
            onClick = {
                mainNavigator.actionNavigateToSecond
            }
        ) {
            Text(text = "Navigate Forward")
        }
        Button(
            onClick = { mainNavigator.actionNavigateUp }
        ) {
            Text(text = "Navigate Back")
        }
    }
}