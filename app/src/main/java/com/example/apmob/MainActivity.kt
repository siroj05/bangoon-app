package com.example.apmob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.main_menu.*

class MainActivity:AppCompatActivity(){

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceStates: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.Login)
        imageSlide.setOnClickListener(this);
    }

}