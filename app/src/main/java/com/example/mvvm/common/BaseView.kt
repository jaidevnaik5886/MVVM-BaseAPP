package com.example.mvvm.common

import com.example.mvvm.utils.PreferencesHelper

interface BaseView {

    fun hideLoading()

    fun showLoading()

    fun isNetworkAvailable(): Boolean

    fun getNoInternetMessage(): String?

    fun getNetworkHelper(): NetworkHelper

    fun getPreferences(): PreferencesHelper

    fun runOnUi(runnable: Runnable?)

    fun showNoInternetMsg()

}