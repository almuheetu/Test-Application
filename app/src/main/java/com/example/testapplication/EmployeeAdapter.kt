package com.example.testapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.databinding.EmployeeListBinding

class EmployeeAdapter(

    private val employeeList: ArrayList<Employee>

) : RecyclerView.Adapter<EmployeeAdapter.ViewHolder>() {

    class ViewHolder(val binding: EmployeeListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            EmployeeListBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val employee = employeeList[position]
        viewHolder.binding.tvEmployeeListEmployeeName.text = employee.name
        viewHolder.binding.tvEmployeeListNumber.text = employee.phoneNumber


    }

    override fun getItemCount(): Int {
        return employeeList.size

    }
}