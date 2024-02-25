package com.zobaze.zobazerefractortask.employee.model

import com.google.gson.annotations.SerializedName

data class EmployeeResponse(
    @SerializedName("status") val status: String,
    @SerializedName("data") var data: List<EmployeeModel>,
    @SerializedName("message") val message: String
)
