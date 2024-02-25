package com.zobaze.zobazerefractortask.employee.repository

import com.zobaze.zobazerefractortask.employee.Response.ApiResult
import com.zobaze.zobazerefractortask.employee.listeners.FetchEmployeeApiListener
import com.zobaze.zobazerefractortask.employee.model.EmployeeResponse
import com.zobaze.zobazerefractortask.retrofit.EmployeeService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import javax.inject.Inject

class EmployeeRepositoryImpl @Inject constructor(private val employeeService: EmployeeService) : EmployeeRepository {

    override fun fetchEmployees(fetchEmployeeApiListener: FetchEmployeeApiListener) {
        employeeService.getEmployees().enqueue(object : Callback<EmployeeResponse> {
            override fun onResponse(
                call: Call<EmployeeResponse>,
                response: Response<EmployeeResponse>
            ) {
                if (response.isSuccessful && response.body() != null) {
                    fetchEmployeeApiListener.fetchEmployeeApiListenerCallBack(ApiResult.Success(response.body()!!))
                } else fetchEmployeeApiListener.fetchEmployeeApiListenerCallBack(ApiResult.Error("Something went wrong, please try again!! \n responseCode ${response.code()}"))

            }

            override fun onFailure(call: Call<EmployeeResponse>, t: Throwable) {
                if (t is SocketTimeoutException || t is UnknownHostException) {
                    fetchEmployeeApiListener.fetchEmployeeApiListenerCallBack(ApiResult.NoInternetConnection("Please check internet connection and try again!!"))
                } else fetchEmployeeApiListener.fetchEmployeeApiListenerCallBack(ApiResult.Error("Something went wrong, please try again!!"))
            }
        })
    }
}