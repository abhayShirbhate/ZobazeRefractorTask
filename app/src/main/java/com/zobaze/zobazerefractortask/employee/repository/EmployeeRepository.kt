package com.zobaze.zobazerefractortask.employee.repository

import com.zobaze.zobazerefractortask.employee.listeners.FetchEmployeeApiListener

interface EmployeeRepository {
    fun fetchEmployees(fetchEmployeeApiListener: FetchEmployeeApiListener)
}