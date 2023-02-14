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
import androidx.hilt.navigation.compose.hiltViewModel
import com.javimartd.navwizard.game.GameNavigator

@Composable
fun GameThirdView(
    viewModel: BaseViewModel = hiltViewModel(),
    gameNavigator: GameNavigator,
    firstArg: String?,
    secondArg: String?,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            style = TextStyle(fontSize = 24.sp),
            text = "Game Third View!",
            textAlign = TextAlign.Center
        )
        firstArg?.let {
            Text(
                style = TextStyle(fontSize = 16.sp),
                modifier = Modifier.fillMaxWidth(),
                text = it,
                textAlign = TextAlign.Center,
            )
        }
        secondArg?.let {
            Text(
                style = TextStyle(fontSize = 16.sp),
                modifier = Modifier.fillMaxWidth(),
                text = it,
                textAlign = TextAlign.Center,
            )
        }
        Button(
            onClick = { gameNavigator.actionNavigateForwardTo(GameNavigator.FOURTH) }
        ) {
            Text(text = "Navigate Forward")
        }
        Button(
            onClick = { gameNavigator.actionNavigateUp() }
        ) {
            Text(text = "Navigate Back")
        }
    }
}
