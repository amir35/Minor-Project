package com.example.maapp;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class DoctorSelection extends Activity {

	Intent i=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.doctor_selection);
	}
	
	public void action(View v)
	{
		switch(v.getId())
		{
		case R.id.admin:
			i=new Intent(this,Homeopathic.class);
			startActivityForResult(i, 500);
			//overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); 
			break;
		case R.id.doctor:
			i=new Intent(this, Dentistry.class);
			startActivityForResult(i, 500);
			//overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);;
			break;
		case R.id.patient:
			i=new Intent(this,Ansari.class);
			startActivityForResult(i, 500);
			//overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);;
			break;	
		case R.id.medicine:
			i=new Intent(this,Doctor.class);
			startActivityForResult(i, 500);
			//overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);;
			break;	
		}
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	//overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
	} 
}