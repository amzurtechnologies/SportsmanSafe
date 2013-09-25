package com.example.sportsmansafe;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class TrophyActivity extends Activity implements OnClickListener {

	private TextView trophyBack,trophyAddButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_trophy);
		 setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		trophyBack       = (TextView) findViewById(R.id.trophyBack);
		trophyAddButton  = (TextView) findViewById(R.id.trophyAddButton);
		
		trophyBack.setOnClickListener(this);
		trophyAddButton.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
        case R.id.trophyBack:
        	startActivity(new Intent(this,MainActivity.class));
            break;
        case R.id.trophyAddButton:
        	//startActivity(new Intent(this,InviteFriends.class));
        	break;
		}
		
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.trophy, menu);
		return true;
	}

	
}
