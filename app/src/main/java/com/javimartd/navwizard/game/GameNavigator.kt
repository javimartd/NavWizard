package com.javimartd.navwizard.game

import androidx.navigation.NavHostController

class GameNavigator(navController: NavHostController) {

    val actionNavigateUp: () -> Unit = {
        navController.navigateUp()
    }

    val actionNavigateForwardTo: (String) -> Unit = { destination ->
        navController.navigate(route = destination)
    }

    val actionNavigateToGameThirdView: (String) -> Unit = { message ->
        val path = THIRD.replace("{$CODE}", message)
        navController.navigate(path)
    }

    companion object {

        const val CODE = "id"

        const val ROOT = "game_graph"
        const val START = "$ROOT/game_first_view"
        const val SECOND = "$ROOT/game_second_view"
        const val THIRD = "$ROOT/game_third_view/{$CODE}"
        const val FOURTH = "$ROOT/game_fourth_view"
    }
}