package com.example.daggertutorial

import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send(to:String,from:String,body:String){}
}

//class EmailService @Inject constructor() {
//        fun send(to:String,from:String,body:String){
//            Log.d("meow","Welcome email sent")
//        }
//}

class EmailService @Inject constructor():NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d("meow","Welcome email sent")
    }
}

class MessageService:NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d("meow","Welcome message sent")
    }
}

