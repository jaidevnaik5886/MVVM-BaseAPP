package com.example.mvvm.utils

import com.example.mvvm.common.response.RestaurantResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

class RestaurantApiProvider(preferencesHelper: PreferencesHelper) : NetworkProvider(preferencesHelper), RestaurantApiInteraction {

    private val restaurantAPIService: RestaurantAPIService

    init {
        restaurantAPIService = create(RestaurantAPIService::class.java)
    }



    private interface RestaurantAPIService {

        @Headers("Content-Type: application/json")
        @GET(HttpConstants.API_GET_RESTAURANTS)
       suspend fun getNearbyRestaurants(@Query("q") keyword: String): Response<RestaurantResponse>

    }
}