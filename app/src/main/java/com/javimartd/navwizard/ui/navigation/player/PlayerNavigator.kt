package com.javimartd.navwizard.ui.navigation.player

import androidx.navigation.NavHostController

class PlayerNavigator(navController: NavHostController) {

    val actionNavigateUp: () -> Unit = {
        navController.navigateUp()
    }

    companion object {
        const val ROOT = "player_graph"
        const val START = "player_first_screen"
        const val SECOND = "player_second_screen"
    }
}