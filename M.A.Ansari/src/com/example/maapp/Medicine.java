package com.example.maapp; //you package name
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;
public class Medicine extends Activity {
	EditText tv1,tv2;
@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  //set layout
  setContentView(R.layout.medicine);
  
  tv1=(EditText)findViewById(R.id.symptoms);
  //tv2=(EditText)findViewById(R.id.password);
  
  }
  public void action(View v)
  {
  
  Intent intent=new Intent(this, Prescription.class);
  //intent.putExtra("symptoms", tv1);
  intent.putExtra("fname", tv1.getText().toString().trim().toLowerCase());
  startActivity(intent);
  finish();
  }
}