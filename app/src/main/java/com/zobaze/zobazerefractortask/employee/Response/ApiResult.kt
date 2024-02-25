package com.zobaze.zobazerefractortask.employee.Response

sealed class ApiResult<T> {
    class Success<T>(val data: T): ApiResult<T>()
    class NoInternetConnection<T>(val msg: String): ApiResult<T>()
    class Error<T>(val msg: String): ApiResult<T>()
}