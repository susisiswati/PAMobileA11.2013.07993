package com.susisiswati.pamobile;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class JambuActivity extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jambu);
		
		TabHost tabhost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;
		
		intent = new Intent().setClass(this, JambuTab1Activity.class);
		spec = tabhost.newTabSpec("tab1").setIndicator("Profil", null).setContent(intent);
		tabhost.addTab(spec);
		
		intent = new Intent().setClass(this, JambuTab2Activity.class);
		spec = tabhost.newTabSpec("tab2").setIndicator("Kondisi Existing", null).setContent(intent);
		tabhost.addTab(spec);
			
		intent = new Intent().setClass(this, JambuTab3Activity.class);
		spec = tabhost.newTabSpec("tab3").setIndicator("Hasil Olahan", null).setContent(intent);
		tabhost.addTab(spec);
		
		tabhost.setCurrentTab(3);	
	}
}