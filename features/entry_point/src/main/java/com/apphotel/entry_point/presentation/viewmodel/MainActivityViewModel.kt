package com.apphotel.entry_point.presentation.viewmodel

import androidx.fragment.app.Fragment
import com.apphotel.arch.viewmodel.BaseViewModel
import com.apphotel.entry_point.presentation.state.MainActState
import com.apphotel.mainscreen_api.mediators.MainScreenMediator
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
    private val mainScreenMediator: MainScreenMediator
)
    : BaseViewModel<MainActState>(initialState = MainActState()) {

        fun showMainScreen(action: (Fragment) -> Unit){
            mainScreenMediator.showMainScreenFragment(action)
        }
    }