package com.example.playvogellafour.broadcast;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.playvogellafour.R;

public class AlarmActivity extends Activity {
	
	public static final String ACTION_IMPOSSIBLE = "this.is.holy.impossible";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alarm);
	}
	
	public void startAlert(View view) {
		EditText text = (EditText) findViewById(R.id.etTime);
		String input = text.getText().toString();
		
		if (input.isEmpty()) {
			return;
		}
		
		int i = Integer.parseInt(input);
		
		Intent intent = new Intent(this, MyBroadcastReceiver.class);
		PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(), 10001, intent, 0);
		
		AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
		alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (i * 1000), pendingIntent);
		Toast.makeText(this, "Alarm set in " + i + " seconds", Toast.LENGTH_LONG).show();
	}
	
	
	public void onClick(View view){
		Log.i("eric", "onClick called");
		Intent intent = new Intent();
		intent.setAction(ACTION_IMPOSSIBLE);
		sendBroadcast(intent); // localbroadcast must be registered before using. 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alarm, menu);
		return true;
	}

}
