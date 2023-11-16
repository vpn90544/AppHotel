package com.apphotel.network.di.modules.exceptions

import okhttp3.ResponseBody

class NotAcceptableException(responseBody: ResponseBody? = null) : HttpExceptionWithBody(responseBody)