package com.example.mentortasks.recyclerView

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.mentortasks.R

class RecyclerView : AppCompatActivity() {
    private var adapter:ItemAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val recyclerViewItems=findViewById<RecyclerView>(R.id.recycleView)
        adapter=ItemAdapter()
        recyclerViewItems.adapter=adapter
    }

}