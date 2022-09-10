package com.example.bminternship.recyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.bminternship.R
import com.example.bminternship.news.Article
import com.example.bminternship.storage.FavouriteArticle
import com.example.bminternship.storage.NewsDatabase


class FavouritesRecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourites_recycler_view)
        val favRV= findViewById<RecyclerView>(R.id.favRecyclerView)
        val database=NewsDatabase.getInstance(this)
        val list=database.getArticleDao().getArticles()
        Log.i("Articles",list.toString())
//        var adapter: FavouriteArticle?= FavouriteArticle(list)
//        favRV.adapter=adapter
    }

}