package com.susisiswati.pamobile;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class JambuTab1Activity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jambu_tab1);
		
		TextView textview = new TextView(this);
		textview.setText("Tab 1");
		setContentView(textview);
	}

}
