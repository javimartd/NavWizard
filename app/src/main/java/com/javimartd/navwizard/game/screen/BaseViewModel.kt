package com.javimartd.navwizard.game.screen

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.javimartd.navwizard.game.GameNavigator

class BaseViewModel(private val savedStateHandle: SavedStateHandle): ViewModel() {

    private val productId = savedStateHandle.get<String>(GameNavigator.FIRST_ARG).orEmpty()
}