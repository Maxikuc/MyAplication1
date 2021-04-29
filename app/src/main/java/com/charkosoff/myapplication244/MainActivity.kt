package com.charkosoff.myapplication244

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.imageView)
        val animation = AnimationUtils.loadAnimation(this, R.anim.anim)
        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationRepeat(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                image.visibility = View.GONE
            }

            override fun onAnimationStart(animation: Animation?) {}
        })
image.startAnimation(animation)

        val image2 = findViewById<ImageView>(R.id.imageView2)
        val animation2 = AnimationUtils.loadAnimation(this, R.anim.anim2)
        animation2.setAnimationListener(object :  Animation.AnimationListener {
            override fun onAnimationRepeat(animation2: Animation?) {

            }

            override fun onAnimationEnd(animation2: Animation?) {

            }

            override fun onAnimationStart(animation2: Animation?) {

            }

        })
image2.startAnimation(animation2)

        }
        }









