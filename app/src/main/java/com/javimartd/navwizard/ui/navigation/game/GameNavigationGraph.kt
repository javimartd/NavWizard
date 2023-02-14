package com.javimartd.navwizard.ui.navigation.game

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.javimartd.navwizard.ui.navigation.game.screen.GameFirstScreen
import com.javimartd.navwizard.ui.navigation.game.screen.GameFourthScreen
import com.javimartd.navwizard.ui.navigation.game.screen.GameSecondScreen
import com.javimartd.navwizard.ui.navigation.game.screen.GameThirdScreen

fun NavGraphBuilder.gameNavigationGraph(gameNavigator: GameNavigator) {
    navigation(
        route = GameNavigator.ROOT,
        startDestination = GameNavigator.START
    ) {
        composable(route = GameNavigator.START) {
            GameFirstScreen(gameNavigator)
        }
        composable(route = GameNavigator.SECOND) {
            GameSecondScreen(gameNavigator)
        }
        composable(route = GameNavigator.THIRD) {
            GameThirdScreen(gameNavigator)
        }
        composable(route = GameNavigator.FOURTH) {
            GameFourthScreen(gameNavigator)
        }
    }

}