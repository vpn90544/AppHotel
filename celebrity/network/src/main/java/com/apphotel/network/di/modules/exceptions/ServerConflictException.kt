package com.apphotel.network.di.modules.exceptions

import okhttp3.ResponseBody

class ServerConflictException(responseBody: ResponseBody? = null) : HttpExceptionWithBody(responseBody)