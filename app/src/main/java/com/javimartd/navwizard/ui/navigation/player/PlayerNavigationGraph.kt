package com.javimartd.navwizard.ui.navigation.player

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.javimartd.navwizard.ui.navigation.player.screen.PlayerFirstScreen

fun NavGraphBuilder.playerNavigationGraph(playerNavigator: PlayerNavigator) {
    navigation(
        route = PlayerNavigator.ROOT,
        startDestination = PlayerNavigator.START
    ) {
        composable(route = PlayerNavigator.START) {
            PlayerFirstScreen()
        }
    }
}