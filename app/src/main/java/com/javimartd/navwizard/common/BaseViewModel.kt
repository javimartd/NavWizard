package com.javimartd.navwizard.common

import androidx.compose.runtime.MutableState
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.javimartd.navwizard.game.GameNavigator
import com.javimartd.navwizard.game.viewmodel.GameContract
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

abstract class BaseViewModel<
        uiState: BaseContract.UiState,
        events: BaseContract.Events,
        effects: BaseContract.Effects
        > : ViewModel() {

    abstract fun initState(): uiState
    abstract fun handleEvents(events: events)

    private val _uiState = MutableStateFlow<uiState>(initState())
    val uiState: StateFlow<uiState> = _uiState
}