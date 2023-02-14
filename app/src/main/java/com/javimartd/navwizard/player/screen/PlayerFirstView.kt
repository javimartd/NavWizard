package com.javimartd.navwizard.player.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.javimartd.navwizard.R
import com.javimartd.navwizard.game.GameNavigator
import com.javimartd.navwizard.player.PlayerNavigator

@Composable
fun PlayerFirstView(playerNavigator: PlayerNavigator) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            text = "Player First View",
            textAlign = TextAlign.Center,
            style = TextStyle(fontSize = 24.sp)
        )
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.teal_200)),
            onClick = { playerNavigator.actionNavigateForwardTo(PlayerNavigator.SECOND) }
        ) {
            Text(text = "Navigate Forward")
        }
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.teal_200)),
            onClick = { playerNavigator.actionNavigateUp() }
        ) {
            Text(text = "Navigate Back")
        }
    }
}