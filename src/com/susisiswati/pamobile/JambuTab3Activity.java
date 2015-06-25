package com.susisiswati.pamobile;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class JambuTab3Activity extends Activity {
	private JambuTab3DBHelper dbhelper;
	private SQLiteDatabase db = null;
	private ListView listContent = null;
    /** Called when the activity is first created. */
    @Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		dbhelper = new JambuTab3DBHelper(this);
		db = dbhelper.getWritableDatabase();
		dbhelper.delAllData(db);
		dbhelper.generateData(db);
		setContentView(R.layout.activity_produk_tab3);
		listContent = (ListView) findViewById(R.id.wisatalist);
		isDataListView();
	}

    private void isDataListView() {
    	Cursor wisataCursor;

    	wisataCursor = dbhelper.fetchAllWisata(db);

    	startManagingCursor( wisataCursor);
    	/*Create an array to specify the fields we want to display in the list (only the 'NAMA' column in this case) */
    	String[] from = new String[]{dbhelper.NAMA};
    	/* and an array of the fields we want to bind those fields to (in this case just the textView 'txtwisata' from our new row.xml layout above) */
    	int[] to = new int[]{R.id.txtwisata};

    	/* Now create a simple cursor adapter.. */
    	SimpleCursorAdapter wisataAdapter =
    	new SimpleCursorAdapter(this, R.layout.row, wisataCursor, from, to);

    	/* and assign it to our Spinner widget */
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