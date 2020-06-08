package com.example.fragmenttest_20200608.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.R
import com.example.fragmenttest_20200608.datas.User

class UserAdapter(
    val mContext: Context,
    val resId:Int,
    val mList:List<User>) : ArrayAdapter<User>(mContext,resId,mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position:Int, convertView: View?, parent:ViewGroup): View {
        var tempRow = convertView
        tempRow?.let {

        }.let {
            tempRow = inf.inflate(com.example.fragmenttest_20200608.R.layout.user_list_item,null)

        }

        row = tempRow!!
        return row

    }


}
}