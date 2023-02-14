package com.javimartd.navwizard.ui.navigation.game

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.javimartd.navwizard.ui.navigation.game.screen.*

fun NavGraphBuilder.gameNavigationGraph(gameNavigator: GameNavigator) {
    navigation(
        route = GameNavigator.ROOT,
        startDestination = GameNavigator.START
    ) {
        composable(route = GameNavigator.START) {
            GameFirstView(gameNavigator)
        }
        composable(route = GameNavigator.SECOND) {
            GameSecondScreen(gameNavigator)
        }
        val arguments = listOf(navArgument(GameNavigator.CODE) { type = NavType.StringType })
        composable(route = GameNavigator.THIRD, arguments = arguments) { navBackStackEntry ->
            val code = navBackStackEntry.arguments?.getString(GameNavigator.CODE)
            GameThirdView(gameNavigator = gameNavigator, message = code)
        }
        composable(route = GameNavigator.FOURTH) {
            GameFourthScreen(gameNavigator)
        }
    }
}