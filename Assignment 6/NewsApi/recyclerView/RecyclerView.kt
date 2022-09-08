package com.example.mentortasks.recyclerView

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.mentortasks.R
import com.example.mentortasks.news.Everything
import com.example.mentortasks.news.service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

const val newsApiKey = "2f34552806514120ab7ee0e12fed6907"

class RecyclerView : AppCompatActivity() {
    private var adapter: ItemAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        //val recyclerViewItems = findViewById<RecyclerView>(R.id.recycleView)

        requestEverything()
    }

    private fun requestEverything() {
        service.getEverything("bitcoin", newsApiKey)
            .enqueue(object : Callback<Everything> {
                override fun onResponse(call: Call<Everything>, response: Response<Everything>) {
                    if (response.isSuccessful) {
                        //val titles = response.body()?.articles?.map { it.title }
                        adapter = ItemAdapter(response.body()?.articles)
                        findViewById<RecyclerView>(R.id.recycleView).adapter = adapter
                    }
                }

                override fun onFailure(call: Call<Everything>, t: Throwable) {
                     Toast.makeText(this@RecyclerView,t.localizedMessage,Toast.LENGTH_LONG).show()
                }

            }
            )
    }
}