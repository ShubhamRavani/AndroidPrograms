package collage.e.l.simple_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int counter=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();

    }
    public void login(){
        final EditText e1=(EditText)findViewById(R.id.etname);
        final EditText e2=(EditText)findViewById(R.id.etpass);
        final Button b=(Button)findViewById(R.id.btnlogin);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(e1.getText().toString().equals("Admin") && e2.getText().toString().equals("123")){

                    Toast.makeText(MainActivity.this,"Login Successfull",Toast.LENGTH_SHORT).show();

                }else{
                    counter--;

                    if(counter==0){
                        b.setEnabled(false);
                    }

                    Toast.makeText(MainActivity.this,"Plzz Check UserName or Password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
