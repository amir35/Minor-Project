package com.example.maapp; //you package name
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
public class Doctor extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.doctor);
  
  }
  
  public void action(View v)
  {
  Intent i=new Intent(this, SecondActivity.class);
  startActivity(i);
  finish();
  }
}