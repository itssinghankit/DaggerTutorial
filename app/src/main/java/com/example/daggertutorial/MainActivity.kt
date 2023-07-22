package com.example.daggertutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggertutorial.interfaces.DaggerUserRegistrationComponant
import com.example.daggertutorial.interfaces.UserRegistrationComponant
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService:UserRegistrationService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val userRepository=UserRepository()
//        val emailService=EmailService()
//        val userRegistrationService=UserRegistrationService(userRepository,emailService)

//        val component=DaggerUserRegistrationComponant.builder().build()
//        val userRegistrationService=component.getUserRegistrationService()

//        val component=DaggerUserRegistrationComponant.builder().build()
        //for dagger runtime object making
        val component=DaggerUserRegistrationComponant.builder().userRepositoryModule(UserRepositoryModule(3)).build()
        component.inject(this)
        userRegistrationService.registerUser("ankit@gmail.com","22334455")


    }
}