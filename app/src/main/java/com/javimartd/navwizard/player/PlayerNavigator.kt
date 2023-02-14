package com.javimartd.navwizard.player

import androidx.navigation.NavHostController

class PlayerNavigator(navController: NavHostController) {

    val actionNavigateUp: () -> Unit = {
        navController.navigateUp()
    }

    val actionNavigateForwardTo: (String) -> Unit = { destination ->
        navController.navigate(destination)
    }

    val actionNavigateBackTo: (String) -> Unit = { destination ->
        navController.popBackStack(
            route = destination,
            inclusive = false // Whether the given destination should also be popped
        )
    }
    
    val actionPopUpTo: () -> Unit = {
        navController.navigate(route = FOURTH) {
            popUpTo(FIRST) { inclusive = true }
        }
    }

    val actionNavigateToItself: () -> Unit = {
        navController.navigate(THIRD) {
            launchSingleTop = true // avoiding multiple copies on the top of the back stack
        }
    }

    companion object {
        const val ROOT = "player_graph"
        const val FIRST = "player_first_view"
        const val SECOND = "player_second_view"
        const val THIRD = "player_third_view"
        const val FOURTH = "player_fourth_view"
    }
}

