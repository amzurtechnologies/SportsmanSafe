package com.example.sportsmansafe;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {
	private static int SPLASH_TIME_OUT = 3000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		 setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
 
                // close this activity
                finish();
			}
		}, SPLASH_TIME_OUT);
	}

	

}
