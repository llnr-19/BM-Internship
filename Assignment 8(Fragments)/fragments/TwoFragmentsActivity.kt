package com.example.bminternship.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.bminternship.R

class TwoFragmentsActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_fragments)

        val btnAddOne=findViewById<Button>(R.id.btn_add_one)
        btnAddOne.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
       //
    }
}