package com.example.maapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;

public class Patient extends Activity {

	Intent i=null;
	EditText tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.patient);
		
		tv1=(EditText)findViewById(R.id.student_id);
		
		
	}
	
	public void view_info(View v)
	{
		String student_id=tv1.getText().toString();
		i=new Intent(this,Patient_info.class);
		i.putExtra("stid",student_id);
			startActivityForResult(i, 500);
			//overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
			
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	//overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
	} 
}