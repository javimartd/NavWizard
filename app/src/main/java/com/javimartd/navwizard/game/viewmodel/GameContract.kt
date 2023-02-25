package com.javimartd.navwizard.game.viewmodel

import com.javimartd.navwizard.common.BaseContract

interface GameContract: BaseContract {

    data class GameUiState(
        override var isLoading: Boolean
    ): BaseContract.UiState

    sealed interface GameEvents: BaseContract.Events {
        object CustomEvents: GameContract.GameEvents
    }

    sealed interface GameEffects: BaseContract.Effects {
        object NavigateToSecondView: GameContract.GameEvents
    }
}