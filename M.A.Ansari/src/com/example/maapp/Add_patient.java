package com.example.maapp;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Add_patient extends Activity{
	Intent i=null;
	ImageView im=null;
	EditText tv1,tv2,tv3,tv4,tv5,tv6,tv7;
	boolean flag=false;
	SQLiteDatabase db=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_patient);
		//im=(ImageView)findViewById(R.id.show_hide);
		tv1=(EditText)findViewById(R.id.student_id);
		tv2=(EditText)findViewById(R.id.name);
		tv3=(EditText)findViewById(R.id.email_id);
		tv4=(EditText)findViewById(R.id.phone);
		tv5=(EditText)findViewById(R.id.password);
		tv6=(EditText)findViewById(R.id.disease);
		tv7=(EditText)findViewById(R.id.meeting);
		
		db=openOrCreateDatabase("mydb", MODE_PRIVATE, null);
		db.execSQL("create table if not exists login1(student_id varchar primary key, name varchar,mobile_no varchar,email_id varchar,password varchar,disease varchar,meeting varchar,flag varchar)");
		
		
	}
	
	public void action(View v)
	{
	switch(v.getId())
	{
	case R.id.more:
		String student_id=tv1.getText().toString();
		String name=tv2.getText().toString();
		String email_id=tv3.getText().toString();
		String mobile_no=tv4.getText().toString();
		String password=tv5.getText().toString();
		String disease=tv6.getText().toString();
		String meeting=tv7.getText().toString();
		if(student_id.length() != 8)
		{
			show("Please Enter Correct ID");
		}
		if(name==null||name==""||name.length()<3)
		{
			show("Please Enter Correct Name.");
		}
		else if(mobile_no==null||mobile_no==""||mobile_no.length()<10)
		{
			show("Please Enter Correct mobile number.");
		}
		else if(email_id==null||email_id==""||email_id.length()<10)
		{
			show("Please Enter Correct Email id.");
		}
		else if(password==null||password==""||password.length()<6)
		{
			show("Please Enter Strong Password.");
		}
		else if(disease==null||disease=="")
		{
			show("Please Enter The Disease");
		}
		else if(meeting==null || meeting=="")
		{
			show("Please Enter the Last Meeting");
		}
		else
		{
			db.execSQL("insert into login1 values('"+student_id+"','"+name+"','"+mobile_no+"','"+email_id+"','"+password+"','"+disease+"','"+meeting+"','nothing')");
			i=new Intent(this,Successful.class);
			startActivityForResult(i, 500);
			//overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); 
			db.close();
			finish();
		}
		break;
	}
  }
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	//overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
	} 
	
	public void show(String str)
	{
	Toast.makeText(this, str, Toast.LENGTH_LONG).show();	
	}
}
