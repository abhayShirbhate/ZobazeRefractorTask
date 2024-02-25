package com.zobaze.zobazerefractortask.employee.listeners

import com.zobaze.zobazerefractortask.employee.Response.ApiResult
import com.zobaze.zobazerefractortask.employee.model.EmployeeResponse

interface FetchEmployeeApiListener {
    fun fetchEmployeeApiListenerCallBack(result: ApiResult<EmployeeResponse>)
}