package com.sabakarim.fotoedit_pro

import android.app.Application

/**
 * Created by Hamza Iqbal on 29/11/2023.
 */
class PhotoApp : Application() {
    override fun onCreate() {
        super.onCreate()
        photoApp = this
    }

    companion object {
        var photoApp: PhotoApp? = null
            private set
        private val TAG = PhotoApp::class.java.simpleName
    }
}