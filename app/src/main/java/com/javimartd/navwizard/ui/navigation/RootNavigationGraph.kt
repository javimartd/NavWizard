package com.javimartd.navwizard.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.javimartd.navwizard.ui.navigation.main.MainNavigator
import com.javimartd.navwizard.ui.navigation.main.mainNavigationGraph
import com.javimartd.navwizard.ui.navigation.second.secondNavigationGraph

@Composable
fun RootNavigationGraph(startDestination: String = MainNavigator.ROOT) {

    val navController = rememberNavController()

    val mainNavigator = MainNavigator(
        navController
    )

    NavHost(
        navController = navController,
        startDestination = startDestination // app start destination
    ) {
        mainNavigationGraph(mainNavigator)
        secondNavigationGraph()
    }
}
