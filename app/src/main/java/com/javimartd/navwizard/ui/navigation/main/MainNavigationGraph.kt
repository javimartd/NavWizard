package com.javimartd.navwizard.ui.navigation.main

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation

fun NavGraphBuilder.mainNavigationGraph(mainNavigator: MainNavigator) {
    navigation(
        startDestination = MainNavigator.START,
        route = MainNavigator.ROOT
    ) {
        composable(route = MainNavigator.START) {
            MainScreen(mainNavigator)
        }
        composable(route = MainNavigator.SECOND) {
            SecondMainScreen(mainNavigator)
        }
    }

}