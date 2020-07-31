package com.iqonic.usonlinestore.activity

import android.os.Bundle
import com.iqonic.usonlinestore.AppBaseActivity
import com.iqonic.usonlinestore.R
import com.iqonic.usonlinestore.fragments.ProfileFragment
import com.iqonic.usonlinestore.utils.extensions.addFragment
import kotlinx.android.synthetic.main.toolbar.*

class EditProfileActivity : AppBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        setToolbar(toolbar)
        title=getString(R.string.lbl_edit_profile)
        addFragment(ProfileFragment(),R.id.profilecontainer)
    }
}
