package com.javimartd.navwizard.ui.navigation.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun SecondMainScreen(mainNavigator: MainNavigator) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
            text = "Second Main screen"
        )
        Button(
            onClick = { mainNavigator.actionNavigateUp }
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