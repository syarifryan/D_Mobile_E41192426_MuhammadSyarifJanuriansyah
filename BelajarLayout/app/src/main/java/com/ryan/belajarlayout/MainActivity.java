package com.ryan.belajarlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;




public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView layout1 , layout2 , layout3 , layout4 , layout5 , layout6 , layout7 , layout8;

    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1 = (CardView) findViewById(R.id.layout1);
        layout2 = (CardView) findViewById(R.id.layout2);
        layout3 = (CardView) findViewById(R.id.layout3);
        layout4 = (CardView) findViewById(R.id.layout4);
        layout5 = (CardView) findViewById(R.id.layout5);
        layout6 = (CardView) findViewById(R.id.layout6);
        layout7 = (CardView) findViewById(R.id.layout7);
        layout8 = (CardView) findViewById(R.id.layout8);

        layout1.setOnClickListener(this);
        layout2.setOnClickListener(this);
        layout3.setOnClickListener(this);
        layout4.setOnClickListener(this);
        layout5.setOnClickListener(this);
        layout6.setOnClickListener(this);
        layout7.setOnClickListener(this);
        layout8.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.layout1 :
                i = new Intent (this, LinearLayout.class);
                startActivity(i);
                break;

            case R.id.layout2 :
                i = new Intent (this, RelativeLayout.class);
                startActivity(i);
                break;

            case R.id.layout3 :
                i = new Intent (this, ConstraintLayout.class);
                startActivity(i);
                break;

            case R.id.layout4 :
                i = new Intent (this, LinearLayout.class);
                startActivity(i);
                break;

            case R.id.layout5 :
                i = new Intent (this, TableLayout.class);
                startActivity(i);
                break;

            case R.id.layout6 :
                i = new Intent (this, MaterialLayout.class);
                startActivity(i);
                break;

            case R.id.layout7 :
                i = new Intent (this, ScrollView.class);
                startActivity(i);
                break;

            case R.id.layout8 :
                i = new Intent (this, ScrollViewHorizontal.class);
                startActivity(i);
                break;

        }
    }
}

