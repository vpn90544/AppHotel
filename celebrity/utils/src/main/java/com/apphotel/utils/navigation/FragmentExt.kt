package com.apphotel.utils.navigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun Fragment.popBackStack() {
    if (childFragmentManager.backStackEntryCount > 0) {
        childFragmentManager.popBackStack()
    } else {
        parentFragmentManager
            .popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
    }
}

fun Fragment.onBackPressed() {
    requireActivity().onBackPressed()
}