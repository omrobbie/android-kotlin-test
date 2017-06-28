package com.omrobbie.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.setText("text ini di ubah dengan kotlin")
        button.setOnClickListener {
            Toast.makeText(this, "toast ini muncul dengan kotlin", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
        }
    }
}
