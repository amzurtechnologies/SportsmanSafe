package com.example.sportsmansafe;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class InfoActivity extends Activity implements android.view.View.OnClickListener{
   private TextView infoBackButton,infoInviteFriends,infoAbout,infoTermsOfUse,infoContactUs,infoRateApp,infoSOS;
   
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info);
		 setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		infoBackButton         = (TextView)findViewById(R.id.infoBackButton);
		infoInviteFriends      = (TextView)findViewById(R.id.infoInviteFriends);
		infoAbout              = (TextView)findViewById(R.id.infoAbout);
		infoTermsOfUse         = (TextView)findViewById(R.id.infoTermsOfUse);
		infoContactUs          = (TextView)findViewById(R.id.infoContactUs);
		infoRateApp            = (TextView)findViewById(R.id.infoRateApp);
		
		infoBackButton.setOnClickListener(this);
		infoInviteFriends.setOnClickListener(this);
		infoAbout.setOnClickListener(this);
		infoTermsOfUse.setOnClickListener(this);
		infoContactUs.setOnClickListener(this);
		infoRateApp.setOnClickListener(this);
		
	}
     
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
        case R.id.infoBackButton:
        	startActivity(new Intent(this,MainActivity.class));
            break;
        case R.id.infoInviteFriends:
        	Intent messageIntent = new Intent(android.content.Intent.ACTION_VIEW);
        	messageIntent.setData(ContactsContract.Contacts.CONTENT_URI);
        	messageIntent.putExtra("sms_body", "I'm Using Sportsman Safe Which is Specifically Designed for Florida Hunters & Fisherman ");
        	messageIntent.setType("vnd.android-dir/mms-sms");
        	startActivity(messageIntent);
        	//startActivity(new Intent(this,InviteFriendsActivity.class));
        	break;
        case R.id.infoAbout:
        	startActivity(new Intent(this,AboutActivity.class));
        	break;
        case R.id.infoTermsOfUse:
        	startActivity(new Intent(this,TermsOfUseActivity.class));
        	break;
        case R.id.infoContactUs:
        
        	Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
        	String aEmailList[] = { "info@sportsmansafe.com" };
        	emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, aEmailList); 
        	emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Android Sportsman Safe App feedback");
        	emailIntent.setType("message/rfc822");
        	startActivity(Intent.createChooser(emailIntent, "Send mail..."));
           
        	break;
        case R.id.infoRateApp:
        	//startActivity(new Intent(this,TrophyActivity.class));
        	Toast.makeText(getApplicationContext(), " Rate App Button Clicked", Toast.LENGTH_SHORT)
            .show();
        	break;
        case R.id.infoSOSImage:
        	Toast.makeText(getApplicationContext(), "SOS Image Clicked", Toast.LENGTH_SHORT)
            .show();
        	break;
        }
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.info, menu);
		return true;
	}

	

	
	

}
