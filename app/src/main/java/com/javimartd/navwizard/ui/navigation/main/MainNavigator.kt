package com.javimartd.navwizard.ui.navigation.main

import androidx.navigation.NavHostController

class MainNavigator(navController: NavHostController) {

    val actionNavigateToSecond: () -> Unit = {
        navController.navigate(SECOND)
    }

    val actionNavigateUp: () -> Unit = {
        navController.navigateUp()
    }

    companion object {
        const val ROOT = "main_feature"
        const val START = "main_screen"
        const val SECOND = "second_main_screen"
    }
}