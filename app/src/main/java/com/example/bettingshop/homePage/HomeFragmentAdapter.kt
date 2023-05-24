package com.example.bettingshop.homePage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.bettingshop.R

class HomeFragmentAdapter(
    private val context: Context,
    private val matches_list: List<HomeMatches>,
) : BaseAdapter() {
    override fun getCount(): Int {
        return matches_list.size
    }

    override fun getItem(position: Int): Any {
        return matches_list[position]
    }

    override fun getItemId(position: Int): Long {
        return matches_list[position].id.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val inflater = LayoutInflater.from(context)

        val view = inflater.inflate(R.layout.random_match,parent,false)

        val match = matches_list[position]

        val ivFlag1 = view.findViewById<ImageView>(R.id.ivmatch1)
        val ivFlag2 = view.findViewById<ImageView>(R.id.ivmatch2)
        val tvResult = view.findViewById<TextView>(R.id.tvresult)

        ivFlag1.setImageResource(match.flag1)
        ivFlag2.setImageResource(match.flag2)
        tvResult.text = match.result

        return view
    }
}