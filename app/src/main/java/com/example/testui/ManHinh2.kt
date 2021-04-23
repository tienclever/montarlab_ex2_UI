package com.example.testui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_man_hinh2.*

class ManHinh2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_man_hinh2)


        btnToThree.setOnClickListener {
            val intent  = Intent(this, ManHinh3::class.java)
            startActivity(intent)
            finish()
        }

        imageView8.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}