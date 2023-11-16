package com.apphotel.allimage.presentation

import android.annotation.SuppressLint
import androidx.lifecycle.viewModelScope
import com.apphotel.allimage.data.AllImageRepository
import com.apphotel.allimage.data.models.ImagesInfoPage
import com.apphotel.allimage.data.mapper.MapperForAllImages
import com.apphotel.allimage.data.mapper.MapperForLikeImage
import com.apphotel.arch.viewmodel.BaseViewModel
import com.apphotel.core_ui.view.image_with_like.ImageLikeViewModel
import com.apphotel.utils.adapter.DelegateItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class AllImageScreenViewModel @Inject constructor(
    private val repository: AllImageRepository
)
    : BaseViewModel<AllImageScreenState>(initialState = AllImageScreenState()) {

}