package com.example.mentortasks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ActivityLifecycleFunctions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle_functions)

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }



}