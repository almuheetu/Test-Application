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

        //Employee related
        val employee1 = Employee("John Doe", "1234567890")
        employee1.showEmployeeDetails()
        val employee2 = Employee("Jane Smith", "0987654321")
        employee2.showEmployeeDetails()
        val employee3 = Employee("Bob Johnson", "5555555555")
        employee3.showEmployeeDetails()
        val employee4 = Employee("Alice Brown", "1112223333")
        employee4.showEmployeeDetails()
        val employee5 = Employee("Tom Wilson", "4445556666")
        employee5.showEmployeeDetails()
        val employee6 = Employee("Emily Davis", "7778889999")
        employee6.showEmployeeDetails()
        val employee7 = Employee("David Lee", "2223334444")
        employee7.showEmployeeDetails()
        val employee8 = Employee("Sarah Miller", "6667778888")
        employee8.showEmployeeDetails()
        val employee9 = Employee("Mike Clark", "9990001111")
        employee9.showEmployeeDetails()
        val employee10 = Employee("Jessica Taylor", "3334445555")
        employee10.showEmployeeDetails()
        val employee11 = Employee("Chris Anderson", "8889990000")
        employee11.showEmployeeDetails()
        val employee12 = Employee("Laura Martinez", "1231231234")
        employee12.showEmployeeDetails()
        val employee13 = Employee("Brian Garcia", "4564564567")
        employee13.showEmployeeDetails()
        val employee14 = Employee("Karen Robinson", "7897897890")
        employee14.showEmployeeDetails()
        val employee15 = Employee("Kevin Wright", "1212121212")
        employee15.showEmployeeDetails()
        val employee16 = Employee("Melissa Hall", "3434343434")
        employee16.showEmployeeDetails()
        val employee17 = Employee("Jason Young", "5656565656")
        employee17.showEmployeeDetails()
        val employee18 = Employee("Stephanie Turner", "7878787878")
        employee18.showEmployeeDetails()


        //Car related
        val car1 = Car("Toyota", "Camry")
        car1.showCarDetails()
        val car2 = Car("Honda", "Civic")
        car2.showCarDetails()
        val car3 = Car("Ford", "Mustang")
        car3.showCarDetails()
        val car4 = Car("Chevrolet", "Malibu")
        car4.showCarDetails()
        val car5 = Car("Nissan", "Altima")
        car5.showCarDetails()
        val car6 = Car("BMW", "3 Series")
        car6.showCarDetails()
        val car7 = Car("Mercedes-Benz", "C-Class")
        car7.showCarDetails()
        val car8 = Car("Audi", "A4")
        car8.showCarDetails()
        val car9 = Car("Volkswagen", "Golf")
        car9.showCarDetails()
        val car10 = Car("Hyundai", "Elantra")
        car10.showCarDetails()
        val car11 = Car("Kia", "Sportage")
        car11.showCarDetails()
        val car12 = Car("Subaru", "Outback")
        car12.showCarDetails()
        val car13 = Car("Mazda", "Mazda3")
        car13.showCarDetails()
        val car14 = Car("Lexus", "RX")
        car14.showCarDetails()
        val car15 = Car("Tesla", "Model S")
        car15.showCarDetails()
        val car16 = Car("Jeep", "Wrangler")
        car16.showCarDetails()
        val car17 = Car("Tesla", "Model S")
        car17.showCarDetails()
        val car18 = Car("Lamborghini", "Huracan")
        car18.showCarDetails()


    }


}