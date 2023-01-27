package com.geekbrains.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val test : Test = Test ()
        test.name()

    }
}

class Test constructor () {

    //lateinit var valI:String
   var valI = "jkljkl"
    fun name () {

Log.d("@@@",valI)
    }

}