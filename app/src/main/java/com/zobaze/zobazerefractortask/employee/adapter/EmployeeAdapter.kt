package com.zobaze.zobazerefractortask.employee.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zobaze.zobazerefractortask.R
import com.zobaze.zobazerefractortask.databinding.EmployeeAdapterItemBinding
import com.zobaze.zobazerefractortask.employee.model.EmployeeModel

class EmployeeAdapter(private val employeeModelList: List<EmployeeModel>) :
    RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.employee_adapter_item, parent, false)
        return EmployeeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val postModel = employeeModelList[position]
        holder.bind(postModel)
    }

    override fun getItemCount(): Int {
        return employeeModelList.size
    }

    inner class EmployeeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = EmployeeAdapterItemBinding.bind(itemView)


        fun bind(employeeModel: EmployeeModel) {
            binding.employeeIdTxt.text = employeeModel.id.toString()
            binding.employeeNameTxt.text = employeeModel.name
        }
    }
}