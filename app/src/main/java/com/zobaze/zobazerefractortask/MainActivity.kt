package com.zobaze.zobazerefractortask

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.zobaze.zobazerefractortask.employee.viewmodel.EmployeeViewModel
import dagger.hilt.android.AndroidEntryPoint
import androidx.activity.viewModels
import com.zobaze.zobazerefractortask.databinding.EmployeeRecyclerviewBinding
import com.zobaze.zobazerefractortask.util.DialogUtil


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val employeeViewModel: EmployeeViewModel by viewModels()
    private lateinit var binding : EmployeeRecyclerviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = EmployeeRecyclerviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addEmployeeResponseErrorLiveDataObserver()
        initView()
        employeeViewModel.fetchEmployeeData()

    }

    private fun initView(){
        binding.viewModel = employeeViewModel
        binding.lifeCycleOwner = this
    }

    private fun addEmployeeResponseErrorLiveDataObserver(){
        employeeViewModel.employeeResponseErrorLiveData.observe(this){msg->
            showDialogMessage(msg)
        }
    }

    private fun showDialogMessage(errorMsg: String) {
        DialogUtil.showMessageDialogWithTryButton(this,"Alert",errorMsg){
            employeeViewModel.fetchEmployeeData()
        }
    }

}

