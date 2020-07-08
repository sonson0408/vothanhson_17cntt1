package com.example.bt2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relative.*

class Relative : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)


        chuyenLiner.setOnClickListener {
            val intent : Intent = Intent(this@Relative, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
