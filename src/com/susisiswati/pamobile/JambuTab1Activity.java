package com.susisiswati.pamobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;

public class JambuTab1Activity extends ListActivity {
	private ArrayList<HashMap<String, String>> daftarPRD = new ArrayList<HashMap<String, String>>();
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_produk_tab1);
		this.getDataPRD(); //memanggil method getDataPRD (ada di bawah)
	}
	public void getDataPRD(){
		//mengambil alamat url. nilai url ada pada res/values/strings.xml
		final String url=this.getString(R.string.urlJambu);
		//membuat variabel sebagai parameter yang dikirim melalui GET/POST.
		//variabel merupakan pasangan key dan value bertipe MAP
		Map<String, String> params= new HashMap<String, String>();
		//memanggil HttpRequestApi dengan parameter URL, parameter dan Method
		HttpRequestApi http = new HttpRequestApi(url, params, HttpRequestApi.Method.GET);
		String response = http.sendRequest();
		//memparsing hasil response yang berupa string JSON menjadi JSONObject
		try {
			JSONArray jsarray= new JSONArray(response);
			for (int i=0;i<jsarray.length();i++) {
				JSONObject jso = (JSONObject) jsarray.get(i);
				HashMap<String, String> mapPRD = new HashMap<String,
						String>();
				//setiap nilai nama dan nilai dimasukkan ke dalam mapPRD
				mapPRD.put("nama", jso.getString("nama"));
				mapPRD.put("nilai", jso.getString("nilai"));
				daftarPRD.add(mapPRD);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		//menampilan daftarPRD pada list
		ListAdapter adapter = new SimpleAdapter(this, daftarPRD, R.layout.activity_list_produk, new String[] {"nama", "nilai"}, new int[] {R.id.txtLstNama, R.id.txtLstNilai});
		setListAdapter(adapter);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_view, menu);
		return true;
	}
}		