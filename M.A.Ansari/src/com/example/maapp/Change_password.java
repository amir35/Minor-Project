package com.example.maapp;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class Change_password extends Activity {

	Intent i=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.change_password);
	}
	
	public void login_sigin(View v)
	{
		switch(v.getId())
		{
		
		}
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	//overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
	} 
}