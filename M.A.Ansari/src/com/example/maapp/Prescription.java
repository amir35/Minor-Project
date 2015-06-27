package com.example.maapp; //you package name
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
public class Prescription extends Activity {
	TextView tv1,tv2,tv3;
	String[] symp= new String[10];
	String symptoms;
	int ch;
@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  //set layout
  setContentView(R.layout.prescription);
  
  tv1 = (TextView) findViewById(R.id.med_name);
  Intent intent = getIntent();
  symptoms = intent.getStringExtra("fname");
  tv1.setText("You are having " + symptoms);


symp[0]= "fever";
symp[1]= "headache";
symp[2]= "vomiting";
symp[3]= "cough";
symp[4]= "cold";
symp[5]= "bodypain";
symp[6]= "acidity";
symp[7]= "loosemotion";

}
  public void action(View v)
  {
	  for(int i=0;i<symp.length;i++)
	  {
		  int t=symptoms.compareTo(symp[i]);
		  if(t == 0)
		  {
			 ch=i;
			 break;
		  }
	  }
	  
	  tv2= (TextView) findViewById(R.id.medicine);
	  tv3= (TextView) findViewById(R.id.dosage);
	  
	  switch(ch)
	  {
	  case 0:
		  tv2.setText("Paracetamol");
		  tv3.setText("One Tablet each Three times");
		  break;
		  
	  case 1:
		  tv2.setText("Saridon");
		  tv3.setText("Adult: One Tablet \n Children: Half-Tablet");
		  break;
		  
	  case 2:
		  tv2.setText("Saridon");
		  tv3.setText("Adult: One Tablet \n Children: Half-Tablet");
		  break;
		  
	  case 3:
		  tv2.setText("Try these five tips to manage your cough at home:");
		  tv3.setText("1. Stay Hydrated \n2. Try Lozenges and Hot Drinks\n3. Take Steamy Showers, and Use a Humidifier\n4. Remove Irritants From the Air\n5. Take Medications to Treat Coughs");
		  break;
		  
	  case 4:
		  tv2.setText("Saridon");
		  tv3.setText("Adult: One Tablet \n Children: Half-Tablet");
		  break;
		  
	  case 5:
		  tv2.setText("1)Mild Pain: \nApply some ointment");
		  tv3.setText("2)Severe Pain: \nTake one Tablet SUMO");
		  break;
		  
	  case 6:
		  tv2.setText("1)Mild Acidity: \nTake one sachet of ENO \n and mix in one Glass of Water");
		  tv3.setText("2)Severe Acidity: \nTake one Tablet PAN-40 with 4 hour Duration");
		  break;
		  
	  case 7:
		  tv2.setText("EnteroQuinol");
		  tv3.setText("Adult: Two Tablet \n Children: One-Tablet");
		  break;
		  
		  
	  }
	  
	  
	 /*tv2= (TextView) findViewById(R.id.medicine);
	 tv2.setText("choice is" + ch);*/
  
	  /*TextView tview=(TextView)findViewById(R.id.med_name);

	  tview.setText("Hi"); */ 
	 
  /*Intent i=new Intent(this, SecondActivity.class);
  //start the given action to Intent
  startActivity(i);*/
  //finish this activity
  //finish();
  }
  
  public void back(View v)
  {
	  Intent i=new Intent(this, Medicine.class);
	  //start the given action to Intent
	  startActivity(i);
	  //finish this activity
	  finish();
  }
}