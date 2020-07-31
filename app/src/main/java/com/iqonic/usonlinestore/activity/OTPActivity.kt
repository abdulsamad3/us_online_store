package com.iqonic.usonlinestore.activity

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.EditText
import com.iqonic.usonlinestore.AppBaseActivity
import com.iqonic.usonlinestore.R
import com.iqonic.usonlinestore.utils.OTPEditText
import com.iqonic.usonlinestore.utils.extensions.hide
import com.iqonic.usonlinestore.utils.extensions.onClick
import com.iqonic.usonlinestore.utils.extensions.show
import com.iqonic.usonlinestore.utils.extensions.startOTPTimer
import kotlinx.android.synthetic.main.activity_otp.*
import kotlinx.android.synthetic.main.layout_otp.*

class OTPActivity : AppBaseActivity() {

    private var mEds: Array<EditText?>? = null
    private var timer: CountDownTimer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)
        mEds = arrayOf(edDigit1, edDigit2, edDigit3, edDigit4)
        OTPEditText(mEds!!, this,getDrawable(R.color.transparent)!!,getDrawable(R.drawable.bg_unselected_dot)!!)
        mEds!!.forEachIndexed { index, editText ->
            editText?.onFocusChangeListener = focusChangeListener
        }
        timer = startOTPTimer(onTimerTick = {
            tvTimer.text = it
        }, onTimerFinished = {
            tvTimer.hide()
            llResend.show()
        })
        timer?.start()
        tvResend.onClick {
            tvTimer.show()
            llResend.hide()
            timer?.start()

        }
        ivBack.onClick {
            onBackPressed()
        }
    }

    private val focusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
        if (hasFocus)
            (v as EditText).background = getDrawable(R.color.transparent)
    }




}