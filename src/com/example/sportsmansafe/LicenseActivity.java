package com.example.sportsmansafe;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class LicenseActivity extends Activity implements OnClickListener{
   private TextView licenseBack,licenseAdd;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_license);
		 setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		licenseBack = (TextView)findViewById(R.id.licenseBack);
		licenseAdd  = (TextView)findViewById(R.id.licenseAddButton);
		
		licenseBack.setOnClickListener(this);
	    licenseAdd.setOnClickListener(this);	
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
        case R.id.licenseBack:
        	startActivity(new Intent(this,MainActivity.class));
        	
            break;
        case R.id.licenseAddButton:
        	//startActivity(new Intent(this,InviteFriends.class));
        	break;
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.license, menu);
		return true;
	}

	

}
