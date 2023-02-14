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

        val secondViewArguments = listOf(
            navArgument(GameNavigator.FIRST_ARG) { type = NavType.StringType }
        )
        composable(
            arguments = secondViewArguments,
            route = GameNavigator.SECOND
        ) { navBackStackEntry ->
            GameSecondView(
                gameNavigator = gameNavigator,
                firstArg = navBackStackEntry.arguments?.getString(GameNavigator.FIRST_ARG)
            )
        }
        val thirdViewArguments = listOf(
            navArgument(GameNavigator.FIRST_ARG) { type = NavType.StringType },
            navArgument(GameNavigator.SECOND_ARG) { type = NavType.StringType }
        )
        composable(
            arguments = thirdViewArguments,
            route = GameNavigator.THIRD
        ) { navBackStackEntry ->
            GameThirdView(
                gameNavigator = gameNavigator,
                firstArg = navBackStackEntry.arguments?.getString(GameNavigator.FIRST_ARG),
                secondArg = navBackStackEntry.arguments?.getString(GameNavigator.SECOND_ARG)
            )
        }

        composable(route = GameNavigator.FOURTH) {
            GameFourthView(gameNavigator)
        }

    }
}