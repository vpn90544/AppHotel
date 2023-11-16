package com.apphotel.core_ui.view.image_with_like

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.apphotel.core_ui.R
import com.apphotel.core_ui.databinding.ImageLikeViewBinding
import com.apphotel.core_ui.view.Populatable
import com.squareup.picasso.Picasso

class ImageLikeView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr, defStyleRes),
    Populatable<ImageLikeViewModel>
{
    private val imageLikeViewBinding: ImageLikeViewBinding

    init {
        val inflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.image_like_view, this, true)
        imageLikeViewBinding = ImageLikeViewBinding.bind(this)
    }

    override fun populate(model: ImageLikeViewModel) {
        setLayoutParams()
        setMainImage(model)
        setImageIsLike(model)
    }

    private fun setLayoutParams(){
        resources.displayMetrics.heightPixels/4
        imageLikeViewBinding.mainContainer.layoutParams = LayoutParams(
            LayoutParams.MATCH_PARENT,
            resources.displayMetrics.heightPixels/4
        )
    }

    internal fun setMainImage(model: ImageLikeViewModel){
        Picasso.get().load(model.imageUrl).into(imageLikeViewBinding.imageMain)
    }

    internal fun setImageIsLike(model: ImageLikeViewModel){
        if (model.isLike) {
            imageLikeViewBinding.imageIsLike.setImageResource(R.drawable.like)
        } else {
            imageLikeViewBinding.imageIsLike.setImageResource(R.drawable.unlike)
        }

    }

    internal fun setClickListenerForLike(action: (ImageLikeViewModel)->Unit, model: ImageLikeViewModel) {
        imageLikeViewBinding.imageIsLike.setOnClickListener {
            action.invoke(model)
        }
    }
}