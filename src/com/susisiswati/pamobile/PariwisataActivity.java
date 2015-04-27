package com.susisiswati.pamobile;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class PariwisataActivity extends ListActivity {
	String[] mob = new String[] {
			"Desa Wisata Blumah",
			"Pantai Bleder Mangrove",
			"Kembali"
	};
			
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		CustomListViewPariwisata cv = new CustomListViewPariwisata(this, mob);
		setListAdapter(cv);
	}
	
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Object detail= this.getListAdapter().getItem(position);
		String tampil = detail.toString();
		Intent i = null;
		if(tampil == "Desa Wisata Blumah") {
			i = new Intent(PariwisataActivity.this, BlumahActivity.class);
			startActivity(i);
		}
		if(tampil == "Pantai Bleder Mangrove") {
			i = new Intent(PariwisataActivity.this, MangroveActivity.class);
			startActivity(i);
		}
		if(tampil == "Kembali") {
			i = new Intent(PariwisataActivity.this, KategoriActivity.class);
			startActivity(i);
		}
		else {
			Toast.makeText(this, "Anda memilih  : " + tampil, Toast.LENGTH_SHORT).show();
		}	
	}
}