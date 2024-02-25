package com.zobaze.zobazerefractortask.employee.model

import com.google.gson.annotations.SerializedName

data class EmployeeModel(
    val id: Int,
    @SerializedName("employee_name")
    val name: String
)
