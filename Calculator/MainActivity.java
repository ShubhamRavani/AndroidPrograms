package com.example.sr;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void onClik(View v)
    {
    	EditText e1=(EditText)findViewById(R.id.editText1);
    	EditText e2=(EditText)findViewById(R.id.editText2);
    	
    	TextView t1=(TextView)findViewById(R.id.textView1);
    	
    	int n1=Integer.parseInt(e1.getText().toString());
    	int n2=Integer.parseInt(e2.getText().toString());
    	
    	int Addition=n1+n2;
    	
    	t1.setText(Integer.toString(Addition));
    }
    
    public void onC(View v)
    {
    	EditText e1=(EditText)findViewById(R.id.editText1);
    	EditText e2=(EditText)findViewById(R.id.editText2);
    	
    	TextView t1=(TextView)findViewById(R.id.textView1);
    	
    	int n1=Integer.parseInt(e1.getText().toString());
    	int n2=Integer.parseInt(e2.getText().toString());
    	
    	int Subtraction=n1-n2;
    	
    	t1.setText(Integer.toString(Subtraction));
    }

    public void onCli(View v)
    {
    	EditText e1=(EditText)findViewById(R.id.editText1);
    	EditText e2=(EditText)findViewById(R.id.editText2);
    	
    	TextView t1=(TextView)findViewById(R.id.textView1);
    	
    	int n1=Integer.parseInt(e1.getText().toString());
    	int n2=Integer.parseInt(e2.getText().toString());
    	
    	int Multiplication=n1*n2;
    	
    	t1.setText(Integer.toString(Multiplication));
    }
    
    public void onCl(View v)
    {
    	EditText e1=(EditText)findViewById(R.id.editText1);
    	EditText e2=(EditText)findViewById(R.id.editText2);
    	
    	TextView t1=(TextView)findViewById(R.id.textView1);
    	
    	int n1=Integer.parseInt(e1.getText().toString());
    	int n2=Integer.parseInt(e2.getText().toString());
    	
    	int Division=n1/n2;
    	
    	t1.setText(Integer.toString(Division));
    }
    
    public void onClic(View v)
    {
    	EditText e1=(EditText)findViewById(R.id.editText1);
    	EditText e2=(EditText)findViewById(R.id.editText2);
    	
		TextView t1=(TextView)findViewById(R.id.textView1);
		
    	e1.setText("");
    	e2.setText("");
		t1.setText("");
    	
  
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
