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
import com.javimartd.navwizard.game.model.GameUiState
import com.javimartd.navwizard.game.viewmodel.GameViewModel

@Composable
fun GameFourthView(
    gameNavigator: GameNavigator,
    viewModel: GameViewModel = hiltViewModel(),
    firstArg: GameUiState
) {
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
        Text(
            style = TextStyle(fontSize = 16.sp),
            modifier = Modifier.fillMaxWidth(),
            text = firstArg.toString(),
            textAlign = TextAlign.Center,
        )
        Button(
            onClick = { gameNavigator.actionNavigateUp() }
        ) {
            Text(text = "Navigate Back")
        }
    }
}