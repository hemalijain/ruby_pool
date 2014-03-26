package com.example.ruby_pool;

import com.example.ruby_pool.R;

import android.os.Build;
import android.os.Bundle;
import android.annotation.TargetApi;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;

@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
public class MainActivity extends Activity {

	@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		  WebView wv = (WebView) this.findViewById(R.id.webView1);
		    WebSettings webSettings = wv.getSettings();
		    webSettings.setJavaScriptEnabled(true);
		    webSettings.setAllowFileAccessFromFileURLs(true); //Maybe you don't need this rule
		    webSettings.setAllowUniversalAccessFromFileURLs(true);
			wv.loadUrl("file:///android_asset/index.htm"); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
