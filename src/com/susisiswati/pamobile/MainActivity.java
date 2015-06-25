package com.susisiswati.pamobile;

import android.os.Bundle;
import android.os.StrictMode;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*if(android.os.Build.VERSION.SDK_INT > 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}*/
		
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