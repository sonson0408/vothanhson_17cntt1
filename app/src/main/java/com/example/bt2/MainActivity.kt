package com.example.bt2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chuyenRelative.setOnClickListener {
            val intent:Intent = Intent(this@MainActivity, Relative::class.java)
            startActivity(intent)
        }
    }
}
