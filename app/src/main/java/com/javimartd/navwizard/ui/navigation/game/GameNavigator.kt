package com.javimartd.navwizard.ui.navigation.game

import androidx.navigation.NavHostController

class GameNavigator(navController: NavHostController) {

    val actionNavigateBackToPath: (String) -> Unit = { destination ->
        navController.popBackStack(
            route = destination,
            inclusive = false
        )
    }

    val actionNavigateForwardToPath: (String) -> Unit = { destination ->
        navController.navigate(route = destination)
    }

    val actionNavigateToGameSecondScreen: () -> Unit = {
        navController.navigate(SECOND)
    }

    val actionNavigateToGameThirdScreen: () -> Unit = {
        navController.navigate(THIRD)
    }

    val actionNavigateToGameFourthScreen: () -> Unit = {
        navController.navigate(FOURTH)
    }

    val actionNavigateUp: () -> Unit = {
        navController.navigateUp()
    }

    companion object {
        const val ROOT = "game_graph"
        const val START = "game_first_screen"
        const val SECOND = "game_second_screen"
        const val THIRD = "game_third_screen"
        const val FOURTH = "game_fourth_screen"
    }
}