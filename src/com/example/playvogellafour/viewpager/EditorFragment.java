package com.example.playvogellafour.viewpager;

import com.example.playvogellafour.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class EditorFragment extends Fragment {
	private static final String KEY_POSITION = "position";
	
	static EditorFragment newInstance(int position){
		EditorFragment frag = new EditorFragment();
		Bundle args  = new Bundle();
		
		args.putInt(KEY_POSITION, position);
		frag.setArguments(args);
		
		return frag;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View result = inflater.inflate(R.layout.editor, container, false);
		EditText editor = (EditText) result.findViewById(R.id.editor);
		int position = getArguments().getInt(KEY_POSITION, -1);
		
		editor.setText("This is page: " + (position + 1));
		
		return result;
	}
}
