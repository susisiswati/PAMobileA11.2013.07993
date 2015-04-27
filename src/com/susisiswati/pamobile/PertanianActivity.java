package com.susisiswati.pamobile;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class PertanianActivity extends ListActivity {
	String[] mob = new String[] {
			"Jambu Biji Merah",
			"Pisang Raja Bulu",			
			"Kembali"
	};
			
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		CustomListViewPertanian cv = new CustomListViewPertanian(this, mob);
		setListAdapter(cv);
	}
	
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Object detail= this.getListAdapter().getItem(position);
		String tampil = detail.toString();
		Intent i = null;
		if(tampil == "Jambu Biji Merah") {
			i = new Intent(PertanianActivity.this, JambuActivity.class);
			startActivity(i);
		}
		if(tampil == "Pisang Raja Bulu") {
			i = new Intent(PertanianActivity.this, PisangActivity.class);
			startActivity(i);
		}
		if(tampil == "Kembali") {
			i = new Intent(PertanianActivity.this, KategoriActivity.class);
			startActivity(i);
		}
		else {
			Toast.makeText(this, "Anda memilih  : " + tampil, Toast.LENGTH_SHORT).show();
		}	
	}
}