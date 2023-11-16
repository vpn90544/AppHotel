package com.apphotel.all_image_screen_api.mediators

import androidx.fragment.app.Fragment

interface AllImageScreenMediator {

    fun showAllImageScreenFragment(action: (Fragment) -> Unit)
}