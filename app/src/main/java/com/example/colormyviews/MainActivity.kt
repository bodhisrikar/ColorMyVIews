package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainActivityBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setClickListeners()
    }

    private fun setClickListeners() {
        val clickableViews: List<View> = listOf(mainActivityBinding.boxOneText, mainActivityBinding.boxTwoText, mainActivityBinding.boxThreeText,
            mainActivityBinding.boxFourText, mainActivityBinding.boxFiveText, mainActivityBinding.constraintLayout)

        for (item in clickableViews) {
            item.setOnClickListener { makeColoured(it) }
        }
    }

    private fun makeColoured(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(resources.getColor(android.R.color.holo_green_light))
            R.id.box_four_text -> view.setBackgroundColor(resources.getColor(android.R.color.holo_green_dark))
            R.id.box_five_text -> view.setBackgroundColor(resources.getColor(android.R.color.holo_green_light))
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}