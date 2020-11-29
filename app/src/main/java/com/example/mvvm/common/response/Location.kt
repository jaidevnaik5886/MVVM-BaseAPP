package com.example.mvvm.common.response

data class Location(
    val address: String,
    val city: String,
    val country_id: String,
    val latitude: String,
    val locality: String,
    val longitude: String,
    val zipcode: String
)