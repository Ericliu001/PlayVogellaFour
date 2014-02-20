package com.example.playvogellafour.fragment;

import com.example.playvogellafour.R;
import com.example.playvogellafour.R.layout;
import com.example.playvogellafour.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PlayListFragmentActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		if (getFragmentManager().findFragmentById(android.R.id.content) == null) {
			getFragmentManager().beginTransaction().add(android.R.id.content, new MyListFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.play_list, menu);
		return true;
	}

}
