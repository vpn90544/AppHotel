package com.apphotel.network.di.modules.exceptions

import okhttp3.ResponseBody

class ForbiddenException(responseBody: ResponseBody? = null) : HttpExceptionWithBody(responseBody)