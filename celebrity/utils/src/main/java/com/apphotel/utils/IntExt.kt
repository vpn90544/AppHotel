package com.apphotel.utils

import android.content.res.Resources
import kotlin.math.roundToInt

fun Int.dpToPx(): Int {
    return (this * Resources.getSystem().displayMetrics.density).roundToInt()
}