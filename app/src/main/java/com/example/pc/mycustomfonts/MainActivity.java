package com.example.pc.mycustomfonts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Typeface;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickbtn1 (View view){
        TextView mytxt = (TextView) findViewById(R.id.mytext);
        Typeface myfont = Typeface.createFromAsset(getAssets(), "alpha_echo.ttf");
        mytxt.setTypeface(myfont);
    }
    public void onClickbtn2 (View view){
        TextView mytxt = (TextView) findViewById(R.id.mytext);
        Typeface myfont = Typeface.createFromAsset(getAssets(), "AquilineTwo.ttf");
        mytxt.setTypeface(myfont);
    }
    public void onClickbtn3 (View view){
        TextView mytxt = (TextView) findViewById(R.id.mytext);
        Typeface myfont = Typeface.createFromAsset(getAssets(), "Archistico_Bold.ttf");
        mytxt.setTypeface(myfont);
    }
    public void onClickbtn4 (View view){
        TextView mytxt = (TextView) findViewById(R.id.mytext);
        Typeface myfont = Typeface.createFromAsset(getAssets(), "BEARPAW_.ttf");
        mytxt.setTypeface(myfont);
    }
    public void onClickbtn5 (View view){
        TextView mytxt = (TextView) findViewById(R.id.mytext);
        Typeface myfont = Typeface.createFromAsset(getAssets(), "BLACKR.ttf");
        mytxt.setTypeface(myfont);
    }
    public void onClickbtn6 (View view){
        TextView mytxt = (TextView) findViewById(R.id.mytext);
        Typeface myfont = Typeface.createFromAsset(getAssets(), "Chantelli_Antiqua.ttf");
        mytxt.setTypeface(myfont);
    }
}
