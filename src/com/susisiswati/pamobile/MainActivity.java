package com.susisiswati.pamobile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btnSP = (Button) findViewById(R.id.btnSP);
		Button btnPU = (Button) findViewById(R.id.btnPU);
		Button btnHK = (Button) findViewById(R.id.btnHK);
		
		btnSP.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(MainActivity.this, SPActivity.class);
				startActivity(i);
			}
		});
		
		btnPU.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(MainActivity.this, KategoriActivity.class);
				startActivity(i);
			}
		});
		btnHK.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(MainActivity.this, HKActivity.class);
				startActivity(i);
			}
		});
	}
}