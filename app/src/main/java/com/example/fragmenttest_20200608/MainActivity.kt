package com.example.fragmenttest_20200608

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenttest_20200608.adapters.MyAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var myAdapter :MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValues()
        setupEvents()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
    myAdapter = MyAdapter(supportFragmentManager)
        myViewPager.adapter = myAdapter
    }


}
