package com.example.playvogellafour.fragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MyListFragment extends ListFragment {

	private static String[] items = {
		"This is nonsense"
		,"I hate iPhone"
		,"Macbook is awesome"
		,"Andy May"
		,"Preaching"
		,"Bundoora Presbyterian Church"
	};
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
		setListAdapter(adapter);
	}
	
}
