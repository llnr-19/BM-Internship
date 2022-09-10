package com.example.bminternship.storage


import android.content.Context
import androidx.room.*

@Entity
data class FavouriteArticle(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val description:String,
    val url: String,
    var urlToImage: String
)

@Dao interface FavouriteArticleDao {
    @Query("SELECT*FROM FavouriteArticle")
    fun getArticles(): List<FavouriteArticle>
    @Insert
    fun insert(article:FavouriteArticle)

}

@Database(entities = [FavouriteArticle::class], version = 1)
abstract class NewsDatabase:RoomDatabase(){
     abstract fun getArticleDao():FavouriteArticleDao

    companion object {
        @Volatile
        private var INSTANCE: NewsDatabase? = null
        fun getInstance (context: Context): NewsDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NewsDatabase::class.java,
                    "NewsDatabase.db"
                )
                    .allowMainThreadQueries()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}