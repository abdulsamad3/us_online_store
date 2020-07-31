package com.iqonic.usonlinestore.activity

import android.os.Bundle
import com.iqonic.usonlinestore.AppBaseActivity
import com.iqonic.usonlinestore.R
import com.iqonic.usonlinestore.fragments.MyCartFragment
import com.iqonic.usonlinestore.utils.Constants.AppBroadcasts.CART_COUNT_CHANGE
import com.iqonic.usonlinestore.utils.extensions.BroadcastReceiverExt
import com.iqonic.usonlinestore.utils.extensions.addFragment
import com.iqonic.usonlinestore.utils.extensions.getCartListFromPref
import com.iqonic.usonlinestore.utils.extensions.launchActivityWithNewTask
import kotlinx.android.synthetic.main.toolbar.*

class MyCartActivity : AppBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_cart)
        setToolbar(toolbar)
        title = getString(R.string.menu_my_cart)

        val fr = MyCartFragment()
        addFragment(fr, R.id.container)
        BroadcastReceiverExt(this) {
            onAction(CART_COUNT_CHANGE) {
                if (fr.isAdded) {
                    fr.invalidateCartLayout(getCartListFromPref())
                }
            }
        }
    }

    fun shopNow() {
        launchActivityWithNewTask<DashBoardActivity>()
        finish()
    }

}
