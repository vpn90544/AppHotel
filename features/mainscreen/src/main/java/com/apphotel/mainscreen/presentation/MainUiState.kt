package com.apphotel.mainscreen.presentation

import com.apphotel.arch.uistate.BaseUiState
import com.apphotel.core_ui.view.category.CategoryView
import com.apphotel.core_ui.view.category.CategoryViewModel
import com.apphotel.utils.adapter.DelegateItem

data class MainUiState (
    val listCategory :ArrayList<DelegateItem> = arrayListOf(
        CategoryViewModel("All Images", isActive = CategoryView.Style.Activated),
        CategoryViewModel("Like Images")
    )
): BaseUiState