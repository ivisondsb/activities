package com.ivisondsb.activities

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_main.button


class MainActivity : AppCompatActivity() {

    private lateinit var resultLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("LOG", "onCreate()")

        resultLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
                if (result.resultCode == Activity.RESULT_OK) {
                    val data: Intent? = result.data?.apply {
                        Toast.makeText(
                            this@MainActivity,
                            getStringExtra("RETURN"),
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                }
            }
    }

    override fun onStart() {
        super.onStart()

        Log.i("LOG", "onStart()")
    }

    override fun onResume() {
        super.onResume()

        Log.i("LOG", "onResume()")

        button.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("TEXT_VALUE", "Name")
            resultLauncher.launch(intent)
        }
    }

    override fun onPause() {
        super.onPause()

        Log.i("LOG", "onResume()")

    }

    override fun onStop() {
        super.onStop()

        Log.i("LOG", "onResume()")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("LOG", "onResume()")
    }
}