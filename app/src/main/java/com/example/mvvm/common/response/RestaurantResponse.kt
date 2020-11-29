package com.example.mvvm.common.response

data class RestaurantResponse(
    val restaurants: List<Restaurant>,
    val results_found: String,
    val results_shown: String,
    val results_start: String
)