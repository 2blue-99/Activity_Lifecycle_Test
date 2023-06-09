package com.example.myapplication0609

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    init {
        Log.e("TAG", "MainActivity: ", )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("TAG", "MainActivity onCreate: ", )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onRestart() {
        Log.e("TAG", "MainActivity onRestart: ", )
        super.onRestart()
    }

    override fun onStart() {
        Log.e("TAG", "MainActivity onStart: ", )
        super.onStart()
    }

    override fun onResume() {
        Log.e("TAG", "MainActivity onResume: ", )
        findViewById<Button>(R.id.button).setOnClickListener {
            val intent = Intent(this,SecondeActivity::class.java)
            startActivity(intent)
        }

        super.onResume()
    }

    override fun onPause() {
        Log.e("TAG", "MainActivity onPause: ", )
        super.onPause()
    }

    override fun onStop() {
        Log.e("TAG", "MainActivity onStop: ", )
        super.onStop()
    }

    override fun onDestroy() {
        Log.e("TAG", "MainActivity onDestroy: ", )
        super.onDestroy()
    }
}