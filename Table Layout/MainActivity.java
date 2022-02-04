package com.example.table;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText e1,e2,e3,e4;
Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        e1.getText().clear();
        e2.getText().clear();
        e3.getText().clear();
        e4.getText().clear();
    }
}
