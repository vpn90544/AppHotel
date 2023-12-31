package com.apphotel.allimage.data

import com.apphotel.allimage.data.api.AllImagesService
import com.apphotel.allimage.data.models.ImagesInfoPage
import com.apphotel.core.di.qualifiers.DefaultNetworkApi
import kotlinx.coroutines.withContext
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

class AllImageRepository @Inject constructor(
    private val service: AllImagesService,
    @DefaultNetworkApi
    private val context: CoroutineContext
) {

    suspend fun getLoadNewImagesFromWeb(
        urlNewPage: String
    ): Result<ImagesInfoPage> {
        return withContext(context) {
            service.getImagesNewPage(urlNewPage)
        }
    }

    suspend fun getLoadDefaultImagesFromWeb(
    ): Result<ImagesInfoPage> {
        return withContext(context){
            service.getImagesDefault()
        }
    }
}