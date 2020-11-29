package com.example.mvvm.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mvvm.database.tables.RestaurantTable
import com.example.mvvm.model.Restaurant


@Dao
interface RestaurantsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(restaurant: RestaurantTable): Boolean

    @Query("SELECT * FROM RestaurantTable")
    fun getAllRestaurants(): LiveData<RestaurantTable>

    @Delete
    suspend fun deleteRestaurant(restaurant: RestaurantTable)
}