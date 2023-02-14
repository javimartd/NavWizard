package com.javimartd.navwizard.game

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.javimartd.navwizard.game.screen.GameFirstView
import com.javimartd.navwizard.game.screen.GameFourthView
import com.javimartd.navwizard.game.screen.GameSecondView
import com.javimartd.navwizard.game.screen.GameThirdView

fun NavGraphBuilder.gameNavigationGraph(gameNavigator: GameNavigator) {

    // construct a nested NavGraph
    navigation(
        route = GameNavigator.ROOT,
        startDestination = GameNavigator.START
    ) {

        composable(route = GameNavigator.START) {
            GameFirstView(gameNavigator)
        }

        composable(route = GameNavigator.SECOND) {
            GameSecondView(gameNavigator)
        }

        val arguments = listOf(navArgument(GameNavigator.CODE) { type = NavType.StringType })
        composable(
            arguments = arguments,
            route = GameNavigator.THIRD
        ) { navBackStackEntry ->
            val code = navBackStackEntry.arguments?.getString(GameNavigator.CODE)
            GameThirdView(gameNavigator = gameNavigator, message = code)
        }

        composable(route = GameNavigator.FOURTH) {
            GameFourthView(gameNavigator)
        }

    }
}