package com.example.bettingshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.bettingshop.homePage.HomeFragment
import com.example.bettingshop.menuBar.MenuBar
import com.example.bettingshop.menuBar.MenuBarAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val homeFragment = HomeFragment()

    val menuBar = findViewById<ListView>(R.id.menuBar)

    val buttons = listOf<MenuBar>(
        MenuBar(
            1,
            R.drawable.home_menu_button,
            "Home",
        ),
        MenuBar(
            2,
            R.drawable.add_menu_button,
            "Add",
        ),
        MenuBar(
            3,
            R.drawable.account_menu_button,
            "Account",
        ),
    )

    menuBar.adapter = MenuBarAdapter(this,buttons)

    supportFragmentManager.beginTransaction().apply {
        replace(R.id.fragmentContainer,homeFragment).commit()
    }


    }
}