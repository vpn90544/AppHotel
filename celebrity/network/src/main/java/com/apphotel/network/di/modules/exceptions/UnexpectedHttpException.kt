package com.apphotel.network.di.modules.exceptions

import okhttp3.ResponseBody

class UnexpectedHttpException(responseBody: ResponseBody? = null) : HttpExceptionWithBody(responseBody)