package com.susisiswati.pamobile;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UdangTab1DBHelper extends SQLiteOpenHelper {
	private static final String DATABASE_NAME = "dbudang";
	public static final String KEY_ID = "_id";
	public static final String NAMA = "nama";
	public static final String NILAI = "nilai";
	
	public UdangTab1DBHelper(Context context) {
		super(context, DATABASE_NAME, null, 1);
	}

	// method createTable untuk membuat table
	public void createTable(SQLiteDatabase db) {
		db.execSQL("DROP TABLE IF EXISTS PROFILUDANG");
		db.execSQL("CREATE TABLE if not exists PROFILUDANG (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ "nama TEXT,"
				+ "nilai TEXT);");
	}

	// method generateData untuk mengisikan data ke table
	public void generateData(SQLiteDatabase db) {
		ContentValues cv = new ContentValues();
		
		cv.put(NAMA, "Jumlah Produksi Real/Th (Ton)");
		cv.put(NILAI, "4.320");
		db.insert("PROFILUDANG", NILAI, cv);

		cv.put(NAMA, "Lahan Terpakai (Ha)");
		cv.put(NILAI, "120");
		db.insert("PROFILUDANG", NILAI, cv);
		
		cv.put(NAMA, "Lokasi");
		cv.put(NILAI, "Kecamatan Sukorejo");
		db.insert("PROFILUDANG", NILAI, cv);
		
		cv.put(NAMA, "Luas Tersedia (Ha)");
		cv.put(NILAI, "300");
		db.insert("PROFILUDANG", NILAI, cv);
		
		cv.put(NAMA, "Peluang Investasi");
		cv.put(NILAI, "Masih Terbuka Luas");
		db.insert("PROFILUDANG", NILAI, cv);
		
		cv.put(NAMA, "Pemasaran");
		cv.put(NILAI, "Semarang, Solo,Yogyakarta, dan Surabaya");
		db.insert("PROFILUDANG", NILAI, cv);
		
		cv.put(NAMA, "Status Lahan");
		cv.put(NILAI, "Lahan Tegalan Sawah");
		db.insert("PROFILUDANG", NILAI, cv);
	}

	// method delAllAdata untuk menghapus data di table
	public void delAllData(SQLiteDatabase db) {
		db.delete("PROFILUDANG", null, null);
	}

	public Cursor fetchAllWisata(SQLiteDatabase db) {
		return db.query("PROFILUDANG", new String[] { KEY_ID, NAMA, NILAI}, null, null,
				null, null, null);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		createTable(db);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
	}
}