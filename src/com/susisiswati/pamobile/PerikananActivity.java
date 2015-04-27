package com.susisiswati.pamobile;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class PerikananActivity extends ListActivity {
	String[] mob = new String[] {
			"Bandeng",
			"Udang Vaname",			
			"Kembali"
	};
			
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		CustomListViewPerikanan cv = new CustomListViewPerikanan(this, mob);
		setListAdapter(cv);
	}
	
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Object detail= this.getListAdapter().getItem(position);
		String tampil = detail.toString();
		Intent i = null;
		if(tampil == "Udang Vaname") {
			i = new Intent(PerikananActivity.this, UdangActivity.class);
			startActivity(i);
		}
		if(tampil == "Bandeng") {
			i = new Intent(PerikananActivity.this, BandengActivity.class);
			startActivity(i);
		}
		if(tampil == "Kembali") {
			i = new Intent(PerikananActivity.this, KategoriActivity.class);
			startActivity(i);
		}
		else {
			Toast.makeText(this, "Anda memilih  : " + tampil, Toast.LENGTH_SHORT).show();
		}	
	}
}