package com.example.playvogellafour.autotext;

import com.example.playvogellafour.R;
import com.example.playvogellafour.R.layout;
import com.example.playvogellafour.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class AutoCompleteActivity extends Activity
 	implements TextWatcher {
	
	TextView tvSelection;
	AutoCompleteTextView tvAuto;
	
	private static final String[] items = {
		"eric", "Paul", "Rachel","Matt"
		
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_auto_complete);
		
		tvSelection =  (TextView) findViewById(R.id.tvSelection);
		tvAuto = (AutoCompleteTextView) findViewById(R.id.tvAuto);
		
		tvAuto.addTextChangedListener(this);
		tvAuto.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, items));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.auto_complete, menu);
		return true;
	}

	@Override
	public void afterTextChanged(Editable s) {
		// TODO Auto-generated method stub
		tvSelection.setText(tvAuto.getText());
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		// TODO Auto-generated method stub
		
	}

}
