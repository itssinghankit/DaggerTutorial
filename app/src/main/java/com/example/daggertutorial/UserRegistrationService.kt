package com.example.daggertutorial

class UserRegistrationService(val userRepository: UserRepository,val emailService: EmailService){

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        emailService.send("billi@gmail.com","ankit@gmail.com","Welcome to our organisation")
    }

}