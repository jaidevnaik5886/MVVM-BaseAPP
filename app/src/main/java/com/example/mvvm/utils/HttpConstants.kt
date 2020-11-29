package com.example.mvvm.utils

import com.example.mvvm.BuildConfig


class HttpConstants {

    companion object {
        const val TIMEOUT: Long = 2
        const val VERSION: String = "v2.1/"
        const val BASE_URL: String = BuildConfig.SERVER_URL_ROOT
        const val API_GET_RESTAURANTS ="search?entity_id=13&entity_type=city&sort=rating&order=desc"
    }

    //https://developers.zomato.com/api/v2.1/search?entity_id=13&entity_type=city&q=Goa&sort=rating&order=desc
}