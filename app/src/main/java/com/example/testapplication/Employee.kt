package com.example.testapplication

import android.util.Log

data class Employee(val name: String, val phoneNumber: String) {

    fun showEmployeeDetails() {
        Log.d("Log404", "showEmployee Name: $name")
        Log.d("Log404", "showEmployee Phone Number: $phoneNumber")
    }

}
