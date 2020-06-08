package com.example.fragmenttest_20200608.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.fragmenttest_20200608.fragments.MyProfileFragment
import com.example.fragmenttest_20200608.fragments.StudentListFragment

class MyAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> MyProfileFragment()
            else -> StudentListFragment()
        }

    }

        override fun getCount(): Int {
            return 2 //몇장쓰는지 써줌
        }


}