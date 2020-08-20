package com.example.sr;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	
	private CheckBox c1,c2,c3;
	private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addtocheck();
        addtobtn();
    }

	public void addtobtn()
    {
    	final CheckBox c1=(CheckBox)findViewById(R.id.checkBox1);
    	final CheckBox c2=(CheckBox)findViewById(R.id.checkBox2);
    	final CheckBox c3=(CheckBox)findViewById(R.id.checkBox3);
    	
    	Button bt=(Button)findViewById(R.id.button1);
    	bt.setOnClickListener(new View.OnClickListener()
    	{
    		public void onClick(View v)
    		{
    			StringBuffer st=new StringBuffer();
				st.append("Window:").append(c1.isChecked());
				st.append("\n Android:").append(c2.isChecked());
				st.append("\n MAC:").append(c3.isChecked());
				Toast.makeText(MainActivity.this,st.toString(), Toast.LENGTH_LONG).show();
    		}
    	});
    	
    }
	
	public void addtocheck()
	{
		CheckBox c1=(CheckBox)findViewById(R.id.checkBox1);
		CheckBox c2=(CheckBox)findViewById(R.id.checkBox2);
		CheckBox c3=(CheckBox)findViewById(R.id.checkBox3);
		
		c1.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				if(((CheckBox) v).isChecked())
				{
					Toast.makeText(MainActivity.this, "Window is selected", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		c2.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				if(((CheckBox) v).isChecked())
				{
					Toast.makeText(MainActivity.this, "Android is selected", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		c3.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				if(((CheckBox) v).isChecked())
				{
					Toast.makeText(MainActivity.this, "MAC is selected", Toast.LENGTH_LONG).show();
				}
			}
		});
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
