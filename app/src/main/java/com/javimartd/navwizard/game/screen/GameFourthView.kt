package com.javimartd.navwizard.game.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.javimartd.navwizard.game.GameNavigator

@Composable
fun GameFourthView(gameNavigator: GameNavigator) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            text = "Game Fourth View!",
            textAlign = TextAlign.Center,
            style = TextStyle(fontSize = 24.sp)
        )
        Button(
            onClick = { gameNavigator.actionNavigateUp() }
        ) {
            Text(text = "Navigate Back")
        }
    }
}