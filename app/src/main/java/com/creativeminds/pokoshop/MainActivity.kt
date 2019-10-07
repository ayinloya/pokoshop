package com.creativeminds.pokoshop

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var textMessage: TextView
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                textMessage.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_message -> {
                textMessage.setText(R.string.title_messages)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_account -> {
                textMessage.setText(R.string.title_account)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_feed -> {
                textMessage.setText(R.string.title_feed)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_cart -> {
                textMessage.setText(R.string.title_cart)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)



        textMessage = findViewById(R.id.message)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
