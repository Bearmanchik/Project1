package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TransportationActivity extends AppCompatActivity {


    Button btnr;
    Button btn1;
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

    int x = 1, y = 1;
    float[][] matrixA;
    float[][] matrixR;
    String str = "C = ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);

        btnr = findViewById(R.id.btnr);
        btn1 = findViewById(R.id.btn1);
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


        View.OnClickListener touch = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.btnr:
                        Intent intent = new Intent(TransportationActivity.this, MainActivity.class);
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

                        switch (x) {
                            case 1:
                                edtA1.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA2.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA3.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA4.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA5.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA6.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

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
                                edtA1.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA2.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA3.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA4.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA5.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA6.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

                                edtA21.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA22.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA23.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA24.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA25.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA26.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

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
                                edtA1.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA2.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA3.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA4.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA5.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA6.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

                                edtA21.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA22.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA23.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA24.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA25.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA26.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

                                edtA31.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA32.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA33.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA34.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA35.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA36.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

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
                                edtA1.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA2.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA3.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA4.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA5.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA6.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

                                edtA21.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA22.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA23.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA24.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA25.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA26.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

                                edtA31.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA32.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA33.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA34.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA35.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA36.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

                                edtA41.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA42.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA43.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA44.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA45.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA46.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

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
                                edtA1.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA2.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA3.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA4.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA5.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA6.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

                                edtA21.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA22.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA23.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA24.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA25.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA26.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

                                edtA31.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA32.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA33.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA34.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA35.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA36.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

                                edtA41.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA42.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA43.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA44.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA45.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA46.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

                                edtA51.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA52.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA53.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA54.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA55.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA56.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

                                edtA61.setVisibility(View.GONE);
                                edtA62.setVisibility(View.GONE);
                                edtA63.setVisibility(View.GONE);
                                edtA64.setVisibility(View.GONE);
                                edtA65.setVisibility(View.GONE);
                                edtA66.setVisibility(View.GONE);
                                break;
                            case 6:
                                edtA1.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA2.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA3.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA4.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA5.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA6.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

                                edtA21.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA22.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA23.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA24.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA25.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA26.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

                                edtA31.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA32.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA33.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA34.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA35.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA36.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

                                edtA41.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA42.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA43.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA44.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA45.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA46.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

                                edtA51.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA52.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA53.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA54.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA55.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA56.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);

                                edtA61.setVisibility((y >= 1) ? View.VISIBLE : View.INVISIBLE);
                                edtA62.setVisibility((y >= 2) ? View.VISIBLE : View.INVISIBLE);
                                edtA63.setVisibility((y >= 3) ? View.VISIBLE : View.INVISIBLE);
                                edtA64.setVisibility((y >= 4) ? View.VISIBLE : View.INVISIBLE);
                                edtA65.setVisibility((y >= 5) ? View.VISIBLE : View.INVISIBLE);
                                edtA66.setVisibility((y >= 6) ? View.VISIBLE : View.INVISIBLE);
                                break;
                        }
                        break;

                    case R.id.btnAns:
                        str = "C = ";
                        matrixA = new float[x][y];
                        matrixR = new float[y][x];
                        matrixA[0][0] = Float.parseFloat(edtA1.getText().toString());

                        if (edtA2.getVisibility() == View.VISIBLE) {
                            matrixA[0][1] = Float.parseFloat(edtA2.getText().toString());
                        }

                        if (edtA3.getVisibility() == View.VISIBLE) {
                            matrixA[0][2] = Float.parseFloat(edtA3.getText().toString());
                        }

                        if (edtA4.getVisibility() == View.VISIBLE) {
                            matrixA[0][3] = Float.parseFloat(edtA4.getText().toString());
                        }

                        if (edtA5.getVisibility() == View.VISIBLE) {
                            matrixA[0][4] = Float.parseFloat(edtA5.getText().toString());
                        }

                        if (edtA6.getVisibility() == View.VISIBLE) {
                            matrixA[0][5] = Float.parseFloat(edtA6.getText().toString());
                        }

                        //
                        if (edtA21.getVisibility() == View.VISIBLE) {
                            matrixA[1][0] = Float.parseFloat(edtA21.getText().toString());
                        }

                        if (edtA22.getVisibility() == View.VISIBLE) {
                            matrixA[1][1] = Float.parseFloat(edtA22.getText().toString());
                        }

                        if (edtA23.getVisibility() == View.VISIBLE) {
                            matrixA[1][2] = Float.parseFloat(edtA23.getText().toString());
                        }

                        if (edtA24.getVisibility() == View.VISIBLE) {
                            matrixA[1][3] = Float.parseFloat(edtA24.getText().toString());
                        }

                        if (edtA25.getVisibility() == View.VISIBLE) {
                            matrixA[1][4] = Float.parseFloat(edtA25.getText().toString());
                        }

                        if (edtA26.getVisibility() == View.VISIBLE) {
                            matrixA[1][5] = Float.parseFloat(edtA26.getText().toString());
                        }
                        //

                        if (edtA31.getVisibility() == View.VISIBLE) {
                            matrixA[2][0] = Float.parseFloat(edtA31.getText().toString());
                        }

                        if (edtA32.getVisibility() == View.VISIBLE) {
                            matrixA[2][1] = Float.parseFloat(edtA32.getText().toString());
                        }

                        if (edtA33.getVisibility() == View.VISIBLE) {
                            matrixA[2][2] = Float.parseFloat(edtA33.getText().toString());
                        }

                        if (edtA34.getVisibility() == View.VISIBLE) {
                            matrixA[2][3] = Float.parseFloat(edtA34.getText().toString());
                        }

                        if (edtA35.getVisibility() == View.VISIBLE) {
                            matrixA[2][4] = Float.parseFloat(edtA35.getText().toString());
                        }

                        if (edtA36.getVisibility() == View.VISIBLE) {
                            matrixA[2][5] = Float.parseFloat(edtA36.getText().toString());
                        }
                        //

                        if (edtA41.getVisibility() == View.VISIBLE) {
                            matrixA[3][0] = Float.parseFloat(edtA41.getText().toString());
                        }

                        if (edtA42.getVisibility() == View.VISIBLE) {
                            matrixA[3][1] = Float.parseFloat(edtA42.getText().toString());
                        }

                        if (edtA43.getVisibility() == View.VISIBLE) {
                            matrixA[3][2] = Float.parseFloat(edtA43.getText().toString());
                        }

                        if (edtA44.getVisibility() == View.VISIBLE) {
                            matrixA[3][3] = Float.parseFloat(edtA44.getText().toString());
                        }

                        if (edtA45.getVisibility() == View.VISIBLE) {
                            matrixA[3][4] = Float.parseFloat(edtA45.getText().toString());
                        }

                        if (edtA46.getVisibility() == View.VISIBLE) {
                            matrixA[3][5] = Float.parseFloat(edtA46.getText().toString());
                        }
                        //

                        if (edtA51.getVisibility() == View.VISIBLE) {
                            matrixA[4][0] = Float.parseFloat(edtA51.getText().toString());
                        }

                        if (edtA52.getVisibility() == View.VISIBLE) {
                            matrixA[4][1] = Float.parseFloat(edtA52.getText().toString());
                        }

                        if (edtA53.getVisibility() == View.VISIBLE) {
                            matrixA[4][2] = Float.parseFloat(edtA53.getText().toString());
                        }

                        if (edtA54.getVisibility() == View.VISIBLE) {
                            matrixA[4][3] = Float.parseFloat(edtA54.getText().toString());
                        }

                        if (edtA55.getVisibility() == View.VISIBLE) {
                            matrixA[4][4] = Float.parseFloat(edtA55.getText().toString());
                        }

                        if (edtA56.getVisibility() == View.VISIBLE) {
                            matrixA[4][5] = Float.parseFloat(edtA56.getText().toString());
                        }
                        //

                        if (edtA61.getVisibility() == View.VISIBLE) {
                            matrixA[5][0] = Float.parseFloat(edtA61.getText().toString());
                        }

                        if (edtA62.getVisibility() == View.VISIBLE) {
                            matrixA[5][1] = Float.parseFloat(edtA62.getText().toString());
                        }

                        if (edtA63.getVisibility() == View.VISIBLE) {
                            matrixA[5][2] = Float.parseFloat(edtA63.getText().toString());
                        }

                        if (edtA64.getVisibility() == View.VISIBLE) {
                            matrixA[5][3] = Float.parseFloat(edtA64.getText().toString());
                        }

                        if (edtA65.getVisibility() == View.VISIBLE) {
                            matrixA[5][4] = Float.parseFloat(edtA65.getText().toString());
                        }

                        if (edtA66.getVisibility() == View.VISIBLE) {
                            matrixA[5][5] = Float.parseFloat(edtA66.getText().toString());
                        }



                        for (int i = 0; i < matrixR.length; ++i)
                            for (int j = 0; j < matrixR[0].length; ++j) {
                                matrixR[i][j] = matrixA[j][i];
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
