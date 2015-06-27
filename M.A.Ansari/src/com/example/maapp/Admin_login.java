package com.example.maapp;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Admin_login extends Activity{
	Intent i=null;
	ImageView im=null;
	EditText tv1,tv2;
	boolean flag=false;
	SQLiteDatabase db=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.admin_login);
		//im=(ImageView)findViewById(R.id.show_hide2);
		tv1=(EditText)findViewById(R.id.username);
		tv2=(EditText)findViewById(R.id.password);
	//	db=openOrCreateDatabase("mydb", MODE_PRIVATE, null);
	//	db.execSQL("create table if not exists login(name varchar,mobile_no varchar,email_id varchar,password varchar,flag varchar)");
		
		/*im.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
			
				
			}
		});*/
	}
	String user="maansari";
	String pass="healthcenter";
	public void action(View v)
	{
	switch(v.getId())
	{
	case R.id.change_password: 
		i=new Intent(this,Change_password.class);
		startActivityForResult(i, 500);
		//overridePendingTransition(R.anim.slide_in_top, R.anim.slide_out_bottom); 
		finish();
		break;
	 case R.id.login:
		String username=tv1.getText().toString();
		String password=tv2.getText().toString();
		/*if(user==null||user==""||user.length()<5)
		{
			show("Please Enter Correct UserName");
		}
		else if(password==null||password==""||password.length()<6)
		{
			show("Please Enter Correct Password");
		}
		else
		{		
			/*Cursor c=db.rawQuery("select * from login where username='"+user+"' and password='"+password+"'",null);	
			c.moveToFirst();
			//if(c.getCount()>0)*/
		//int result = str1.compareTo( str2 );
		int r1=user.compareTo(username);
		int r2=pass.compareTo(password);
			
		if(r1 == 0 && r2 == 0)
			{
			i=new Intent(this,Admin.class);
			startActivityForResult(i,500);
			//overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); 
			db.close();
			finish();
			}
		else
				show("Wrong Password or Mobile number.");
		
	
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
