package com.zobaze.zobazerefractortask.employee.bindingAdapter

import androidx.databinding.BindingAdapter
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zobaze.zobazerefractortask.employee.adapter.EmployeeAdapter
import com.zobaze.zobazerefractortask.employee.model.EmployeeModel
import com.zobaze.zobazerefractortask.employee.viewmodel.EmployeeViewModel

object EmployeeBindingAdapter {

    @JvmStatic
    @BindingAdapter("setEmployeeList","lifeCycleOwner",)
    fun RecyclerView.setEmployeeList(viewModel: EmployeeViewModel, lifecycleOwner: LifecycleOwner){
        viewModel.employeesLiveData.observe(lifecycleOwner){ response->
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            adapter = getAdapter(response.data)
        }
    }

    fun getAdapter(employeeModelList : List<EmployeeModel>): EmployeeAdapter {
        return EmployeeAdapter(employeeModelList)
    }

}