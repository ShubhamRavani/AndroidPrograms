package collage.e.l.a2d_shape;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Paint p = new Paint();
        p.setColor(Color.parseColor("#da4747"));

        Bitmap b = Bitmap.createBitmap(400,800,Bitmap.Config.ARGB_8888);

        Canvas c = new Canvas(b);
        c.drawRect(50,50,200,200,p);
        c.drawCircle(250,250,50,p);
        

        LinearLayout l = (LinearLayout)findViewById(R.id.rect);

        l.setBackground(new BitmapDrawable(b));


    }
}
