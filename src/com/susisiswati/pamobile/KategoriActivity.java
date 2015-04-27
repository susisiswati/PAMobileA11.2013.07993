package com.susisiswati.pamobile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class KategoriActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kategori);
		
		Button pertanian_btn = (Button) findViewById(R.id.pertanian_btn);
		Button peternakan_btn = (Button) findViewById(R.id.peternakan_btn);
		Button perikanan_btn = (Button) findViewById(R.id.perikanan_btn);
		Button pariwisata_btn = (Button) findViewById(R.id.pariwisata_btn);
		
		pertanian_btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(KategoriActivity.this, PertanianActivity.class);
				startActivity(i);
			}
		});
		
		peternakan_btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(KategoriActivity.this, PeternakanActivity.class);
				startActivity(i);
			}
		});
		
		perikanan_btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(KategoriActivity.this, PerikananActivity.class);
				startActivity(i);
			}
		});					

		pariwisata_btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(KategoriActivity.this, PariwisataActivity.class);
				startActivity(i);
			}
		});
	}
}
