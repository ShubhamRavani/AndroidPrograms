package college.e.l.spinner_1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public TextView textView;
    public Spinner spinner;
    public ImageView img;
    public ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.tv1);
        spinner = (Spinner)findViewById(R.id.sp1);
        img = (ImageView)findViewById(R.id.im1);

        adapter = ArrayAdapter.createFromResource(this,R.array.Image,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                if(spinner.getSelectedItemId()==0){

                    img.setImageResource(R.drawable.img1);
                }else if(spinner.getSelectedItemId()==1){

                    img.setImageResource(R.drawable.img2);
                }else if(spinner.getSelectedItemId()==2){

                    img.setImageResource(R.drawable.img3);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
