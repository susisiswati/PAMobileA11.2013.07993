package com.susisiswati.pamobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListViewPeternakan extends ArrayAdapter {
	private final Context context;
	private final String[] values;
	
	public CustomListViewPeternakan(Context context, String[] values) {
		super(context, R.layout.activity_sublist, values);
		this.context = context;
		this.values = values;
	}
	
	@Override
	public View getView(int position, View convert, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.activity_sublist, parent, false);
		TextView tv = (TextView) rowView.findViewById(R.id.label);
		ImageView iv = (ImageView) rowView.findViewById(R.id.logo);
		
		String item_value = values[position];
		if(item_value.equals("Sapi")) {
			iv.setImageResource(R.drawable.sapi_potong);
			tv.setText(item_value);
		} else if(item_value.equals("Kambing")) {
			iv.setImageResource(R.drawable.kambing);
			tv.setText(item_value);			
		} else if(item_value.equals("Kembali")) {
			iv.setImageResource(R.drawable.kembali);
			tv.setText(item_value);			
		}
		return rowView;
	}
}
