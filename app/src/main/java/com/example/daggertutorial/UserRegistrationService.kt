package com.example.daggertutorial

import javax.inject.Inject

class UserRegistrationService @Inject constructor(val userRepository: UserRepository,val emailService: NotificationService){

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        emailService.send("billi@gmail.com","ankit@gmail.com","Welcome to our organisation")
    }

}