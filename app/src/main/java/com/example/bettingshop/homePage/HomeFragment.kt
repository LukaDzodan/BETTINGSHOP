package com.example.bettingshop.homePage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.ListView
import com.example.bettingshop.R


class HomeFragment : Fragment(R.layout.fragment_home1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listView = view.findViewById<ListView>(R.id.rvMatchList)

        val homeMatches = listOf<HomeMatches>(
            HomeMatches(
                1,
                "5:0",
                R.drawable.srbija,
                R.drawable.brazil
            ),
            HomeMatches(
                2,
                "2:3",
                R.drawable.nemacka,
                R.drawable.spanija,
            ),
            HomeMatches(
                2,
                "2:3",
                R.drawable.rusija,
                R.drawable.italija,
            ),
            HomeMatches(
                2,
                "2:3",
                R.drawable.rusija,
                R.drawable.italija,
            ),
            HomeMatches(
                2,
                "2:3",
                R.drawable.rusija,
                R.drawable.italija,
            ),
            HomeMatches(
                2,
                "2:3",
                R.drawable.rusija,
                R.drawable.italija,
            ),
            HomeMatches(
                2,
                "2:3",
                R.drawable.rusija,
                R.drawable.italija,
            ),

            )

        listView.adapter = HomeFragmentAdapter(view.context, homeMatches)

    }
}