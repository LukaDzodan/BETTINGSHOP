package com.example.bettingshop.menuBar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.bettingshop.R

class MenuBarAdapter(
    private val context : Context,
    private val menuBar_list : List<MenuBar>,
) : BaseAdapter() {
    override fun getCount(): Int {
       return  menuBar_list.size
    }

    override fun getItem(position: Int): Any {
        return menuBar_list[position]
    }

    override fun getItemId(position: Int): Long {
        return menuBar_list[position].id.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val inflater  = LayoutInflater.from(context)

        val view = inflater.inflate(R.layout.menu_button,parent,false)

        val barItem = menuBar_list[position]

        val ivButtonImage = view.findViewById<ImageView>(R.id.ivButtonImage)
        val tvButtonTittle = view.findViewById<TextView>(R.id.tvButtonTittle)

        ivButtonImage.setImageResource(barItem.image)
        tvButtonTittle.text = barItem.title

        return view
    }

}

