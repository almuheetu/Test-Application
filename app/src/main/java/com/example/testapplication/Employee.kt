package com.example.testapplication

import android.util.Log

data class Employee(val name: String, val phoneNumber: String) {

    fun showEmployeeDetails() {
        Log.d("Log404", "Employee Name: $name")
        Log.d("Log404", "Employee Phone Number: $phoneNumber")
    }

}
