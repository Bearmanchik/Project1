package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        View.OnClickListener touch;
        touch = new OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.btn1:
                        Intent intent1 = new Intent(MainActivity.this, MultiplicationActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.btn2:
                        Intent intent2 = new Intent(MainActivity.this, TransportationActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.btn3:
                        Intent intent3 = new Intent(MainActivity.this, GausActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.btn4:
                        Intent intent4 = new Intent(MainActivity.this, TrungActivity.class);
                        startActivity(intent4);
                        break;
                }
            }

        };

        btn1.setOnClickListener(touch);
        btn2.setOnClickListener(touch);
        btn3.setOnClickListener(touch);
        btn4.setOnClickListener(touch);

    }



}
