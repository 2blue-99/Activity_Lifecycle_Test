package com.example.myapplication0609

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondeActivity : AppCompatActivity() {
    init {
        Log.e("TAG", "SecondeActivity: ", )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("TAG", "SecondeActivity onCreate: ", )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seconde)
    }

    override fun onRestart() {
        Log.e("TAG", "SecondeActivity onRestart: ", )
        super.onRestart()
    }

    override fun onStart() {
        Log.e("TAG", "SecondeActivity onStart: ", )
        super.onStart()
    }

    override fun onResume() {
        Log.e("TAG", "SecondeActivity onResume: ", )
        findViewById<Button>(R.id.button2).setOnClickListener {
            finish()
        }

        super.onResume()
    }

    override fun onPause() {
        Log.e("TAG", "SecondeActivity onPause: ", )
        super.onPause()
    }

    override fun onStop() {
        Log.e("TAG", "SecondeActivity onStop: ", )
        super.onStop()
    }

    override fun onDestroy() {
        Log.e("TAG", "SecondeActivity onDestroy: ", )
        super.onDestroy()
    }
}