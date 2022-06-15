package com.example.myapplication1

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    private val msg = "App started: Second"

    companion object {


        fun launchActivity(context: Context) {
            val intent = Intent(context,  SecondActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(msg, "onCreate() function is started")
    }

    fun btnOnclickText(view: View?) {
        //TextView m=findViewById(R.id.txtMsg);

//        SecondActivity.Companion.launchActivity(this);
        val intent = Intent(applicationContext, SecondActivity::class.java)
        startActivity(intent)
    }
    override fun onStart() {
        super.onStart()
        Log.d(msg, " onStart() function")
    }

    override fun onResume() {
        super.onResume()
        Log.d(msg, "onResume() function")
    }

    override fun onPause() {
        super.onPause()
        Log.d(msg, "onPause() function")
    }

    override fun onStop() {
        super.onStop()
        Log.d(msg, "onStop() function")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(msg, "OnDestroy() is called")
    }

}