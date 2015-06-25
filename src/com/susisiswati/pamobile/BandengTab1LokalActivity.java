package com.susisiswati.pamobile;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class BandengTab1LokalActivity extends Activity {
	private BandengTab1DBHelper dbhelper;
	private SQLiteDatabase db = null;
	private ListView listContent = null;
    /** Called when the activity is first created. */
    @Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		dbhelper = new BandengTab1DBHelper(this);
		db = dbhelper.getWritableDatabase();
		dbhelper.delAllData(db);
		dbhelper.generateData(db);
		setContentView(R.layout.activity_produk_tab1lokal);
		listContent = (ListView) findViewById(R.id.wisatalist);
		isDataListView();
	}

    private void isDataListView() {
    	Cursor wisataCursor;

    	wisataCursor = dbhelper.fetchAllWisata(db);

    	startManagingCursor( wisataCursor);
    	String[] from = new String[]{dbhelper.NAMA, dbhelper.NILAI};
    	int[] to = new int[]{R.id.txtLstNama, R.id.txtLstNilai};

    	SimpleCursorAdapter wisataAdapter =
    	new SimpleCursorAdapter(this, R.layout.activity_list_produk, wisataCursor, from, to);

    	listContent.setAdapter(wisataAdapter);
    	}

    @Override
	public void onDestroy() {
		super.onDestroy();
		try {
			db.close();
		}catch (Exception e){

		}
	}
}