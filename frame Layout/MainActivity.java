package com.example.frame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
ImageView img1,img2;
Button ii;
LinearLayout p;
TextView happ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        ii=(Button) findViewById(R.id.bt);
        p=(LinearLayout)findViewById(R.id.lin);
        happ=(TextView)findViewById(R.id.happ) ;
        img1.setOnClickListener(this);
        ii.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.img1){
            img1.setVisibility(v.GONE);
            p.setVisibility(v.VISIBLE);
            img2.setVisibility(v.VISIBLE); happ.setVisibility(v.VISIBLE); ii.setVisibility(v.VISIBLE);
        }else{
            img1.setVisibility(v.VISIBLE);
            p.setVisibility(v.GONE);
            img2.setVisibility(v.GONE);
            happ.setVisibility(v.GONE);
            ii.setVisibility(v.GONE);

        }
    }
}
