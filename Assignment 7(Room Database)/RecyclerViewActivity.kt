package com.example.bminternship.recyclerView

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.bminternship.R
import com.example.bminternship.news.Everything
import com.example.mentortasks.news.service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
const val newsApiKey = "2f34552806514120ab7ee0e12fed6907"
class RecyclerViewActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        val btnFavRV=findViewById<Button>(R.id.btn_fav_recyclerView)
        btnFavRV.setOnClickListener(this)
        requestEverything()
    }

    private fun requestEverything() {
        service.getEverything("bitcoin", newsApiKey)
            .enqueue(object : Callback<Everything> {
                override fun onResponse(call: Call<Everything>, response: Response<Everything>) {
                    if (response.isSuccessful) {
                        //val titles = response.body()?.articles?.map { it.title }
                        val adapter = ItemAdapter(response.body()?.articles!!)
                        val recyclerView=findViewById<RecyclerView>(R.id.recycleView)
                            recyclerView.adapter = adapter
                    }
                }

                override fun onFailure(call: Call<Everything>, t: Throwable) {
                    Toast.makeText(this@RecyclerViewActivity,t.localizedMessage, Toast.LENGTH_LONG).show()
                }

            }
            )
    }

    override fun onClick(p0: View?) {
        val intent=Intent(this,FavouritesRecyclerViewActivity::class.java)
        startActivity(intent)
    }
}