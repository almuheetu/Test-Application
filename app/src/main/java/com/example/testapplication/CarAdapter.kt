package com.example.testapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarAdapter(
    private var carList: ArrayList<Car>,
    private val listener: ItemClickListener,
) :
    RecyclerView.Adapter<CarAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val carName: TextView
        val carModel: TextView

        init {
            carName = view.findViewById(R.id.tv_carList_carName)
            carModel = view.findViewById(R.id.tv_carList_carModel)
        }
    }

    interface ItemClickListener {
        fun onItemClick(car: Car) {
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
        val car = carList[position]
        viewHolder.carName.text = car.name
        viewHolder.carModel.text = car.model

        viewHolder.itemView.setOnClickListener {
            listener.onItemClick(car)
        }
    }

    override fun getItemCount(): Int {
        return carList.size
    }
}



