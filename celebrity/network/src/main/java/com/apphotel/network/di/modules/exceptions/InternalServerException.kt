package com.apphotel.network.di.modules.exceptions

import okhttp3.ResponseBody

class InternalServerException(responseBody: ResponseBody? = null) : HttpExceptionWithBody(responseBody)