package com.ivisondsb.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onStart() {
        super.onStart()
        text.text = intent.getStringExtra("TEXT_VALUE")
        Log.i("LOG", "onStart()")
    }

    override fun onResume() {
        super.onResume()

        Log.i("LOG", "onResume() Second Activity")

        button.setOnClickListener {

            val data = Intent()
            data.putExtra("RETURN", edtt.text.toString())
            setResult(RESULT_OK, data)
            finish()
        }
    }
}