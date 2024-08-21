package com.example.testapplication

import android.util.Log

data class Car(val name: String, val model: String) {
    fun showCarDetails() {
        Log.d("Log404", "Car Name: $name")
        Log.d("Log404", "Car Model: $model")
    }
}
