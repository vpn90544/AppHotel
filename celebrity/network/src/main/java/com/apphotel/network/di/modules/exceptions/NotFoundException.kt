package com.apphotel.network.di.modules.exceptions

import okhttp3.ResponseBody

class NotFoundException(responseBody: ResponseBody? = null) : HttpExceptionWithBody(responseBody)