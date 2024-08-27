package com.example.testapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.databinding.CarListXmlBinding

class CarAdapter(
    private var carList: ArrayList<Car>
) :
    RecyclerView.Adapter<CarAdapter.ViewHolder>() {
    class ViewHolder(val binding: CarListXmlBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding =
            CarListXmlBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(
        viewHolder: ViewHolder,
        position: Int
    ) {
        val car = carList[position]
        viewHolder.binding.tvCarListCarName.text = car.name
        viewHolder.binding.tvCarListCarModel.text = car.model

    }

    override fun getItemCount(): Int {
        return carList.size
    }
}



