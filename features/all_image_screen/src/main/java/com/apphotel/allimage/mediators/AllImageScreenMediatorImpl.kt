package com.apphotel.allimage.mediators

import androidx.fragment.app.Fragment
import com.apphotel.all_image_screen_api.mediators.AllImageScreenMediator
import com.apphotel.allimage.presentation.AllImageScreenFragment
import javax.inject.Inject

class AllImageScreenMediatorImpl
@Inject constructor() : AllImageScreenMediator {

    override fun showAllImageScreenFragment(action: (Fragment) -> Unit) {
        action(AllImageScreenFragment.newInstance())
    }
}