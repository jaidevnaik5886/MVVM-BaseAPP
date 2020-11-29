package com.example.mvvm.database.tables

import androidx.room.Entity

@Entity(
    tableName = "RestaurantTable"
)
data class RestaurantTable(
    var id: String = "",
    var restaurantName: String = "",
    var icon: String = "",
    var rating: String = "",
    var address: String = "",
    var status: Boolean = false
)