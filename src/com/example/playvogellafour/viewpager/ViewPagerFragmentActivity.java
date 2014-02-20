package com.example.playvogellafour.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;

import com.example.playvogellafour.R;

public class ViewPagerFragmentActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_pager_fragment);
		
		ViewPager pager = (ViewPager) findViewById(R.id.pager);
		pager.setAdapter(new SampleAdapter(getSupportFragmentManager()));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.view_pager, menu);
		return true;
	}
	
	
	private static class SampleAdapter extends FragmentPagerAdapter {

		public SampleAdapter(FragmentManager fm) {
			super(fm);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 10;
		}
		
		@Override
		public CharSequence getPageTitle(int position) {
			// TODO Auto-generated method stub
			return "Title: " + position;
		}
		
		
		@Override
		public Fragment getItem(int position) {
			// TODO Auto-generated method stub
			return EditorFragment.newInstance(position);
		}
		
	}

}
