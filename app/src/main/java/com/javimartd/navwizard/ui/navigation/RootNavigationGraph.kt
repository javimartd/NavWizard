package com.javimartd.navwizard.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.javimartd.navwizard.ui.navigation.game.GameNavigator
import com.javimartd.navwizard.ui.navigation.game.gameNavigationGraph
import com.javimartd.navwizard.ui.navigation.player.PlayerNavigator
import com.javimartd.navwizard.ui.navigation.player.playerNavigationGraph

@Composable
fun RootNavigationGraph(startDestination: String = GameNavigator.ROOT) {

    val navController = rememberNavController()

    val gameNavigator = GameNavigator(navController)
    val playerNavigator = PlayerNavigator(navController)

    NavHost(
        navController = navController,
        startDestination = startDestination // app start destination
    ) {
        gameNavigationGraph(gameNavigator)
        playerNavigationGraph(playerNavigator)
    }
}
