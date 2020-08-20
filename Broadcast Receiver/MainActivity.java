package com.example.raees;

import android.support.v7.app.ActionBarActivity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerReceiver(mBatInfoReceiver,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }

    private BroadcastReceiver mBatInfoReceiver = new BroadcastReceiver()
    {
    	public void onReceive(Context c, Intent i)
    	{
    		int level=i.getIntExtra("level", 0);
    		ProgressBar pb=(ProgressBar)findViewById(R.id.progressBar1);
    		pb.setProgress(level);
    		TextView tv=(TextView)findViewById(R.id.textView1);
    		tv.setText("Battery Level : " + Integer.toString(level)+"%");
    		Toast.makeText(getApplicationContext(), "Battery's dying!!", Toast.LENGTH_LONG).show();
    	}
    };
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
