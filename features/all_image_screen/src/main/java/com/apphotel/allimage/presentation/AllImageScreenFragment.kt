package com.apphotel.allimage.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.apphotel.allimage.databinding.AllImageLayoutBinding
import com.apphotel.allimage.di.AllImageScreenComponent
import com.apphotel.arch.fragment.BaseFragment
import com.apphotel.core.di.providers.ApplicationProvider
import com.apphotel.core_ui.view.image_with_like.ImageLikeDelegateAdapter
import com.apphotel.utils.adapter.CompositeAdapter
import com.apphotel.utils.adapter.decorator.DecoratorParams
import com.apphotel.utils.adapter.decorator.ItemsDecorator
import com.apphotel.utils.listeners.setScrollListenerForPaginationInRecycler

class AllImageScreenFragment
    : BaseFragment<AllImageScreenState, AllImageScreenViewModel, AllImageLayoutBinding>() {

    private val compositeAdapter by lazy {
        CompositeAdapter.Builder()
            .add(ImageLikeDelegateAdapter {
                setFragmentResult(REQUEST_KEY, bundleOf(BUNDLE_KEY to RESULT))
            })
            .build()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setSettingRecycler()
    }

    private fun setSettingRecycler() {
        viewBinding.recyclerView.layoutManager = GridLayoutManager(
            activity,2, RecyclerView.VERTICAL,false
        )
        viewBinding.recyclerView.adapter = compositeAdapter
        viewBinding.recyclerView.addItemDecoration(
            ItemsDecorator(
                DecoratorParams(
                    DEFAULT_VALUE_FOR_ITEM_DECORATOR,
                    DEFAULT_VALUE_FOR_ITEM_DECORATOR,
                    DEFAULT_VALUE_FOR_ITEM_DECORATOR,
                    DEFAULT_VALUE_FOR_ITEM_DECORATOR
                )
            )
        )
        viewBinding.recyclerView.setScrollListenerForPaginationInRecycler(
            viewBinding.progressRefresh,
            viewBinding.progressLoading,
            actionForRefresh = {},
            actionForLoading = { }

        )
    }

    override fun handleUiState(uiState: AllImageScreenState) {
        super.handleUiState(uiState)
        compositeAdapter.submitList(
            uiState.list
        )
        if (uiState.isRefresh) {
            viewBinding.progressRefresh.visibility = View.VISIBLE
        } else viewBinding.progressRefresh.visibility = View.GONE
        if (uiState.isLoadingNewPage) {
            viewBinding.progressLoading.visibility = View.VISIBLE
        } else {viewBinding.progressLoading.visibility = View.GONE}
    }

    companion object {

        private const val REQUEST_KEY = "requestKey"
        private const val BUNDLE_KEY = "bundleKey"
        private const val RESULT = "updateCountLikeImages"
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