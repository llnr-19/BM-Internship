package com.example.bminternship.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.bminternship.R

open class UpperFragment: Fragment(R.layout.upper_fragment) {
    private lateinit var btnAddOne: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //btnAddOne= view.findViewById(R.id.btn_add_one)
    }

    fun display(){
        //btnAddOne.text="Changed"
        Toast.makeText(requireContext(),"Upper Fragment",Toast.LENGTH_LONG).show()
    }

}