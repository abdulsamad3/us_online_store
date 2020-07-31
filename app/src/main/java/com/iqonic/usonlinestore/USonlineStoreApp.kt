package com.iqonic.usonlinestore

import android.app.Dialog
import android.content.Context
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.google.android.gms.ads.MobileAds
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.iqonic.usonlinestore.network.RestApis
import com.iqonic.usonlinestore.utils.Constants
import com.iqonic.usonlinestore.utils.Constants.SharedPref.LANGUAGE
import com.iqonic.usonlinestore.utils.LocaleManager
import com.iqonic.usonlinestore.utils.SharedPrefUtils
import com.iqonic.usonlinestore.utils.extensions.getSharedPrefInstance
import com.iqonic.usonlinestore.utils.extensions.getUserId
import com.iqonic.usonlinestore.utils.extensions.isLoggedIn
import com.onesignal.OneSignal
import okhttp3.OkHttpClient
import uk.co.chrisjenx.calligraphy.CalligraphyConfig



class USonlineStoreApp : MultiDexApplication() {
    private var fb : DatabaseReference? = null
    override fun onCreate() {

        super.onCreate()
        appInstance = this
        getSharedPrefInstance().apply {
            appTheme = getIntValue(Constants.SharedPref.THEME, Constants.THEME.LIGHT)
            language = getStringValue(LANGUAGE,"en")
        }
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference()
        myRef.setValue("Sign Up!")
        fb= FirebaseDatabase.getInstance().reference


        // Set Custom Font
        CalligraphyConfig.initDefault(
                CalligraphyConfig.Builder().setDefaultFontPath(getString(R.string.font_regular)).setFontAttrId(
                        R.attr.fontPath
                ).build()
        )

        MobileAds.initialize(this) {}

        // OneSignal Initialization
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init()
        OneSignal.clearOneSignalNotifications()
    }


    fun enableNotification(isEnabled: Boolean) {
        OneSignal.setSubscription(isEnabled)
    }

    override fun attachBaseContext(base: Context) {
        localeManager = LocaleManager(base)
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    companion object {
        lateinit var localeManager: LocaleManager
        private lateinit var appInstance: USonlineStoreApp
        var restApis: RestApis? = null
        var okHttpClient: OkHttpClient? = null
        var sharedPrefUtils: SharedPrefUtils? = null
        var noInternetDialog: Dialog? = null
        lateinit var language: String
        var appTheme: Int = 0

        fun getAppInstance(): USonlineStoreApp {
            return appInstance
        }

        fun changeAppTheme(isDark: Boolean) {
            getSharedPrefInstance().apply {
                when {
                    isDark -> setValue(Constants.SharedPref.THEME, Constants.THEME.DARK)
                    else -> setValue(Constants.SharedPref.THEME, Constants.THEME.LIGHT)
                }
                appTheme = getIntValue(Constants.SharedPref.THEME, Constants.THEME.LIGHT)
            }

        }

        fun changeLanguage(aLanguage: String) {
            getSharedPrefInstance().setValue(LANGUAGE, aLanguage)
            language = aLanguage
        }


    }
}
