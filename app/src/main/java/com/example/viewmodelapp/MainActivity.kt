package com.example.viewmodelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.viewmodelapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var count =0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.countBtn.setOnClickListener {
           countButton()
        }
    }

    private fun countButton(){

        binding.apply {
            count += 1
            countText.text=count.toString()
        }
    }
}