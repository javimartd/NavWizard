package com.javimartd.navwizard.game.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class GameUiState(
    val id: String,
    val name: String,
    val brand: String,
    val numPlayers: Int,
    val url: String
): Parcelable

val gameUiState = GameUiState(
    id = "id",
    name = "Monopoly",
    brand = "Hasbro",
    numPlayers = 4,
    url = "https://www.theguardian.com/international"
)
