package com.example.fragmenttest_20200608.fragments

import android.app.Fragment
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmenttest_20200608.R
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MyProfileFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container, false)
    }

    override fun setupEvents() {
        dialBtn.setOnClickListener {
//            String 가공시 text변수들은 묶여서 자동으로 String으로 변환
            val myUri = Uri.parse("tel:${phoneNumEdt.text}")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }
    }

    override fun setValues() {

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupEvents()
        setValues()
    }
}