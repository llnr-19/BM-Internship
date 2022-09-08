package com.example.mentortasks

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mentortasks.recyclerView.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnNext = findViewById<Button>(R.id.btn_toRecyclerView)
        btnNext.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.btn_toRecyclerView) {
            val intent = Intent(this, RecyclerView::class.java)
            startActivity(intent)
        }
    }
}
