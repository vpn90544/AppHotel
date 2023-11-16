package com.apphotel.network.di.modules.exceptions

import okhttp3.ResponseBody

class BadRequestException(responseBody: ResponseBody? = null) : HttpExceptionWithBody(responseBody)