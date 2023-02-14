package com.javimartd.navwizard.player

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.javimartd.navwizard.player.screen.PlayerFirstView
import com.javimartd.navwizard.player.screen.PlayerFourthView
import com.javimartd.navwizard.player.screen.PlayerSecondView
import com.javimartd.navwizard.player.screen.PlayerThirdView

fun NavGraphBuilder.playerNavigationGraph(playerNavigator: PlayerNavigator) {
    navigation(
        route = PlayerNavigator.ROOT,
        startDestination = PlayerNavigator.FIRST
    ) {
        composable(route = PlayerNavigator.FIRST) {
            PlayerFirstView(playerNavigator)
        }
        composable(route = PlayerNavigator.SECOND) {
            PlayerSecondView(playerNavigator)
        }
        composable(route = PlayerNavigator.THIRD) {
            PlayerThirdView(playerNavigator)
        }
        composable(route = PlayerNavigator.FOURTH) {
            PlayerFourthView(playerNavigator)
        }
    }
}