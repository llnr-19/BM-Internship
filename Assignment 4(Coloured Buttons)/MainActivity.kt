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

        val btnRegister: Button = findViewById(R.id.btn_register)
        btnRegister.setOnClickListener(this)
        val btnColoured = findViewById<Button>(R.id.btn_coloured_activity)
        btnColoured.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (p0?.id == R.id.btn_register) {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        } else if (p0?.id == R.id.btn_coloured_activity) {
            val intent = Intent(this, ColouredButtonsActivity::class.java)
            startActivity(intent)
        }
    }
}