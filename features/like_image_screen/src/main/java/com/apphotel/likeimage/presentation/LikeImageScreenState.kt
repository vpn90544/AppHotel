package com.apphotel.likeimage.presentation

import com.apphotel.arch.uistate.BaseUiState
import com.apphotel.utils.adapter.DelegateItem

data class LikeImageScreenState (
    val list: List<DelegateItem> = listOf()
): BaseUiState