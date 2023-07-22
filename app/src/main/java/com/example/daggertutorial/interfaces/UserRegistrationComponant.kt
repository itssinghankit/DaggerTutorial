package com.example.daggertutorial.interfaces

import com.example.daggertutorial.MainActivity
import com.example.daggertutorial.NotificationServiceModule
import com.example.daggertutorial.UserRegistrationService
import com.example.daggertutorial.UserRepositoryModule
import dagger.BindsInstance
import dagger.Component

@Component(modules = [UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegistrationComponant {

//    fun getUserRegistrationService():UserRegistrationService
//    fun getEmailservice():EmailService

    //instead of making 100 of these funtions to get required objects or dependencies we can create a function and pass the consumer to it
    fun inject(mainActivity: MainActivity)

//    @Component.Factory
//    interface Factory{
//        fun create(@BindsInstance returnCount:Int):UserRegistrationComponant
//    }
}