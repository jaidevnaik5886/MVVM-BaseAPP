package com.example.mvvm.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mvvm.database.dao.RestaurantsDao
import com.example.mvvm.database.tables.RestaurantTable


@Database(
    entities = [RestaurantTable::class],
    version = 1
)
abstract class DataBaseProvider : RoomDatabase() {

    abstract fun getRestaurantDao(): RestaurantsDao

    companion object {
        @Volatile
        private var instance: DataBaseProvider? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also { instance = it }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                DataBaseProvider::class.java,
                "restaurant_db.db"
            ).build()
    }
}