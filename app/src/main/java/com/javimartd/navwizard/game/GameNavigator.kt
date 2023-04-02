package com.javimartd.navwizard.game

import android.net.Uri
import androidx.navigation.NavHostController
import com.javimartd.navwizard.game.model.gameUiState
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToJsonElement

class GameNavigator(navController: NavHostController) {

    val actionNavigateUp: () -> Unit = {
        navController.navigateUp()
    }

    val actionNavigateForwardTo: (String) -> Unit = { destination ->
        navController.navigate(route = destination)
    }

    val actionNavigateToGameSecondView: (Int) -> Unit = { int ->
        val path = SECOND.replace("{$FIRST_ARG}", "$int")
        //val path = "$ROOT/game_second_view/${int}"
        navController.navigate(path)
    }

    val actionNavigateToGameThirdView: (String, String) -> Unit = { firstArg, secondArg ->
        val path = THIRD
            .replace("{$FIRST_ARG}", firstArg)
            .replace("{$SECOND_ARG}", secondArg)
        navController.navigate(path)
    }

    val actionNavigateToFourthView: () -> Unit = {
        val path = FOURTH.replace(
            "{$FIRST_ARG}",
            Uri.encode(Json.encodeToJsonElement(gameUiState).toString())
        )
        navController.navigate(path)
    }

    companion object {

        const val FIRST_ARG = "first_arg"
        const val SECOND_ARG = "second_arg"

        const val ROOT = "game_graph"
        const val START = "$ROOT/game_first_view"
        const val SECOND = "$ROOT/game_second_view/{$FIRST_ARG}"
        const val THIRD = "$ROOT/game_third_view/{$FIRST_ARG}/{$SECOND_ARG}"
        const val FOURTH = "$ROOT/game_fourth_view/{$FIRST_ARG}"
    }
}