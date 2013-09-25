package com.example.sportsmansafe;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
    private TextView mainScreenHuntingImage,mainScreenHuntingImagePressed,mainScreenFishingImage,mainScreenFishingImagePressed,mainScreenLicenseImage,mainScreenLicenseImagePressed,mainScreenTrophiesImage,mainScreenTrophiesImagePressed,mainScreeenInfoImage,mainScreenSettingsImage,mainScreenSOSImage,mainScreenSOSImagePressed;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		mainScreenHuntingImage            = (TextView)findViewById(R.id.mainScreenHunting);
		mainScreenHuntingImagePressed     = (TextView)findViewById(R.id.mainScreenHuntingPressed);
		mainScreenFishingImage            = (TextView)findViewById(R.id.mainScreenFishing);
		mainScreenFishingImagePressed     = (TextView)findViewById(R.id.mainScreenFishingPressed);
		mainScreenLicenseImage            = (TextView)findViewById(R.id.mainScreenLicense);
		mainScreenLicenseImagePressed     = (TextView)findViewById(R.id.mainScreenLicensePressed);
		mainScreenTrophiesImage           = (TextView)findViewById(R.id.mainScreenTrophies);
		mainScreenTrophiesImagePressed    = (TextView)findViewById(R.id.mainScreenTrophiesPressed);
		mainScreeenInfoImage              = (TextView)findViewById(R.id.mainScreenInfo);
		mainScreenSettingsImage           = (TextView)findViewById(R.id.mainScreenSettings);
		mainScreenSOSImage                = (TextView)findViewById(R.id.mainScreenSOS);
		mainScreenSOSImagePressed         = (TextView)findViewById(R.id.mainScreenSOSPressed);
		
		
		mainScreenHuntingImage.setOnClickListener(this);
		mainScreenFishingImage.setOnClickListener(this);
		mainScreenLicenseImage.setOnClickListener(this);
		mainScreenTrophiesImage.setOnClickListener(this);
		mainScreeenInfoImage.setOnClickListener(this);
		mainScreenSettingsImage.setOnClickListener(this);
		mainScreenSOSImage.setOnClickListener(this);
		
		
	}
     
	public void onClick(View v) {
        switch (v.getId()) {
        case R.id.mainScreenSettings:
        	Toast.makeText(getApplicationContext(), "Settings  Image Clicked", Toast.LENGTH_SHORT)
            .show();
            break;
        case R.id.mainScreenInfo:
        	startActivity(new Intent(this,InfoActivity.class));
        	break;
        case R.id.mainScreenHunting:
        	mainScreenHuntingImage.setVisibility(TextView.INVISIBLE);
            mainScreenHuntingImagePressed.setVisibility(TextView.VISIBLE);
        	startActivity(new Intent(this,HuntingMapActivity.class));
        	break;
        case R.id.mainScreenFishing:
        	mainScreenFishingImage.setVisibility(TextView.INVISIBLE);
            mainScreenFishingImagePressed.setVisibility(TextView.VISIBLE);
//        	Toast.makeText(getApplicationContext(), "Fishing Image Clicked", Toast.LENGTH_SHORT)
//            .show();
            startActivity(new Intent(this,FishingMapActivity.class));
        	break;
        case R.id.mainScreenLicense:
        	mainScreenLicenseImage.setVisibility(TextView.INVISIBLE);
        	mainScreenLicenseImagePressed.setVisibility(TextView.VISIBLE);
        	startActivity(new Intent(this,LicenseActivity.class));
        	break;
        case R.id.mainScreenTrophies:
        	mainScreenTrophiesImage.setVisibility(TextView.INVISIBLE);
        	mainScreenTrophiesImagePressed.setVisibility(TextView.VISIBLE);
        	startActivity(new Intent(this,TrophyActivity.class));
        	break;
        case R.id.mainScreenSOS:
        	mainScreenSOSImage.setVisibility(TextView.INVISIBLE);
        	mainScreenSOSImagePressed.setVisibility(TextView.VISIBLE);
        	Toast.makeText(getApplicationContext(), "SOS Image Clicked", Toast.LENGTH_SHORT)
            .show();
        	break;
        }
        
       
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


	

}
