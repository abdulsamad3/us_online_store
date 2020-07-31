package com.iqonic.usonlinestore

import android.app.Dialog
import android.content.Context
import android.content.res.Configuration
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.gms.ads.*
import com.iqonic.usonlinestore.USonlineStoreApp.Companion.noInternetDialog
import com.iqonic.usonlinestore.activity.DashBoardActivity
import com.iqonic.usonlinestore.utils.Constants.SharedPref.LANGUAGE
import com.iqonic.usonlinestore.utils.Constants.THEME.DARK
import com.iqonic.usonlinestore.utils.extensions.changeToolbarFont
import com.iqonic.usonlinestore.utils.extensions.getSharedPrefInstance
import com.iqonic.usonlinestore.utils.extensions.launchActivityWithNewTask
import com.iqonic.usonlinestore.utils.extensions.switchToDarkMode
import kotlinx.android.synthetic.main.layout_abmob.*
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper
import java.util.*
import com.iqonic.usonlinestore.USonlineStoreApp.Companion.noInternetDialog as noInternetDialog1


open class AppBaseActivity : AppCompatActivity() {
    private var progressDialog: Dialog? = null
    var language: Locale? = null
    private var themeApp: Int = 0
    var isAdShown=false

    fun setToolbarWithoutBackButton(mToolbar: Toolbar) {
        setSupportActionBar(mToolbar)
    }

    fun setToolbar(mToolbar: Toolbar) {
        setSupportActionBar(mToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        mToolbar.setNavigationIcon(R.drawable.ic_keyboard_backspace)
        mToolbar.changeToolbarFont()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        switchToDarkMode(USonlineStoreApp.appTheme == DARK)
        super.onCreate(savedInstanceState)
        noInternetDialog1 = null
        if (progressDialog == null) {
            progressDialog = Dialog(this)
            progressDialog?.window?.setBackgroundDrawable(ColorDrawable(0))
            progressDialog?.setContentView(R.layout.custom_dialog)
        }
        themeApp = USonlineStoreApp.appTheme
        language = Locale(USonlineStoreApp.language)
    }

    fun showBannerAds() {
        MobileAds.initialize(this, getString(R.string.ad_mob_app_id))
        val adMobBanner = AdView(this)
        adMobBanner.adSize = AdSize.BANNER
        adMobBanner.adUnitId = getString(R.string.ad_mob_banner_id)
        val adRequest: AdRequest = AdRequest.Builder()
            .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
            .build()
        adMobBanner.loadAd(adRequest)
        adMobBanner.adListener = object : AdListener() {
            override fun onAdLoaded() {
                runOnUiThread {
                    adView.visibility = View.VISIBLE
                }
            }
        }
        adView.setHorizontalGravity(Gravity.CENTER_HORIZONTAL)
        adView.addView(adMobBanner)
    }

    fun showInterstitialAd() {
        isAdShown=true
        MobileAds.initialize(this, getString(R.string.ad_mob_app_id))
        val requestBuilder = AdRequest.Builder()
        var interstitial = InterstitialAd(this)
        interstitial.adUnitId = getString(R.string.ad_mob_interstitial_id)
        interstitial.loadAd(requestBuilder.build())
        interstitial.adListener = object : AdListener() {
            override fun onAdLoaded() {
                interstitial.show()
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    fun showProgress(show: Boolean) {
        when {
            show -> {
                if (!isFinishing && !progressDialog!!.isShowing) {
                    progressDialog?.setCanceledOnTouchOutside(false)
                    progressDialog?.show()
                }
            }
            else -> try {
                if (progressDialog?.isShowing!! && !isFinishing) {
                    progressDialog?.dismiss()
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    private fun changeLanguage(context: Context, locale: Locale): Context {
        Locale.setDefault(locale)
        val config = Configuration()
        config.setLocale(locale)
        config.setLayoutDirection(locale)
        return context.createConfigurationContext(config)
    }

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(updateBaseContextLocale(newBase!!)))
    }

    private fun updateBaseContextLocale(context: Context): Context {
        val language = getSharedPrefInstance().getStringValue(LANGUAGE, "en")
        val locale = Locale(language)
        Locale.setDefault(locale)
        return changeLanguage(context, locale)

    }

    override fun onStart() {
        Log.d("onStart", "called")
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
        val locale = Locale(USonlineStoreApp.language)
        val appTheme = USonlineStoreApp.appTheme
        if (language != null && locale != language) {
            recreate()
            return
        }
        if (themeApp != 0 && themeApp != appTheme) {
            launchActivityWithNewTask<DashBoardActivity>()
        }

    }
}
