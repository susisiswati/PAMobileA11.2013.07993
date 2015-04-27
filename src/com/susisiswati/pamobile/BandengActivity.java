package com.susisiswati.pamobile;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class BandengActivity extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jambu);
		
		TabHost tabhost = getTabHost(); //activity tabhost
		TabHost.TabSpec spec; //reusable tabspac for each tab
		Intent intent;
		
		//create intent to launcean activty for the tab (to be reused)
		intent = new Intent().setClass(this, JambuTab1Activity.class);
		
		//iniialize a Tabspec for each tab and add it to tnhe TabHost
		spec = tabhost.newTabSpec("tab1").setIndicator("Profil", null).setContent(intent);
		tabhost.addTab(spec);
		
		//do the same foe the other tabs
		intent = new Intent().setClass(this, JambuTab2Activity.class);
		
		//iniialize a Tabspec for each tab and add it to tnhe TabHost
		spec = tabhost.newTabSpec("tab2").setIndicator("Kondisi Existing", null).setContent(intent);
		tabhost.addTab(spec);
			
		intent = new Intent().setClass(this, JambuTab3Activity.class);
		
		//iniialize a Tabspec for each tab and add it to the TabHost
		spec = tabhost.newTabSpec("tab3").setIndicator("Hasil Olahan", null).setContent(intent);
		tabhost.addTab(spec);
		
		tabhost.setCurrentTab(3);	
	}
}
