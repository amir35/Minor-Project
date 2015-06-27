package com.example.maapp;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class Admin extends Activity {

	Intent i=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.admin);
	}
	
	public void admin_work(View v)
	{
		switch(v.getId())
		{
		case R.id.update:
			i=new Intent(this,Update_patient.class);
			startActivityForResult(i, 500);
			//overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); 
			break;
		case R.id.add_patient:
			i=new Intent(this,Add_patient.class);
			startActivityForResult(i, 500);
			//overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);;
			break;	
		case R.id.remove_patient:
			i=new Intent(this,Remove_patient.class);
			startActivityForResult(i, 500);
			//overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);;
			break;	
		case R.id.sendsms:
			i=new Intent(this,SendSMSActivity.class);
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