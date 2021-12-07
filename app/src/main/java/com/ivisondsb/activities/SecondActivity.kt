package com.ivisondsb.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onResume() {
        super.onResume()

        Log.i("LOG", "onResume() Second Activity" + System.currentTimeMillis())

        button.setOnClickListener {
            finish()
        }
    }
}