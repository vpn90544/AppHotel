package com.apphotel.core_ui.view.image_with_like

import com.apphotel.utils.adapter.DelegateItem
import com.apphotel.utils.adapter.utils.checkChanges

data class ImageLikeViewModel (
    val id: Int,
    val imageUrl: String,
    val isLike: Boolean = false
): DelegateItem {

    override fun id(): Any {
        return id
    }

    override fun content(): Any {
        return this
    }

    override fun payload(other: Any): List<DelegateItem.Payloadable> {
        val item = other as? ImageLikeViewModel
        return checkChanges(
            mapOf(
                ImageLikeViewModel.ChangePayload.UrlImage to (imageUrl != item?.imageUrl),
                ImageLikeViewModel.ChangePayload.IsLike to (isLike != item?.isLike),
            )
        )
    }

    sealed class ChangePayload : DelegateItem.Payloadable {

        object UrlImage : ChangePayload()
        object IsLike : ChangePayload()
    }
}