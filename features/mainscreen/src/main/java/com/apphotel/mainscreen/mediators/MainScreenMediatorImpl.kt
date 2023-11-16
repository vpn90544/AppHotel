package com.apphotel.mainscreen.mediators

import androidx.fragment.app.Fragment
import com.apphotel.mainscreen.presentation.MainScreenFragment
import com.apphotel.mainscreen_api.mediators.MainScreenMediator
import javax.inject.Inject

class MainScreenMediatorImpl
@Inject constructor() : MainScreenMediator {

    override fun showMainScreenFragment(action: (Fragment) -> Unit) {
        action(MainScreenFragment.newInstance())
    }
}