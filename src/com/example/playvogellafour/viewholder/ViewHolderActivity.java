package com.example.playvogellafour.viewholder;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.playvogellafour.R;

public class ViewHolderActivity extends ListActivity {
	
	private static String[] items = {
		"Eirc"
		,"Tony is a bitch"
		,"Kelvin is awesome"
		,"Eric is sexy"
		,"Matt is fat"
		,"I'm so cool"
		,"Wednesdays suck"
		,"We don't have any food in the frige"
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new IconicAdapter(this));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.view_holder, menu);
		return true;
	}
	
	static class ViewHolder{
		ImageView icon = null;
		TextView size = null;
		
		public ViewHolder(View view) {
			icon = (ImageView) view.findViewById(R.id.imageView1);
			size = (TextView) view.findViewById(R.id.tvCount);
		}
	}
	
	private class IconicAdapter extends ArrayAdapter<String>{

		public IconicAdapter(Context context) {
			super(context, R.layout.list_row, R.id.tvLable, items);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			View row = super.getView(position, convertView, parent); // So you don't have to inflate the view yourself
			ViewHolder holder = (ViewHolder) row.getTag();
			
			if (holder == null) {
				holder = new ViewHolder(row);
				row.setTag(holder);
			}
			
			if (position % 3 == 0) {
				holder.icon.setImageResource(R.drawable.delete);
			}
			
			holder.size.setText(String.format("Size: " + items[position].length()));
			
			return row;
		}
		
	}

}
