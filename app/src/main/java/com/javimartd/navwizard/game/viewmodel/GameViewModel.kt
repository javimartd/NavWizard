package com.javimartd.navwizard.game.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.navigation.NavArgs
import com.javimartd.navwizard.common.BaseViewModel
import com.javimartd.navwizard.common.BaseContract
import com.javimartd.navwizard.game.GameNavigator
import com.javimartd.navwizard.game.model.GameUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GameViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle
): BaseViewModel<
        GameContract.GameUiState,
        GameContract.GameEvents,
        GameContract.GameEffects
        >() {

    //private val arg = savedStateHandle.get<String>(GameNavigator.FIRST_ARG).orEmpty()
    private val arg = savedStateHandle.get<GameUiState>(GameNavigator.FIRST_ARG)

    override fun initState(): GameContract.GameUiState {
        return GameContract.GameUiState(isLoading = true)
    }

    override fun handleEvents(events: GameContract.GameEvents) {
        when (events) {
            GameContract.GameEvents.CustomEvents -> {
                // ...
            }
        }
    }

}