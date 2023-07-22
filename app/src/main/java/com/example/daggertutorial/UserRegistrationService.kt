package com.example.daggertutorial

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
//    @Named("sql")val userRepository: UserRepository,
    @SqlAnnotation val userRepository: UserRepository,
    val emailService: NotificationService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send("billi@gmail.com", "ankit@gmail.com", "Welcome to our organisation")
    }

}