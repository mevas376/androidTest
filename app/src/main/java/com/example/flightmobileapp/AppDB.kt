package com.example.flightmobileapp

import androidx.room.Database
import androidx.room.RoomDatabase

//views = [(Url_Entity::class)]
@Database(entities = [(Url_Entity::class)], version = 1)
abstract class AppDB : RoomDatabase() {

    abstract fun urlDAO(): Url_DAO
}