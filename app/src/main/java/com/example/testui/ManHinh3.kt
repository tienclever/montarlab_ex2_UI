package com.example.testui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_man_hinh3.*

class ManHinh3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_man_hinh3)

        Back.setOnClickListener {
            val intent = Intent(this, ManHinh2::class.java)
            startActivity(intent)
            finish()
        }
    }
}