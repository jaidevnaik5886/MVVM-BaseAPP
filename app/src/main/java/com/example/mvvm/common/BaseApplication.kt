package com.example.mvvm.common

import android.app.Application
import androidx.lifecycle.LifecycleObserver


import com.example.mvvm.utils.AppConstants
import com.example.mvvm.utils.AppPreferencesHelper
import com.example.mvvm.utils.PreferencesHelper
import com.example.mvvm.utils.Utilities


class BaseApplication : Application(), LifecycleObserver {

    private var networkHelper: NetworkHelper? = null
    private var preferencesHelper: PreferencesHelper? = null

    override fun onCreate() {
        super.onCreate()
   //     MultiDex.install(this)
        initNetworkHelper()
        initAppModules()
     //   ProcessLifecycleOwner.get().lifecycle.addObserver(this)
    }

    private fun initNetworkHelper() {
        networkHelper = object : NetworkHelper {
            override fun hasInternet(): Boolean? {
                return Utilities.isNetworkAvailable(applicationContext)
            }
        }
    }

    private fun initAppModules() {
        preferencesHelper = AppPreferencesHelper(this, AppConstants.PREF_FILE_NAME)
    }

    fun getNetworkHelper(): NetworkHelper? {
        return networkHelper
    }

    fun getPreferences(): PreferencesHelper? {
        return preferencesHelper
    }


}
