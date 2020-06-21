package com.example.flightmobileapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "UrlTableDatabase")
class Url_Entity {
    @PrimaryKey
    var url_id: Int = 0

    @ColumnInfo(name = "URL_NAME")
    var url_name: String = ""

    @ColumnInfo(name = "URL_DATE")
    var url_date:Long = 0
}