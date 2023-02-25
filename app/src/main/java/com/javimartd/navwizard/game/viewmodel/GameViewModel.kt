package com.javimartd.navwizard.game.viewmodel

import androidx.lifecycle.SavedStateHandle
import com.javimartd.navwizard.common.BaseViewModel
import com.javimartd.navwizard.common.BaseContract
import com.javimartd.navwizard.game.GameNavigator
import javax.inject.Inject


class GameViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle
): BaseViewModel<
        GameContract.GameUiState,
        GameContract.GameEvents,
        GameContract.GameEffects
        >() {

    private val message = savedStateHandle.get<String>(GameNavigator.FIRST_ARG).orEmpty()

    override fun initState(): GameContract.GameUiState {
        TODO("Not yet implemented")
    }

    override fun handleEvents(events: GameContract.GameEvents) {
        TODO("Not yet implemented")
    }

}