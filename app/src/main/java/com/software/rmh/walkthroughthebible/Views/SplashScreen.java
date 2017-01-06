package com.software.rmh.walkthroughthebible.Views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.software.rmh.walkthroughthebible.Controllers.MainActivity;
import com.software.rmh.walkthroughthebible.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_splash_screen);

		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				Intent intent = new Intent(SplashScreen.this, MainActivity.class);
				startActivity(intent);
				finish();
			}
		};
		new Timer().schedule(timerTask, 500);
	}
}
