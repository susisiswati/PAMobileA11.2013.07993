package com.susisiswati.pamobile;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class BlumahTab3Activity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jambu_tab3);
		
		TextView textview = new TextView(this);
		textview.setText("Tab 3");
		setContentView(textview);
	}

}
