package com.apphotel.likeimage.mediators

import androidx.fragment.app.Fragment
import com.apphotel.like_image_screen_api.mediators.LikeImageScreenMediator
import com.apphotel.likeimage.presentation.LikeImageScreenFragment
import javax.inject.Inject

class LikeImageScreenMediatorImpl
@Inject constructor() : LikeImageScreenMediator {

    override fun showLikeImageScreenFragment(action: (Fragment) -> Unit) {
        action(LikeImageScreenFragment.newInstance())
    }
}