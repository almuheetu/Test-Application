package com.example.testapplication

import FirstFragment
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.testapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            val firstFragment = FirstFragment()
            supportFragmentManager.beginTransaction().add(R.id.fragment_container, firstFragment)
                .commit()

        }

        val employee1 = Employee("John Doe", "1234567890")
        val employee2 = Employee("Jane Smith", "0987654321")
        val employee3 = Employee("Bob Johnson", "5555555555")
        val employee4 = Employee("Alice Brown", "1112223333")
        val employee5 = Employee("Tom Wilson", "4445556666")
        val employee6 = Employee("Emily Davis", "7778889999")
        val employee7 = Employee("David Lee", "2223334444")
        val employee8 = Employee("Sarah Miller", "6667778888")
        val employee9 = Employee("Mike Clark", "9990001111")
        val employee10 = Employee("Jessica Taylor", "3334445555")



    }


}