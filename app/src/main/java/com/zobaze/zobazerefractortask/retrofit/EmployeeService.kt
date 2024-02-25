package com.zobaze.zobazerefractortask.retrofit

import com.zobaze.zobazerefractortask.employee.model.EmployeeModel
import com.zobaze.zobazerefractortask.employee.model.EmployeeResponse
import retrofit2.Call
import retrofit2.http.GET

interface EmployeeService {

    @GET("employees")
    fun getEmployees(): Call<EmployeeResponse>
}