package com.example.mentortasks.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mentortasks.R


class ItemAdapter : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    var texts = arrayOf(
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve"
    )
    var image = intArrayOf(
        R.drawable.android, R.drawable.android, R.drawable.android,
        R.drawable.android, R.drawable.android, R.drawable.android,
        R.drawable.android, R.drawable.android, R.drawable.android,
        R.drawable.android, R.drawable.android, R.drawable.android)
    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
         var textView: TextView? = null
         var imagePhoto: ImageView? = null

        init {
            textView = view.findViewById(R.id.itemTextView)
            imagePhoto = view.findViewById(R.id.itemImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_design, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.textView?.text=texts[position]
        holder.imagePhoto?.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return texts.size
    }
}