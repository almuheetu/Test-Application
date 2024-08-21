package com.example.testapplication

import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmployeeAdapter(
    var dataset: ArrayList<Employee>
) :
    RecyclerView.Adapter<EmployeeAdapter.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val carName = TextView
        val carModel = TextView

        init {
            carName = view.findViewById(R.id.tv_carList_carName)
            carModel = view.findViewById(R.id.tv_carList_carModel)
        }

    }


    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.car_list_xml, viewGroup, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(
        viewHolder: ViewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}