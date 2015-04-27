package com.susisiswati.pamobile;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class PeternakanActivity extends ListActivity {
	String[] mob = new String[] {
			"Sapi",
			"Kambing",
			"Kembali"
	};
			
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		CustomListViewPeternakan cv = new CustomListViewPeternakan(this, mob);
		setListAdapter(cv);
	}
	
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Object detail= this.getListAdapter().getItem(position);
		String tampil = detail.toString();
		Intent i = null;
		if(tampil == "Sapi") {
			i = new Intent(PeternakanActivity.this, SapiActivity.class);
			startActivity(i);
		}
		if(tampil == "Kambing") {
			i = new Intent(PeternakanActivity.this, KambingActivity.class);
			startActivity(i);
		}
		if(tampil == "Kembali") {
			i = new Intent(PeternakanActivity.this, KategoriActivity.class);
			startActivity(i);
		}
		else {
			Toast.makeText(this, "Anda memilih  : " + tampil, Toast.LENGTH_SHORT).show();
		}	
	}
}