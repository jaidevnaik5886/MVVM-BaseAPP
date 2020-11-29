package com.example.mvvm.model

data class Restaurant(var id: String = "",
                      var restaurantName: String = "",
                      var icon: String = "",
                      var rating: String = "",
                      var address: String = "",
                      var status: Boolean = false
)