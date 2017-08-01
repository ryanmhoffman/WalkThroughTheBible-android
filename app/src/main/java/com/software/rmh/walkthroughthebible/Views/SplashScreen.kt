package com.software.rmh.walkthroughthebible.Views

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager

import com.software.rmh.walkthroughthebible.Controllers.MainActivity
import com.software.rmh.walkthroughthebible.R

import java.util.Timer
import java.util.TimerTask

class SplashScreen : AppCompatActivity() {

	protected fun onCreate(savedInstanceState: Bundle) {
		requestWindowFeature(Window.FEATURE_NO_TITLE)
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN)
		super.onCreate(savedInstanceState)

		setContentView(R.layout.activity_splash_screen)

		val timerTask = object : TimerTask() {
			override fun run() {
				val intent = Intent(this@SplashScreen, MainActivity::class.java)
				startActivity(intent)
				finish()
			}
		}
		Timer().schedule(timerTask, 500)
	}
}
