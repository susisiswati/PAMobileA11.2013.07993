package com.susisiswati.pamobile;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class SPActivity extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sp);
		
		TabHost tabhost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;
		
		intent = new Intent().setClass(this, SPTab1Activity.class);
		spec = tabhost.newTabSpec("tab1").setIndicator("Pengantar", null).setContent(intent);
		tabhost.addTab(spec);
		
		intent = new Intent().setClass(this, SPTab2Activity.class);
		spec = tabhost.newTabSpec("tab2").setIndicator("Peta", null).setContent(intent);
		tabhost.addTab(spec);
		
		tabhost.setCurrentTab(2);	
	}
}