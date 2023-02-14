package com.javimartd.navwizard.ui.navigation.game.screen

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
import com.javimartd.navwizard.ui.navigation.game.GameNavigator
import com.javimartd.navwizard.ui.navigation.player.PlayerNavigator

@Composable
fun GameThirdScreen(gameNavigator: GameNavigator) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            text = "Game Third Screen",
            textAlign = TextAlign.Center,
            style = TextStyle(fontSize = 24.sp)
        )
        Button(
            onClick = { gameNavigator.actionNavigateToGameFourthScreen() }
        ) {
            Text(text = "Navigate Forward")
        }
        Button(
            onClick = { gameNavigator.actionNavigateForwardToPath(PlayerNavigator.SECOND) }
        ) {
            Text(text = "Navigate to Player Second Screen")
        }
        Button(
            onClick = { gameNavigator.actionNavigateUp() }
        ) {
            Text(text = "Navigate Back")
        }
    }
}
