package com.example.bminternship.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.bumptech.glide.Glide
import com.example.bminternship.R
import com.example.bminternship.news.Article
import com.example.bminternship.storage.FavouriteArticle
import com.example.bminternship.storage.DataBasic
import com.example.bminternship.storage.NewsDatabase


class ItemAdapter(var items: List<Article?>?) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(),
    View.OnClickListener {
//    var texts = arrayOf(
//        "one",
//        "two",
//        "three",
//        "four",
//        "five",
//        "six",
//        "seven",
//        "eight",
//        "nine",
//        "ten",
//        "eleven",
//        "twelve"
//    )
//    var image = intArrayOf(
//        R.drawable.android, R.drawable.android, R.drawable.android,
//        R.drawable.android, R.drawable.android, R.drawable.android,
//        R.drawable.android, R.drawable.android, R.drawable.android,
//        R.drawable.android, R.drawable.android, R.drawable.android
//    )

    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var textView: TextView? = null
        var imagePhoto: ImageView? = null
        private val btnFav = view.findViewById<Button>(R.id.btn_fav)

        init {
            btnFav.setOnClickListener {
               val database = Room.databaseBuilder(
                    itemView.context,
                    NewsDatabase::class.java,
                    "NewsDatabase.db"
                )
                    .allowMainThreadQueries().build()
                val list=FavouriteArticle(
                    title=items?.get(adapterPosition)?.title!!,
                    description=items?.get(adapterPosition)?.description!!,
                    url=items?.get(adapterPosition)?.url!!,
                    urlToImage=items?.get(adapterPosition)?.urlToImage!!)
//                    0,
//                    items?.get(adapterPosition)?.title!!,
//                    items?.get(adapterPosition)?.description!!,
//                    items?.get(adapterPosition)?.url!!,
//                    items?.get(adapterPosition)?.urlToImage!!
//                )
                database.getArticleDao()
                    .insert(list)

            }
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
        val article = items?.get(position)
        Glide.with(holder.itemView)
            .load(article?.urlToImage)
            .into(holder.imagePhoto!!)
//        holder.textView?.text=texts[position]
//        holder.imagePhoto?.setImageResource(image[position])
        holder.textView?.text = article?.title
    }

    override fun getItemCount(): Int {
        return items?.size ?: 0
    }

    override fun onClick(p0: View?) {
        Toast.makeText(RecyclerViewActivity(), "Article Added", Toast.LENGTH_LONG).show()

    }

}
