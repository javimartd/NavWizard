package com.javimartd.navwizard.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.javimartd.navwizard.game.GameNavigator
import com.javimartd.navwizard.game.gameNavigationGraph
import com.javimartd.navwizard.player.PlayerNavigator
import com.javimartd.navwizard.player.playerNavigationGraph

// https://developer.android.com/guide/navigation/navigation-principles#fixed_start_destination
@Composable
fun RootNavigationGraph(startDestination: String = GameNavigator.ROOT) {

    // NavController manages app navigation within a NavHost
    val navController = rememberNavController()

    // https://developer.android.com/reference/kotlin/androidx/navigation/compose/package-summary#(androidx.navigation.NavController).currentBackStackEntryAsState()
    val currentBackStackEntryState = navController.currentBackStackEntryAsState()

    val gameNavigator = GameNavigator(navController)
    val playerNavigator = PlayerNavigator(navController)

    // to construct your navigation graph
    NavHost(
        navController = navController,
        startDestination = startDestination // app start destination
    ) {
        gameNavigationGraph(gameNavigator)
        playerNavigationGraph(playerNavigator)
    }
}
