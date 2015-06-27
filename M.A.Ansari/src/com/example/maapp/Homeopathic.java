package com.example.maapp;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class Homeopathic extends Activity {

	Intent i=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homeopathic);
	}
	
	public void action(View v)
	{
		switch(v.getId())
		{
		case R.id.cont:
			i=new Intent(this,DoctorSelection.class);
			startActivityForResult(i, 500);
			//overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); 
			break;
		}
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	//overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
	} 
}