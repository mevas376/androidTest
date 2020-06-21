package com.example.flightmobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Thread {
            var db= Room.databaseBuilder(applicationContext, AppDB ::class.java, "UrlTableDatabase").build()

            var url = Url_Entity()
            url.url_name = "ahavatya"
            url.url_date = System.currentTimeMillis()
            db.urlDAO().saveUrl(url)
            db.urlDAO().getLastUrl()
            Log.i("blabla",db.urlDAO().getLastUrl() )
            Log.d("MYTAG", "current position is: " )


        }.start()

//        Thread{
//            var db:AppDataBase=AppDataBase.getInstance(this)
//            //save
//            var url = Url_Entity()
//            url.url_name = a
//            url.URL_Date= System.currentTimeMillis()
//            db.urlDAO().saveUrl(url)
//            //db.urlDAO().deleteAll()
//        }.start()
    }
}