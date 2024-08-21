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
//            val firstFragment = FirstFragment()
//            supportFragmentManager.beginTransaction().add(R.id.fragment_container, firstFragment)
//                .commit()

//            val secondFragment = SecondFragment()
//            supportFragmentManager.beginTransaction().add(R.id.second_fragment_container, secondFragment)
//                .commit()

            val thirdFragment = ThirdFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.third_fragment_container, thirdFragment)
                .commit()


        }

    }


}