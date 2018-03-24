package com.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4,btn5;
    EditText et1,et2;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        tv1 = (TextView) findViewById(R.id.tv1);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn1: et1.setText("");
                            et2.setText("");
                            break;

            case R.id.btn2: tv1.setText(Double.toString(Double.parseDouble(et1.getText().toString())+Double.parseDouble(et2.getText().toString())));
                            break;

            case R.id.btn3: tv1.setText(Double.toString(Double.parseDouble(et1.getText().toString())-Double.parseDouble(et2.getText().toString())));
                            break;

            case R.id.btn4: tv1.setText(Double.toString(Double.parseDouble(et1.getText().toString())*Double.parseDouble(et2.getText().toString())));
                            break;

            case R.id.btn5: tv1.setText(Double.toString(Double.parseDouble(et1.getText().toString())/Double.parseDouble(et2.getText().toString())));
                            break;
        }
    }
}
