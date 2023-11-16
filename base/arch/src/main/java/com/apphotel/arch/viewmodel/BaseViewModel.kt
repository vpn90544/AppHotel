package com.apphotel.arch.viewmodel

import androidx.annotation.VisibleForTesting
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.apphotel.arch.uistate.BaseUiState
import com.apphotel.utils.navigation.Navigator
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.update

abstract class BaseViewModel <UiState : BaseUiState>(initialState : UiState )
    : ViewModel() {

    protected val mutableUiState = MutableStateFlow(initialState)
    val uiState = mutableUiState.asSharedFlow()

    protected var navigator: Navigator? = null
    protected var isInitialized = false
        private set

    internal fun initialize() {
        if (!isInitialized) {
            isInitialized = true
            bootstrap()
        }
    }

    internal fun setNavigator(fragment: Fragment) {
        navigator = Navigator(fragment)
    }

    @VisibleForTesting(otherwise = VisibleForTesting.PROTECTED)
    open fun bootstrap() {
    }

    protected fun updateState(updateAction: (UiState) -> UiState) {
        mutableUiState.update { uiState ->
            updateAction(uiState)
        }
    }
}