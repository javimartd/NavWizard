package com.javimartd.navwizard.ui.navigation.game.screen

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.javimartd.navwizard.ui.navigation.game.GameNavigator

class BaseViewModel(private val savedStateHandle: SavedStateHandle): ViewModel() {

    private val productId = savedStateHandle.get<String>(GameNavigator.CODE).orEmpty()
}