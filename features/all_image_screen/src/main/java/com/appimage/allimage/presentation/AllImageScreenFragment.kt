package com.appimage.allimage.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appimage.allimage.databinding.AllImageLayoutBinding
import com.appimage.allimage.di.AllImageScreenComponent
import com.appimage.arch.fragment.BaseFragment
import com.appimage.core.di.providers.ApplicationProvider
import com.appimage.core_ui.view.category.CategoryDelegateAdapter
import com.appimage.utils.adapter.CompositeAdapter

class AllImageScreenFragment
    : BaseFragment<AllImageScreenState, AllImageScreenViewModel, AllImageLayoutBinding>() {

    private val compositeAdapter by lazy {
        CompositeAdapter.Builder()
            .add(CategoryDelegateAdapter())
            .build()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //setSettingRecycler()
    }

//    private fun setSettingRecycler() {
//        viewBinding.recyclerView.layoutManager = GridLayoutManager(
//            activity,2, RecyclerView.VERTICAL,false
//        )
//        viewBinding.recyclerView.adapter = compositeAdapter
//        viewBinding.recyclerView.addItemDecoration(
//            ItemsDecorator(
//                DecoratorParams(
//                    DEFAULT_VALUE_FOR_ITEM_DECORATOR,
//                    DEFAULT_VALUE_FOR_ITEM_DECORATOR,
//                    DEFAULT_VALUE_FOR_ITEM_DECORATOR,
//                    DEFAULT_VALUE_FOR_ITEM_DECORATOR
//                )
//            )
//        )
//    }
//    override fun handleUiState(uiState: MainUiState) {
//        super.handleUiState(uiState)
//        compositeAdapter.submitList(
//            listOf(
//                uiState.category1,
//                uiState.category2
//            )
//        )
//    }

    companion object {

        const val DEFAULT_VALUE_FOR_ITEM_DECORATOR = 8

        fun newInstance(): AllImageScreenFragment {
            return AllImageScreenFragment()
        }
    }

    override fun getViewModelClass(): Class<AllImageScreenViewModel> {
        return AllImageScreenViewModel::class.java
    }

    override fun createViewBinding(inflater: LayoutInflater, container: ViewGroup?): AllImageLayoutBinding {
        return AllImageLayoutBinding.inflate(inflater, container, false)
    }

    override fun injectFeatureComponent(applicationProvider: ApplicationProvider) {
        AllImageScreenComponent.init(applicationProvider).inject(this)
    }

}