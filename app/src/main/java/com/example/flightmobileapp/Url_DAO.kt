package com.example.flightmobileapp

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface Url_DAO {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun saveUrl(url: Url_Entity)

    @Query("SELECT Distinct URL_NAME FROM UrlTableDatabase order by URL_DATE desc Limit 1")
    fun getLastUrl():String



}