package com.apphotel.allimage.presentation

import com.apphotel.arch.uistate.BaseUiState
import com.apphotel.utils.adapter.DelegateItem

data class AllImageScreenState (
    val list: List<DelegateItem> = listOf(),
    val isRefresh: Boolean = true,
    val isLoadingNewPage: Boolean = false,
    val nextPageLoad:String? = null
): BaseUiState