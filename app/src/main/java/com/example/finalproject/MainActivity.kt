package com.example.finalproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject2.welcomeScreen.ViewPagerAdapterActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapterActivity(this, 3)
        viewPager2?.adapter = adapter


    }

}