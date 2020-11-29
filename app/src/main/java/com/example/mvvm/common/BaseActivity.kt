package com.example.mvvm.common;

import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvm.R
import com.example.mvvm.utils.PreferencesHelper
import com.example.mvvm.utils.Utilities
import kotlinx.android.synthetic.main.layout_progress.*

open class BaseActivity : AppCompatActivity(), BaseView, NetworkHelper {

    fun getBaseApp(): BaseApplication? {
        return application as BaseApplication
    }

    override fun hideLoading() {
        cl_loader.visibility = View.GONE
    }

    override fun showLoading() {
        cl_loader.visibility = View.VISIBLE
    }

    override fun isNetworkAvailable(): Boolean {
        return Utilities.isNetworkAvailable(this)
    }

    override fun getNoInternetMessage(): String? {
        return getString(R.string.no_internet_connection)
    }

    override fun getNetworkHelper(): NetworkHelper {
        return this
    }

    override fun runOnUi(runnable: Runnable?) {
        runOnUiThread(runnable)
    }

    override fun hasInternet(): Boolean? {
        return isNetworkAvailable()
    }

    override fun getPreferences(): PreferencesHelper {
        return getBaseApp()!!.getPreferences()!!
    }

    override fun showNoInternetMsg() {
        Toast.makeText(this, getNoInternetMessage(), Toast.LENGTH_SHORT).show()
    }
}


