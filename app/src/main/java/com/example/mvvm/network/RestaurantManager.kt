package com.example.mvvm.utils


import com.example.mvvm.common.BaseManager
import com.example.mvvm.common.NetworkHelper



class RestaurantManager(networkHelper: NetworkHelper, preferencesHelper: PreferencesHelper) : BaseManager(networkHelper), RestaurantApiInteraction {

    private val restaurantApiInteraction: RestaurantApiInteraction

    init {
        restaurantApiInteraction = RestaurantApiProvider(preferencesHelper)
    }


}