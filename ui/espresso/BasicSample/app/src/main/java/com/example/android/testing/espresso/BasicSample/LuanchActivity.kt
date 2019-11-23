package com.example.android.testing.espresso.BasicSample

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_luanch.*

class LuanchActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luanch)
        btnext.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java));
        }
    }
}
