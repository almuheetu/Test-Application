package com.example.testapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmployeeAdapter(
    private val employeeList: ArrayList<Employee>
) : RecyclerView.Adapter<EmployeeAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val employeeName: TextView
        val employeeNumber: TextView

        init {
            employeeName = view.findViewById(R.id.tv_employeeList_employeeName)
            employeeNumber = view.findViewById(R.id.tv_employeeList_number)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.employee_list, viewGroup, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val employee = employeeList[position]
        viewHolder.employeeName.text = employee.name
        viewHolder.employeeNumber.text = employee.phoneNumber


    }

    override fun getItemCount(): Int {
        return employeeList.size

    }
}