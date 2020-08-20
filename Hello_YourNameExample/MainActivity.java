package com.example.loop;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void load(View v)
    {
    	EditText e1=(EditText)findViewById(R.id.editText1);
    	TextView t=(TextView)findViewById(R.id.textView1);
    	Button b=(Button)findViewById(R.id.button1);
    	
    	int n1=Integer.parseInt(e1.getText().toString());
    	
    	String str= " ";
    	
    	if(n1==0)
    	{
    		t.setText(str);
    		Toast.makeText(MainActivity.this, "Invalid Value", Toast.LENGTH_LONG).show();
    	}
    	else
    	{
    		for(int i=1;i<=n1;i++)
    		{
    			str=str+" Hello";
    			t.setText(str);
    		}
    	}
 
    	
    	
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
