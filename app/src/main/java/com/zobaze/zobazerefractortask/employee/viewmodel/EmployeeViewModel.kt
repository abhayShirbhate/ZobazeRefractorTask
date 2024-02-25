package com.zobaze.zobazerefractortask.employee.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zobaze.zobazerefractortask.employee.Response.ApiResult
import com.zobaze.zobazerefractortask.employee.listeners.FetchEmployeeApiListener
import com.zobaze.zobazerefractortask.employee.model.EmployeeModel
import com.zobaze.zobazerefractortask.employee.model.EmployeeResponse
import com.zobaze.zobazerefractortask.employee.repository.EmployeeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.ArrayList
import javax.inject.Inject

@HiltViewModel
class EmployeeViewModel @Inject constructor(private val repository: EmployeeRepository):  ViewModel(),FetchEmployeeApiListener{


    private val _employeesLiveData = MutableLiveData<EmployeeResponse>()
    val employeesLiveData: LiveData<EmployeeResponse> get() = _employeesLiveData

    private val _employeeResponseErrorLiveData = MutableLiveData<String>()
    val employeeResponseErrorLiveData get() = _employeeResponseErrorLiveData

    fun fetchEmployeeData(){
        repository.fetchEmployees(this)
    }

    override fun fetchEmployeeApiListenerCallBack(result: ApiResult<EmployeeResponse>) {
        when (result) {
            is ApiResult.Success -> {
                shuffleDataAccordingToRequirement(result.data)
            }

            is ApiResult.NoInternetConnection -> {
                _employeeResponseErrorLiveData.postValue(result.msg)
            }

            is ApiResult.Error -> {
                _employeeResponseErrorLiveData.postValue(result.msg)
            }
        }
    }


    private fun shuffleDataAccordingToRequirement(employeeResponse: EmployeeResponse){
        val newEmployeeList = ArrayList<EmployeeModel>()
        // shufflerSequence as per requirement
        val shufflerSequence = listOf(3,7,4)

        viewModelScope.launch(Dispatchers.IO) {
            for(shufflerItem in shufflerSequence){
                for (employeeModel in employeeResponse.data){
                    if (employeeModel.id%shufflerItem==0) newEmployeeList.add(employeeModel)
                }
            }
            // replacing list with new shuffle list
            employeeResponse.data = newEmployeeList

            _employeesLiveData.postValue(employeeResponse)
        }
    }


}