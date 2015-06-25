package com.susisiswati.pamobile;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.TabHost;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class UdangActivity extends TabActivity {
private Context mContext;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jambu);
		
		if(android.os.Build.VERSION.SDK_INT > 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}
		mContext = getApplicationContext();
		
		TabHost tabhost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;
		
		//cek koneksi internet
		if(testKoneksiInternet()){
			Toast.makeText(mContext, "Online", Toast.LENGTH_LONG).show();
			intent = new Intent().setClass(this, UdangTab1Activity.class);
			spec = tabhost.newTabSpec("tab1").setIndicator("Profil", null).setContent(intent);
			tabhost.addTab(spec);
			
			intent = new Intent().setClass(this, UdangTab2Activity.class);
			spec = tabhost.newTabSpec("tab2").setIndicator("Kondisi Existing", null).setContent(intent);
			tabhost.addTab(spec);
				
			intent = new Intent().setClass(this, UdangTab3Activity.class);
			spec = tabhost.newTabSpec("tab3").setIndicator("Hasil Olahan", null).setContent(intent);
			tabhost.addTab(spec);
			
			tabhost.setCurrentTab(3);
			
		}else{
			Toast.makeText(mContext, "Offline", Toast.LENGTH_LONG).show();
			intent = new Intent().setClass(this, UdangTab1LokalActivity.class);
			spec = tabhost.newTabSpec("tab1").setIndicator("Profil", null).setContent(intent);
			tabhost.addTab(spec);
			
			intent = new Intent().setClass(this, UdangTab2Activity.class);
			spec = tabhost.newTabSpec("tab2").setIndicator("Kondisi Existing", null).setContent(intent);
			tabhost.addTab(spec);
				
			intent = new Intent().setClass(this, UdangTab3Activity.class);
			spec = tabhost.newTabSpec("tab3").setIndicator("Hasil Olahan", null).setContent(intent);
			tabhost.addTab(spec);
			
			tabhost.setCurrentTab(3);
		}	
	}
	
	public boolean testKoneksiInternet() {
		ConnectivityManager connectivityManager = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
		if(connectivityManager != null) {
			NetworkInfo[] networkInfo = connectivityManager.getAllNetworkInfo();
			if(networkInfo != null) {
				for(int i = 0; i < networkInfo.length; i++) {
					if(networkInfo[i].getState() == NetworkInfo.State.CONNECTED) {
						return true;
					}
				}
			}
		}
		return false;
		}	
}