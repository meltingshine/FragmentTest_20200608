package com.example.fragmenttest_20200608

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity:AppCompatActivity() {
    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()


}