package com.javimartd.navwizard.ui.navigation.player

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.javimartd.navwizard.ui.navigation.player.screen.PlayerFirstScreen
import com.javimartd.navwizard.ui.navigation.player.screen.PlayerSecondScreen

fun NavGraphBuilder.playerNavigationGraph(playerNavigator: PlayerNavigator) {
    navigation(
        route = PlayerNavigator.ROOT,
        startDestination = PlayerNavigator.START
    ) {
        composable(route = PlayerNavigator.START) {
            PlayerFirstScreen(playerNavigator)
        }
        composable(route = PlayerNavigator.SECOND) {
            PlayerSecondScreen(playerNavigator)
        }
    }
}