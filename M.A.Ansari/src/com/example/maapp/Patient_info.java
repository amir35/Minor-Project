package com.example.maapp; //you package name


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
public class Patient_info extends Activity {
	SQLiteDatabase db=null;
	Intent i,intent=null;
	ImageView im=null;
	TextView tv1,tv2,tv3,tv4,tv5,tv6;
	String stuid;
	String id,name,mobile,email,disease,meet;
@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.patient_info);
  
  tv1 = (TextView) findViewById(R.id.student_id);
  tv2 = (TextView) findViewById(R.id.name);
  tv3 = (TextView) findViewById(R.id.mobile);
  tv4 = (TextView) findViewById(R.id.email);
  tv5 = (TextView) findViewById(R.id.Disease);
  tv6 = (TextView) findViewById(R.id.meeting);
  
  intent = getIntent();
  stuid= intent.getStringExtra("stid");
  
  
  
  db=openOrCreateDatabase("mydb", Context.MODE_PRIVATE, null);
  
	Cursor c=db.rawQuery("select * from login1 where student_id='"+stuid+"'",null);	
	if(c.moveToFirst())
	{
		//showMessage("Hello");
		id = stuid	;	
		name = c.getString(1);
		mobile = c.getString(2);
		email = c.getString(3);
		disease = c.getString(5);
		meet = c.getString(6);
	}
	
	
	
  
  }
 
  
public void action(View v)
  {
	  tv1.setText("Student ID: "+id);
		tv2.setText("Name: "+name);
		tv3.setText("Mobile: "+mobile);
		tv4.setText("Email: "+email);
		tv5.setText("Disease: "+disease);
		tv6.setText("Last Met On: "+meet);
  /*Intent i=new Intent(this, SecondActivity.class);
  startActivity(i);
  finish();*/
  }
}