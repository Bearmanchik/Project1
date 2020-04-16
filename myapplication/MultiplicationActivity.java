package com.example.myapplication;

import android.content.Intent;
import android.support.annotation.VisibleForTesting;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MultiplicationActivity extends AppCompatActivity {

    Button btnr;
    Button btn1;
    Button btn2;
    Button btnAns;

    EditText edt1;
    EditText edt2;
    EditText edt21;
    EditText edt22;
    TextView edtAns;

    EditText edtA1;
    EditText edtA2;
    EditText edtA3;
    EditText edtA4;
    EditText edtA5;
    EditText edtA6;

    EditText edtA21;
    EditText edtA22;
    EditText edtA23;
    EditText edtA24;
    EditText edtA25;
    EditText edtA26;

    EditText edtA31;
    EditText edtA32;
    EditText edtA33;
    EditText edtA34;
    EditText edtA35;
    EditText edtA36;

    EditText edtA41;
    EditText edtA42;
    EditText edtA43;
    EditText edtA44;
    EditText edtA45;
    EditText edtA46;

    EditText edtA51;
    EditText edtA52;
    EditText edtA53;
    EditText edtA54;
    EditText edtA55;
    EditText edtA56;

    EditText edtA61;
    EditText edtA62;
    EditText edtA63;
    EditText edtA64;
    EditText edtA65;
    EditText edtA66;

    EditText edtB1;
    EditText edtB2;
    EditText edtB3;
    EditText edtB4;
    EditText edtB5;
    EditText edtB6;

    EditText edtB21;
    EditText edtB22;
    EditText edtB23;
    EditText edtB24;
    EditText edtB25;
    EditText edtB26;

    EditText edtB31;
    EditText edtB32;
    EditText edtB33;
    EditText edtB34;
    EditText edtB35;
    EditText edtB36;

    EditText edtB41;
    EditText edtB42;
    EditText edtB43;
    EditText edtB44;
    EditText edtB45;
    EditText edtB46;

    EditText edtB51;
    EditText edtB52;
    EditText edtB53;
    EditText edtB54;
    EditText edtB55;
    EditText edtB56;

    EditText edtB61;
    EditText edtB62;
    EditText edtB63;
    EditText edtB64;
    EditText edtB65;
    EditText edtB66;

    int x = 1, y = 1, z =  1, w = 1;
    float[][] matrixA;
    float[][] matrixB;
    float[][] matrixR;
    int error = 0;
    String str;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication);

        btnr = findViewById(R.id.btnr);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btnAns = findViewById(R.id.btnAns);

        edt1  = findViewById(R.id.edt1);
        edt2  = findViewById(R.id.edt2);
        edt21  = findViewById(R.id.edt21);
        edt22  = findViewById(R.id.edt22);
        edtAns = findViewById(R.id.edtAns);

        edtA1  = findViewById(R.id.edtA1);
        edtA2  = findViewById(R.id.edtA2);
        edtA3  = findViewById(R.id.edtA3);
        edtA4  = findViewById(R.id.edtA4);
        edtA5  = findViewById(R.id.edtA5);
        edtA6  = findViewById(R.id.edtA6);

        edtA21  = findViewById(R.id.edtA21);
        edtA22  = findViewById(R.id.edtA22);
        edtA23  = findViewById(R.id.edtA23);
        edtA24  = findViewById(R.id.edtA24);
        edtA25  = findViewById(R.id.edtA25);
        edtA26  = findViewById(R.id.edtA26);

        edtA31  = findViewById(R.id.edtA31);
        edtA32  = findViewById(R.id.edtA32);
        edtA33  = findViewById(R.id.edtA33);
        edtA34  = findViewById(R.id.edtA34);
        edtA35  = findViewById(R.id.edtA35);
        edtA36  = findViewById(R.id.edtA36);

        edtA41  = findViewById(R.id.edtA41);
        edtA42  = findViewById(R.id.edtA42);
        edtA43  = findViewById(R.id.edtA43);
        edtA44  = findViewById(R.id.edtA44);
        edtA45  = findViewById(R.id.edtA45);
        edtA46  = findViewById(R.id.edtA46);

        edtA51  = findViewById(R.id.edtA51);
        edtA52  = findViewById(R.id.edtA52);
        edtA53  = findViewById(R.id.edtA53);
        edtA54  = findViewById(R.id.edtA54);
        edtA55  = findViewById(R.id.edtA55);
        edtA56  = findViewById(R.id.edtA56);

        edtA61  = findViewById(R.id.edtA61);
        edtA62  = findViewById(R.id.edtA62);
        edtA63  = findViewById(R.id.edtA63);
        edtA64  = findViewById(R.id.edtA64);
        edtA65  = findViewById(R.id.edtA65);
        edtA66  = findViewById(R.id.edtA66);

        edtB1  = findViewById(R.id.edtB1);
        edtB2  = findViewById(R.id.edtB2);
        edtB3  = findViewById(R.id.edtB3);
        edtB4  = findViewById(R.id.edtB4);
        edtB5  = findViewById(R.id.edtB5);
        edtB6  = findViewById(R.id.edtB6);

        edtB21  = findViewById(R.id.edtB21);
        edtB22  = findViewById(R.id.edtB22);
        edtB23  = findViewById(R.id.edtB23);
        edtB24  = findViewById(R.id.edtB24);
        edtB25  = findViewById(R.id.edtB25);
        edtB26  = findViewById(R.id.edtB26);

        edtB31  = findViewById(R.id.edtB31);
        edtB32  = findViewById(R.id.edtB32);
        edtB33  = findViewById(R.id.edtB33);
        edtB34  = findViewById(R.id.edtB34);
        edtB35  = findViewById(R.id.edtB35);
        edtB36  = findViewById(R.id.edtB36);

        edtB41  = findViewById(R.id.edtB41);
        edtB42  = findViewById(R.id.edtB42);
        edtB43  = findViewById(R.id.edtB43);
        edtB44  = findViewById(R.id.edtB44);
        edtB45  = findViewById(R.id.edtB45);
        edtB46  = findViewById(R.id.edtB46);

        edtB51  = findViewById(R.id.edtB51);
        edtB52  = findViewById(R.id.edtB52);
        edtB53  = findViewById(R.id.edtB53);
        edtB54  = findViewById(R.id.edtB54);
        edtB55  = findViewById(R.id.edtB55);
        edtB56  = findViewById(R.id.edtB56);

        edtB61  = findViewById(R.id.edtB61);
        edtB62  = findViewById(R.id.edtB62);
        edtB63  = findViewById(R.id.edtB63);
        edtB64  = findViewById(R.id.edtB64);
        edtB65  = findViewById(R.id.edtB65);
        edtB66  = findViewById(R.id.edtB66);


        View.OnClickListener touch = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.btnr:
                        Intent intent = new Intent(MultiplicationActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.btn1:
                       x = Integer.parseInt(edt1.getText().toString());
                       y = Integer.parseInt(edt2.getText().toString());

                       x = (x > 6)? 6:x;
                       x = (x < 1)? 1:x;
                       edt1.setText(String.valueOf(x));

                       y = (y > 6)? 6:y;
                       y = (y < 1)? 1:y;
                       edt2.setText(String.valueOf(y));

                       z = y;
                       edt21.setText(String.valueOf(z));

                       edt21.setEnabled(false);
                       edt21.setCursorVisible(false);
                       edt21.setKeyListener(null);

                       edtB1.setVisibility((z >= 1) ? View.VISIBLE: View.INVISIBLE);
                       edtB21.setVisibility((z >= 2) ? View.VISIBLE: View.INVISIBLE);
                       edtB31.setVisibility((z >= 3) ? View.VISIBLE: View.INVISIBLE);
                       edtB41.setVisibility((z >= 4) ? View.VISIBLE: View.INVISIBLE);
                       edtB51.setVisibility((z >= 5) ? View.VISIBLE: View.INVISIBLE);
                       edtB61.setVisibility((z >= 6) ? View.VISIBLE: View.INVISIBLE);
                       switch (x) {
                           case 1:
                               edtA1.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA2.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA3.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA4.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA5.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA6.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtA21.setVisibility(View.GONE);
                                edtA22.setVisibility(View.GONE);
                                edtA23.setVisibility(View.GONE);
                                edtA24.setVisibility(View.GONE);
                                edtA25.setVisibility(View.GONE);
                                edtA26.setVisibility(View.GONE);

                                edtA31.setVisibility(View.GONE);
                                edtA32.setVisibility(View.GONE);
                                edtA33.setVisibility(View.GONE);
                                edtA34.setVisibility(View.GONE);
                                edtA35.setVisibility(View.GONE);
                                edtA36.setVisibility(View.GONE);

                                edtA41.setVisibility(View.GONE);
                                edtA42.setVisibility(View.GONE);
                                edtA43.setVisibility(View.GONE);
                                edtA44.setVisibility(View.GONE);
                                edtA45.setVisibility(View.GONE);
                                edtA46.setVisibility(View.GONE);

                                edtA51.setVisibility(View.GONE);
                                edtA52.setVisibility(View.GONE);
                                edtA53.setVisibility(View.GONE);
                                edtA54.setVisibility(View.GONE);
                                edtA55.setVisibility(View.GONE);
                                edtA56.setVisibility(View.GONE);

                                edtA61.setVisibility(View.GONE);
                                edtA62.setVisibility(View.GONE);
                                edtA63.setVisibility(View.GONE);
                                edtA64.setVisibility(View.GONE);
                                edtA65.setVisibility(View.GONE);
                                edtA66.setVisibility(View.GONE);

                               break;
                           case 2:
                               edtA1.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA2.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA3.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA4.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA5.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA6.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA21.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA22.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA23.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA24.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA25.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA26.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA31.setVisibility(View.GONE);
                               edtA32.setVisibility(View.GONE);
                               edtA33.setVisibility(View.GONE);
                               edtA34.setVisibility(View.GONE);
                               edtA35.setVisibility(View.GONE);
                               edtA36.setVisibility(View.GONE);

                               edtA41.setVisibility(View.GONE);
                               edtA42.setVisibility(View.GONE);
                               edtA43.setVisibility(View.GONE);
                               edtA44.setVisibility(View.GONE);
                               edtA45.setVisibility(View.GONE);
                               edtA46.setVisibility(View.GONE);

                               edtA51.setVisibility(View.GONE);
                               edtA52.setVisibility(View.GONE);
                               edtA53.setVisibility(View.GONE);
                               edtA54.setVisibility(View.GONE);
                               edtA55.setVisibility(View.GONE);
                               edtA56.setVisibility(View.GONE);

                               edtA61.setVisibility(View.GONE);
                               edtA62.setVisibility(View.GONE);
                               edtA63.setVisibility(View.GONE);
                               edtA64.setVisibility(View.GONE);
                               edtA65.setVisibility(View.GONE);
                               edtA66.setVisibility(View.GONE);
                               break;
                           case 3:
                               edtA1.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA2.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA3.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA4.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA5.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA6.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA21.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA22.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA23.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA24.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA25.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA26.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA31.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA32.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA33.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA34.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA35.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA36.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA41.setVisibility(View.GONE);
                               edtA42.setVisibility(View.GONE);
                               edtA43.setVisibility(View.GONE);
                               edtA44.setVisibility(View.GONE);
                               edtA45.setVisibility(View.GONE);
                               edtA46.setVisibility(View.GONE);

                               edtA51.setVisibility(View.GONE);
                               edtA52.setVisibility(View.GONE);
                               edtA53.setVisibility(View.GONE);
                               edtA54.setVisibility(View.GONE);
                               edtA55.setVisibility(View.GONE);
                               edtA56.setVisibility(View.GONE);

                               edtA61.setVisibility(View.GONE);
                               edtA62.setVisibility(View.GONE);
                               edtA63.setVisibility(View.GONE);
                               edtA64.setVisibility(View.GONE);
                               edtA65.setVisibility(View.GONE);
                               edtA66.setVisibility(View.GONE);
                               break;
                           case 4:
                               edtA1.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA2.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA3.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA4.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA5.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA6.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA21.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA22.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA23.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA24.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA25.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA26.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA31.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA32.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA33.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA34.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA35.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA36.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA41.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA42.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA43.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA44.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA45.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA46.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA51.setVisibility(View.GONE);
                               edtA52.setVisibility(View.GONE);
                               edtA53.setVisibility(View.GONE);
                               edtA54.setVisibility(View.GONE);
                               edtA55.setVisibility(View.GONE);
                               edtA56.setVisibility(View.GONE);

                               edtA61.setVisibility(View.GONE);
                               edtA62.setVisibility(View.GONE);
                               edtA63.setVisibility(View.GONE);
                               edtA64.setVisibility(View.GONE);
                               edtA65.setVisibility(View.GONE);
                               edtA66.setVisibility(View.GONE);
                               break;
                           case 5:
                               edtA1.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA2.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA3.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA4.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA5.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA6.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA21.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA22.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA23.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA24.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA25.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA26.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA31.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA32.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA33.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA34.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA35.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA36.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA41.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA42.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA43.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA44.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA45.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA46.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA51.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA52.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA53.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA54.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA55.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA56.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA61.setVisibility(View.GONE);
                               edtA62.setVisibility(View.GONE);
                               edtA63.setVisibility(View.GONE);
                               edtA64.setVisibility(View.GONE);
                               edtA65.setVisibility(View.GONE);
                               edtA66.setVisibility(View.GONE);
                               break;
                           case 6:
                               edtA1.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA2.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA3.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA4.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA5.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA6.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA21.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA22.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA23.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA24.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA25.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA26.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA31.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA32.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA33.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA34.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA35.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA36.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA41.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA42.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA43.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA44.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA45.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA46.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA51.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA52.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA53.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA54.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA55.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA56.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);

                               edtA61.setVisibility((y >= 1) ? View.VISIBLE: View.INVISIBLE);
                               edtA62.setVisibility((y >= 2) ? View.VISIBLE: View.INVISIBLE);
                               edtA63.setVisibility((y >= 3) ? View.VISIBLE: View.INVISIBLE);
                               edtA64.setVisibility((y >= 4) ? View.VISIBLE: View.INVISIBLE);
                               edtA65.setVisibility((y >= 5) ? View.VISIBLE: View.INVISIBLE);
                               edtA66.setVisibility((y >= 6) ? View.VISIBLE: View.INVISIBLE);
                               break;
                       }

                        w = Integer.parseInt(edt22.getText().toString());
                        w = (w > 6)? 6:w;
                        w = (w < 1)? 1:w;
                        edt22.setText(String.valueOf(w));

                        switch (z) {
                            case 1:
                                edtB1.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB2.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB3.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB4.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB5.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB6.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB21.setVisibility(View.GONE);
                                edtB22.setVisibility(View.GONE);
                                edtB23.setVisibility(View.GONE);
                                edtB24.setVisibility(View.GONE);
                                edtB25.setVisibility(View.GONE);
                                edtB26.setVisibility(View.GONE);

                                edtB31.setVisibility(View.GONE);
                                edtB32.setVisibility(View.GONE);
                                edtB33.setVisibility(View.GONE);
                                edtB34.setVisibility(View.GONE);
                                edtB35.setVisibility(View.GONE);
                                edtB36.setVisibility(View.GONE);

                                edtB41.setVisibility(View.GONE);
                                edtB42.setVisibility(View.GONE);
                                edtB43.setVisibility(View.GONE);
                                edtB44.setVisibility(View.GONE);
                                edtB45.setVisibility(View.GONE);
                                edtB46.setVisibility(View.GONE);

                                edtB51.setVisibility(View.GONE);
                                edtB52.setVisibility(View.GONE);
                                edtB53.setVisibility(View.GONE);
                                edtB54.setVisibility(View.GONE);
                                edtB55.setVisibility(View.GONE);
                                edtB56.setVisibility(View.GONE);

                                edtB61.setVisibility(View.GONE);
                                edtB62.setVisibility(View.GONE);
                                edtB63.setVisibility(View.GONE);
                                edtB64.setVisibility(View.GONE);
                                edtB65.setVisibility(View.GONE);
                                edtB66.setVisibility(View.GONE);

                                break;
                            case 2:
                                edtB1.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB2.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB3.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB4.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB5.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB6.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB21.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB22.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB23.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB24.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB25.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB26.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB31.setVisibility(View.GONE);
                                edtB32.setVisibility(View.GONE);
                                edtB33.setVisibility(View.GONE);
                                edtB34.setVisibility(View.GONE);
                                edtB35.setVisibility(View.GONE);
                                edtB36.setVisibility(View.GONE);

                                edtB41.setVisibility(View.GONE);
                                edtB42.setVisibility(View.GONE);
                                edtB43.setVisibility(View.GONE);
                                edtB44.setVisibility(View.GONE);
                                edtB45.setVisibility(View.GONE);
                                edtB46.setVisibility(View.GONE);

                                edtB51.setVisibility(View.GONE);
                                edtB52.setVisibility(View.GONE);
                                edtB53.setVisibility(View.GONE);
                                edtB54.setVisibility(View.GONE);
                                edtB55.setVisibility(View.GONE);
                                edtB56.setVisibility(View.GONE);

                                edtB61.setVisibility(View.GONE);
                                edtB62.setVisibility(View.GONE);
                                edtB63.setVisibility(View.GONE);
                                edtB64.setVisibility(View.GONE);
                                edtB65.setVisibility(View.GONE);
                                edtB66.setVisibility(View.GONE);

                                break;
                            case 3:
                                edtB1.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB2.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB3.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB4.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB5.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB6.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB21.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB22.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB23.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB24.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB25.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB26.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB31.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB32.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB33.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB34.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB35.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB36.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB41.setVisibility(View.GONE);
                                edtB42.setVisibility(View.GONE);
                                edtB43.setVisibility(View.GONE);
                                edtB44.setVisibility(View.GONE);
                                edtB45.setVisibility(View.GONE);
                                edtB46.setVisibility(View.GONE);

                                edtB51.setVisibility(View.GONE);
                                edtB52.setVisibility(View.GONE);
                                edtB53.setVisibility(View.GONE);
                                edtB54.setVisibility(View.GONE);
                                edtB55.setVisibility(View.GONE);
                                edtB56.setVisibility(View.GONE);

                                edtB61.setVisibility(View.GONE);
                                edtB62.setVisibility(View.GONE);
                                edtB63.setVisibility(View.GONE);
                                edtB64.setVisibility(View.GONE);
                                edtB65.setVisibility(View.GONE);
                                edtB66.setVisibility(View.GONE);

                                break;
                            case 4:
                                edtB1.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB2.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB3.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB4.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB5.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB6.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB21.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB22.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB23.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB24.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB25.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB26.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB31.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB32.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB33.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB34.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB35.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB36.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB41.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB42.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB43.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB44.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB45.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB46.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB51.setVisibility(View.GONE);
                                edtB52.setVisibility(View.GONE);
                                edtB53.setVisibility(View.GONE);
                                edtB54.setVisibility(View.GONE);
                                edtB55.setVisibility(View.GONE);
                                edtB56.setVisibility(View.GONE);

                                edtB61.setVisibility(View.GONE);
                                edtB62.setVisibility(View.GONE);
                                edtB63.setVisibility(View.GONE);
                                edtB64.setVisibility(View.GONE);
                                edtB65.setVisibility(View.GONE);
                                edtB66.setVisibility(View.GONE);
                                break;
                            case 5:
                                edtB1.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB2.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB3.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB4.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB5.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB6.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB21.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB22.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB23.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB24.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB25.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB26.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB31.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB32.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB33.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB34.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB35.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB36.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB41.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB42.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB43.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB44.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB45.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB46.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB51.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB52.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB53.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB54.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB55.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB56.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB61.setVisibility(View.GONE);
                                edtB62.setVisibility(View.GONE);
                                edtB63.setVisibility(View.GONE);
                                edtB64.setVisibility(View.GONE);
                                edtB65.setVisibility(View.GONE);
                                edtB66.setVisibility(View.GONE);

                                break;
                            case 6:
                                edtB1.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB2.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB3.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB4.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB5.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB6.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB21.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB22.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB23.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB24.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB25.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB26.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB31.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB32.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB33.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB34.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB35.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB36.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB41.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB42.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB43.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB44.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB45.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB46.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB51.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB52.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB53.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB54.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB55.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB56.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);

                                edtB61.setVisibility((w >= 1) ? View.VISIBLE: View.INVISIBLE);
                                edtB62.setVisibility((w >= 2) ? View.VISIBLE: View.INVISIBLE);
                                edtB63.setVisibility((w >= 3) ? View.VISIBLE: View.INVISIBLE);
                                edtB64.setVisibility((w >= 4) ? View.VISIBLE: View.INVISIBLE);
                                edtB65.setVisibility((w >= 5) ? View.VISIBLE: View.INVISIBLE);
                                edtB66.setVisibility((w >= 6) ? View.VISIBLE: View.INVISIBLE);
                                break;
                        }


                        break;
                    case R.id.btnAns:
                        str = "C = ";
                        matrixA = new float[x][y];
                        matrixB = new float[z][w];
                        matrixR = new float[x][w];
                        matrixA[0][0] =Float.parseFloat(edtA1.getText().toString());
                        matrixB[0][0] = Float.parseFloat(edtB1.getText().toString());

                        if (edtA2.getVisibility() == View.VISIBLE ){
                            if (edtA2.getText().toString() != ""){
                                matrixA[0][1] =Float.parseFloat(edtA2.getText().toString());
                            } else {
                                if (error == 0) {
                                    error = 1;
                                    str = str + "вы пропустили ячейку,\n значение заменено на 0";
                                }
                                matrixA[0][1] =0;
                            }

                        }

                        if (edtA3.getVisibility() == View.VISIBLE ){
                            if (edtA3.getText().toString() != ""){
                                matrixA[0][2] =Float.parseFloat(edtA3.getText().toString());
                            } else {
                                if (error == 0) {
                                    error = 1;
                                    str = str + "вы пропустили ячейку,\n значение заменено на 0";
                                }
                                matrixA[0][2] =0;
                            }

                        }

                        if (edtA4.getVisibility() == View.VISIBLE ){
                            if (edtA4.getText().toString() != ""){
                                matrixA[0][3] =Float.parseFloat(edtA4.getText().toString());
                            } else {
                                if (error == 0) {
                                    error = 1;
                                    str = str + "вы пропустили ячейку,\n значение заменено на 0";
                                }
                                matrixA[0][3] =0;
                            }

                        }

                        if (edtA5.getVisibility() == View.VISIBLE ){
                            if (edtA5.getText().toString() != ""){
                                matrixA[0][4] =Float.parseFloat(edtA5.getText().toString());
                            } else {
                                if (error == 0) {
                                    error = 1;
                                    str = str + "вы пропустили ячейку,\n значение заменено на 0";
                                }
                                matrixA[0][4] =0;
                            }

                        }

                        if (edtA6.getVisibility() == View.VISIBLE ){
                            if (edtA6.getText().toString() != ""){
                                matrixA[0][5] =Float.parseFloat(edtA6.getText().toString());
                            } else {
                                if (error == 0) {
                                    error = 1;
                                    str = str + "вы пропустили ячейку,\n значение заменено на 0";
                                }
                                matrixA[0][5] =0;
                            }

                        }

                        //
                        if (edtA21.getVisibility() == View.VISIBLE ){
                            if (edtA21.getText().toString() != ""){
                                matrixA[1][0] =Float.parseFloat(edtA21.getText().toString());
                            } else {
                                if (error == 0) {
                                    error = 1;
                                    str = str + "вы пропустили ячейку,\n значение заменено на 0";
                                }
                                matrixA[1][0] =0;
                            }
                        }

                        if (edtA22.getVisibility() == View.VISIBLE ){
                            if (edtA22.getText().toString() != ""){
                                matrixA[1][1] =Float.parseFloat(edtA22.getText().toString());
                            } else {
                                if (error == 0) {
                                    error = 1;
                                    str = str + "вы пропустили ячейку,\n значение заменено на 0";
                                }
                                matrixA[1][1] =0;
                            }
                        }

                        if (edtA23.getVisibility() == View.VISIBLE ){
                            if (edtA23.getText().toString() != ""){
                                matrixA[1][2] =Float.parseFloat(edtA23.getText().toString());

                            } else {
                                if (error == 0) {
                                    error = 1;
                                    str = str + "вы пропустили ячейку,\n значение заменено на 0";
                                }
                                matrixA[1][2] =0;
                            }
                        }

                        if (edtA24.getVisibility() == View.VISIBLE ){
                            if (edtA24.getText().toString() != ""){
                                matrixA[1][3] =Float.parseFloat(edtA24.getText().toString());
                            } else {
                                if (error == 0) {
                                    error = 1;
                                    str = str + "вы пропустили ячейку,\n значение заменено на 0";
                                }
                                matrixA[1][3] =0;
                            }
                        }

                        if (edtA25.getVisibility() == View.VISIBLE ){
                            if (edtA25.getText().toString() != ""){
                                matrixA[1][4] =Float.parseFloat(edtA25.getText().toString());
                            } else {
                                if (error == 0) {
                                    error = 1;
                                    str = str + "вы пропустили ячейку,\n значение заменено на 0";
                                }
                                matrixA[1][4] =0;
                            }
                        }

                        if (edtA26.getVisibility() == View.VISIBLE ){
                            if (edtA26.getText().toString() != ""){
                                matrixA[1][5] =Float.parseFloat(edtA26.getText().toString());
                            } else {
                                if (error == 0) {
                                    error = 1;
                                    str = str + "вы пропустили ячейку,\n значение заменено на 0";
                                }
                                matrixA[1][5] =0;
                            }
                        }
                        //

                        if (edtA31.getVisibility() == View.VISIBLE ){
                            if (edtA31.getText().toString() != ""){
                                matrixA[2][0] =Float.parseFloat(edtA31.getText().toString());
                            } else {
                                if (error == 0) {
                                    error = 1;
                                    str = str + "вы пропустили ячейку,\n значение заменено на 0";
                                }
                                matrixA[2][0] =0;
                            }
                        }

                        if (edtA32.getVisibility() == View.VISIBLE ){
                            if (edtA32.getText().toString() != ""){
                                matrixA[2][1] =Float.parseFloat(edtA32.getText().toString());
                            } else {
                                if (error == 0) {
                                    error = 1;
                                    str = str + "вы пропустили ячейку,\n значение заменено на 0";
                                }
                                matrixA[2][1] =0;
                            }
                        }

                        if (edtA33.getVisibility() == View.VISIBLE ){
                            if (edtA33.getText().toString() != ""){
                                matrixA[2][2] =Float.parseFloat(edtA33.getText().toString());

                            } else {
                                if (error == 0) {
                                    error = 1;
                                    str = str + "вы пропустили ячейку,\n значение заменено на 0";
                                }
                                matrixA[2][2] =0;
                            }
                        }

                        if (edtA34.getVisibility() == View.VISIBLE ){
                            if (edtA34.getText().toString() != ""){
                                matrixA[2][3] =Float.parseFloat(edtA34.getText().toString());

                            } else {
                                if (error == 0) {
                                    error = 1;
                                    str = str + "вы пропустили ячейку,\n значение заменено на 0";
                                }
                                matrixA[2][3] =0;
                            }
                        }

                        if (edtA35.getVisibility() == View.VISIBLE ){
                            matrixA[2][4] =Float.parseFloat(edtA35.getText().toString());
                        }

                        if (edtA36.getVisibility() == View.VISIBLE ){
                            matrixA[2][5] =Float.parseFloat(edtA36.getText().toString());
                        }
                        //

                        if (edtA41.getVisibility() == View.VISIBLE ){
                            matrixA[3][0] =Float.parseFloat(edtA41.getText().toString());
                        }

                        if (edtA42.getVisibility() == View.VISIBLE ){
                            matrixA[3][1] =Float.parseFloat(edtA42.getText().toString());
                        }

                        if (edtA43.getVisibility() == View.VISIBLE ){
                            matrixA[3][2] =Float.parseFloat(edtA43.getText().toString());
                        }

                        if (edtA44.getVisibility() == View.VISIBLE ){
                            matrixA[3][3] =Float.parseFloat(edtA44.getText().toString());
                        }

                        if (edtA45.getVisibility() == View.VISIBLE ){
                            matrixA[3][4] =Float.parseFloat(edtA45.getText().toString());
                        }

                        if (edtA46.getVisibility() == View.VISIBLE ){
                            matrixA[3][5] =Float.parseFloat(edtA46.getText().toString());
                        }
                        //

                        if (edtA51.getVisibility() == View.VISIBLE ){
                            matrixA[4][0] =Float.parseFloat(edtA51.getText().toString());
                        }

                        if (edtA52.getVisibility() == View.VISIBLE ){
                            matrixA[4][1] =Float.parseFloat(edtA52.getText().toString());
                        }

                        if (edtA53.getVisibility() == View.VISIBLE ){
                            matrixA[4][2] =Float.parseFloat(edtA53.getText().toString());
                        }

                        if (edtA54.getVisibility() == View.VISIBLE ){
                            matrixA[4][3] =Float.parseFloat(edtA54.getText().toString());
                        }

                        if (edtA55.getVisibility() == View.VISIBLE ){
                            matrixA[4][4] =Float.parseFloat(edtA55.getText().toString());
                        }

                        if (edtA56.getVisibility() == View.VISIBLE ){
                            matrixA[4][5] =Float.parseFloat(edtA56.getText().toString());
                        }
                        //

                        if (edtA61.getVisibility() == View.VISIBLE ){
                            matrixA[5][0] =Float.parseFloat(edtA61.getText().toString());
                        }

                        if (edtA62.getVisibility() == View.VISIBLE ){
                            matrixA[5][1] =Float.parseFloat(edtA62.getText().toString());
                        }

                        if (edtA63.getVisibility() == View.VISIBLE ){
                            matrixA[5][2] =Float.parseFloat(edtA63.getText().toString());
                        }

                        if (edtA64.getVisibility() == View.VISIBLE ){
                            matrixA[5][3] =Float.parseFloat(edtA64.getText().toString());
                        }

                        if (edtA65.getVisibility() == View.VISIBLE ){
                            matrixA[5][4] =Float.parseFloat(edtA65.getText().toString());
                        }

                        if (edtA66.getVisibility() == View.VISIBLE ){
                            matrixA[5][5] =Float.parseFloat(edtA66.getText().toString());
                        }
                        //матрица Б

                        if (edtB2.getVisibility() == View.VISIBLE ){
                            matrixB[0][1] =Float.parseFloat(edtB2.getText().toString());
                        }

                        if (edtB3.getVisibility() == View.VISIBLE ){
                            matrixB[0][2] =Float.parseFloat(edtB3.getText().toString());
                        }

                        if (edtB4.getVisibility() == View.VISIBLE ){
                            matrixB[0][3] =Float.parseFloat(edtB4.getText().toString());
                        }

                        if (edtB5.getVisibility() == View.VISIBLE ){
                            matrixB[0][4] =Float.parseFloat(edtB5.getText().toString());
                        }

                        if (edtB6.getVisibility() == View.VISIBLE ){
                            matrixB[0][5] =Float.parseFloat(edtB6.getText().toString());
                        }

                        //
                        if (edtB21.getVisibility() == View.VISIBLE ){
                            matrixB[1][0] =Float.parseFloat(edtB21.getText().toString());
                        }

                        if (edtB22.getVisibility() == View.VISIBLE ){
                            matrixB[1][1] =Float.parseFloat(edtB22.getText().toString());
                        }

                        if (edtB23.getVisibility() == View.VISIBLE ){
                            matrixB[1][2] =Float.parseFloat(edtB23.getText().toString());
                        }

                        if (edtB24.getVisibility() == View.VISIBLE ){
                            matrixB[1][3] =Float.parseFloat(edtB24.getText().toString());
                        }

                        if (edtB25.getVisibility() == View.VISIBLE ){
                            matrixB[1][4] =Float.parseFloat(edtB25.getText().toString());
                        }

                        if (edtB26.getVisibility() == View.VISIBLE ){
                            matrixB[1][5] =Float.parseFloat(edtB26.getText().toString());
                        }
                        //

                        if (edtB31.getVisibility() == View.VISIBLE ){
                            matrixB[2][0] =Float.parseFloat(edtB31.getText().toString());
                        }

                        if (edtB32.getVisibility() == View.VISIBLE ){
                            matrixB[2][1] =Float.parseFloat(edtB32.getText().toString());
                        }

                        if (edtB33.getVisibility() == View.VISIBLE ){
                            matrixB[2][2] =Float.parseFloat(edtB33.getText().toString());
                        }

                        if (edtB34.getVisibility() == View.VISIBLE ){
                            matrixB[2][3] =Float.parseFloat(edtB34.getText().toString());
                        }

                        if (edtB35.getVisibility() == View.VISIBLE ){
                            matrixB[2][4] =Float.parseFloat(edtB35.getText().toString());
                        }

                        if (edtB36.getVisibility() == View.VISIBLE ){
                            matrixB[2][5] =Float.parseFloat(edtB36.getText().toString());
                        }
                        //

                        if (edtB41.getVisibility() == View.VISIBLE ){
                            matrixB[3][0] =Float.parseFloat(edtB41.getText().toString());
                        }

                        if (edtB42.getVisibility() == View.VISIBLE ){
                            matrixB[3][1] =Float.parseFloat(edtB42.getText().toString());
                        }

                        if (edtB43.getVisibility() == View.VISIBLE ){
                            matrixB[3][2] =Float.parseFloat(edtB43.getText().toString());
                        }

                        if (edtB44.getVisibility() == View.VISIBLE ){
                            matrixB[3][3] =Float.parseFloat(edtB44.getText().toString());
                        }

                        if (edtB45.getVisibility() == View.VISIBLE ){
                            matrixB[3][4] =Float.parseFloat(edtB45.getText().toString());
                        }

                        if (edtB46.getVisibility() == View.VISIBLE ){
                            matrixB[3][5] =Float.parseFloat(edtB46.getText().toString());
                        }
                        //

                        if (edtB51.getVisibility() == View.VISIBLE ){
                            matrixB[4][0] =Float.parseFloat(edtB51.getText().toString());
                        }

                        if (edtB52.getVisibility() == View.VISIBLE ){
                            matrixB[4][1] =Float.parseFloat(edtB52.getText().toString());
                        }

                        if (edtB53.getVisibility() == View.VISIBLE ){
                            matrixB[4][2] =Float.parseFloat(edtB53.getText().toString());
                        }

                        if (edtB54.getVisibility() == View.VISIBLE ){
                            matrixB[4][3] =Float.parseFloat(edtB54.getText().toString());
                        }

                        if (edtB55.getVisibility() == View.VISIBLE ){
                            matrixB[4][4] =Float.parseFloat(edtB55.getText().toString());
                        }

                        if (edtB56.getVisibility() == View.VISIBLE ){
                            matrixB[4][5] =Float.parseFloat(edtB56.getText().toString());
                        }
                        //

                        if (edtB61.getVisibility() == View.VISIBLE ){
                            matrixB[5][0] =Float.parseFloat(edtB61.getText().toString());
                        }

                        if (edtB62.getVisibility() == View.VISIBLE ){
                            matrixB[5][1] =Float.parseFloat(edtB62.getText().toString());
                        }

                        if (edtB63.getVisibility() == View.VISIBLE ){
                            matrixB[5][2] =Float.parseFloat(edtB63.getText().toString());
                        }

                        if (edtB64.getVisibility() == View.VISIBLE ){
                            matrixB[5][3] =Float.parseFloat(edtB64.getText().toString());
                        }

                        if (edtB65.getVisibility() == View.VISIBLE ){
                            matrixB[5][4] =Float.parseFloat(edtB65.getText().toString());
                        }

                        if (edtB66.getVisibility() == View.VISIBLE ){
                            matrixB[5][5] =Float.parseFloat(edtB66.getText().toString());
                        }

                        int m = matrixA.length;
                        int n = matrixB[0].length;
                        int o = matrixB.length;

                        for (int i = 0; i < m; i++) {
                            for (int j = 0; j < n; j++) {
                                for (int k = 0; k < o; k++) {
                                    matrixR[i][j] += matrixA[i][k] * matrixB[k][j];
                                }
                            }
                        }

                        for (int i = 0; i < matrixR.length; i++) {
                            for (int j = 0; j < matrixR[0].length; j++) {
                                double x = matrixR[i][j];
                                x = Math.rint(10000.0 * x) / 10000.0;
                                str = str + "  " + String.valueOf(x);
                            }
                            str = str + "\n" + "       ";

                        }
                        edtAns.setText(str);


                        break;


                }
            }

        };

        btnr.setOnClickListener(touch);
        btn1.setOnClickListener(touch);
        btnAns.setOnClickListener(touch);
    }
}
