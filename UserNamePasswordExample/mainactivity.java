package com.example.sr;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity 
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }

    public void login()
    {
    	final EditText e1=(EditText)findViewById(R.id.editText1);
    	final EditText e2=(EditText)findViewById(R.id.editText2);
    	Button b=(Button)findViewById(R.id.button1);
    	b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if(e1.getText().toString().equals("admin") && e2.getText().toString().equals("123"))
				{
					Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_LONG).show();
				}
				
				else
				{
					Toast.makeText(MainActivity.this, "Invalid usr or psw", Toast.LENGTH_LONG).show();
				}
			}
		});
    	
    }
}