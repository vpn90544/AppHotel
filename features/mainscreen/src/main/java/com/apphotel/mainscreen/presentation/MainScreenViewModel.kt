package com.apphotel.mainscreen.presentation

import androidx.lifecycle.viewModelScope
import com.apphotel.all_image_screen_api.mediators.AllImageScreenMediator
import com.apphotel.arch.viewmodel.BaseViewModel
import com.apphotel.core.di.qualifiers.ContentFragmentContainer
import com.apphotel.core_ui.view.category.CategoryView
import com.apphotel.core_ui.view.category.CategoryViewModel
import com.apphotel.like_image_screen_api.mediators.LikeImageScreenMediator
import com.apphotel.mainscreen.data.MainScreenRepository
import com.apphotel.utils.adapter.DelegateItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainScreenViewModel @Inject constructor(
    private val allImageScreenMediator: AllImageScreenMediator,
    private val likeImageScreenMediator: LikeImageScreenMediator,
    @ContentFragmentContainer
    private val contentContainerId: Int,
    private val mainScreenRepository: MainScreenRepository
) : BaseViewModel<MainUiState>(initialState = MainUiState()) {

    override fun bootstrap() {
        super.bootstrap()
    }
}