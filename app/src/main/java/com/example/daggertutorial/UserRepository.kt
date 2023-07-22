package com.example.daggertutorial

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email:String,password:String){}
}
class SQLUserRepository @Inject constructor():UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("meow","user data saved in sql ")
    }
}

class FirebaseUserRepository(private val returnCount:Int):UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("meow","user data saved in firebase ${returnCount.toString()}")
    }
}