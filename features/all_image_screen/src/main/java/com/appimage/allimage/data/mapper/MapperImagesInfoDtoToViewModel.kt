package com.appimage.allimage.data.mapper

import com.appimage.allimage.data.dto.ImagesInfoPage
import com.appimage.core_ui.view.image_with_like.ImageLikeViewModel
import com.appimage.utils.adapter.DelegateItem

class MapperImagesInfoDtoToViewModel {

    fun mapToImageViewModels(dto: ImagesInfoPage) : List<DelegateItem>{
        val results = dto.results
        val listViewModels = ArrayList<DelegateItem>()
        for (result in results) {
            listViewModels.add(ImageLikeViewModel(id = result.id!!,
            imageUrl = result.image!!))
        }
        return listViewModels
    }
}