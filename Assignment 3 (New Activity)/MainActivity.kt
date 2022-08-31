// Nooreldin Ayman
package com.example.bminternship

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRegister: Button=findViewById(R.id.btn_register)
        btnRegister.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent= Intent(this, RegisterACTIVITY::class.java)
        startActivity(intent)
    }
}