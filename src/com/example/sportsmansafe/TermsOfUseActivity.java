package com.example.sportsmansafe;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.TextView;

public class TermsOfUseActivity extends Activity   implements OnClickListener{
     
	private TextView termsOfUseCloseButton;
	private WebView webView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_terms_of_use);
		 setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		termsOfUseCloseButton = (TextView)findViewById(R.id.termsOfUseCloseButton);
		termsOfUseCloseButton.setOnClickListener(this);
		
		webView = (WebView)findViewById(R.id.termsOfUseHtml);
		webView.loadUrl("file:///android_asset/TermsOfUse.html");
		webView.setScrollContainer(true);
	}
     
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		startActivity(new Intent(this,InfoActivity.class));
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.terms_of_use, menu);
		return true;
	}

	

}
