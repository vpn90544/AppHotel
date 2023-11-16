package com.apphotel.likeimage.presentation

import androidx.lifecycle.viewModelScope
import com.apphotel.arch.viewmodel.BaseViewModel
import com.apphotel.core_ui.view.image_with_like.ImageLikeViewModel
import com.apphotel.likeimage.data.LikeImagesRepository
import com.apphotel.likeimage.data.mapper.MapperForLikeImage
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class LikeImageScreenViewModel @Inject constructor(
)
    : BaseViewModel<LikeImageScreenState>(initialState = LikeImageScreenState()) {

}