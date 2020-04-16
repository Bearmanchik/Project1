package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GausActivity extends AppCompatActivity {

    Button btnr;
    Button btn1;
    Button btnAns;

    EditText editText;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;

    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;


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
    float[] matrixR;
    float z;
    String str = "C = ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaus);


        btnr = findViewById(R.id.btnr);
        btn1 = findViewById(R.id.btn1);
        btnAns = findViewById(R.id.btnAns);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        editText5 = findViewById(R.id.editText5);
        editText6 = findViewById(R.id.editText6);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);

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
                        Intent intent = new Intent(GausActivity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.btn1:
                        x = Integer.parseInt(edt1.getText().toString());
                        x = (x > 6)? 6:x;
                        x = (x < 1)? 1:x;
                        edt1.setText(String.valueOf(x));

                        edt2.setEnabled(false);
                        edt2.setCursorVisible(false);
                        edt2.setKeyListener(null);

                        y = x;
                        edt2.setText(String.valueOf(x));

                        switch (x) {
                            case 1:
                                edtA1.setVisibility(View.VISIBLE);
                                edtA2.setVisibility(View.GONE);
                                edtA3.setVisibility(View.GONE);
                                edtA4.setVisibility(View.GONE);
                                edtA5.setVisibility(View.GONE);
                                edtA6.setVisibility(View.GONE);

                                editText.setVisibility(View.VISIBLE);
                                textView.setVisibility(View.VISIBLE);
                                editText2.setVisibility(View.GONE);
                                textView2.setVisibility(View.GONE);
                                editText3.setVisibility(View.GONE);
                                textView3.setVisibility(View.GONE);
                                editText4.setVisibility(View.GONE);
                                textView4.setVisibility(View.GONE);
                                editText5.setVisibility(View.GONE);
                                textView5.setVisibility(View.GONE);
                                editText6.setVisibility(View.GONE);
                                textView6.setVisibility(View.GONE);


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
                                edtA1.setVisibility(View.VISIBLE);
                                edtA2.setVisibility(View.VISIBLE);
                                edtA21.setVisibility(View.VISIBLE);
                                edtA22.setVisibility(View.VISIBLE);

                                edtA23.setVisibility(View.GONE);
                                edtA3.setVisibility(View.GONE);
                                edtA4.setVisibility(View.GONE);
                                edtA5.setVisibility(View.GONE);
                                edtA6.setVisibility(View.GONE);

                                editText.setVisibility(View.VISIBLE);
                                textView.setVisibility(View.VISIBLE);
                                editText2.setVisibility(View.VISIBLE);
                                textView2.setVisibility(View.VISIBLE);
                                editText3.setVisibility(View.GONE);
                                textView3.setVisibility(View.GONE);
                                editText4.setVisibility(View.GONE);
                                textView4.setVisibility(View.GONE);
                                editText5.setVisibility(View.GONE);
                                textView5.setVisibility(View.GONE);
                                editText6.setVisibility(View.GONE);
                                textView6.setVisibility(View.GONE);


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
                            case 3:
                                edtA1.setVisibility(View.VISIBLE);
                                edtA2.setVisibility(View.VISIBLE);
                                edtA3.setVisibility(View.VISIBLE);
                                edtA21.setVisibility(View.VISIBLE);
                                edtA22.setVisibility(View.VISIBLE);
                                edtA23.setVisibility(View.VISIBLE);
                                edtA31.setVisibility(View.VISIBLE);
                                edtA32.setVisibility(View.VISIBLE);
                                edtA33.setVisibility(View.VISIBLE);

                                edtA4.setVisibility(View.GONE);
                                edtA5.setVisibility(View.GONE);
                                edtA6.setVisibility(View.GONE);
                                edtA24.setVisibility(View.GONE);
                                edtA25.setVisibility(View.GONE);
                                edtA26.setVisibility(View.GONE);
                                edtA34.setVisibility(View.GONE);
                                edtA35.setVisibility(View.GONE);
                                edtA36.setVisibility(View.GONE);

                                editText.setVisibility(View.VISIBLE);
                                textView.setVisibility(View.VISIBLE);
                                editText2.setVisibility(View.VISIBLE);
                                textView2.setVisibility(View.VISIBLE);
                                editText3.setVisibility(View.VISIBLE);
                                textView3.setVisibility(View.VISIBLE);
                                editText4.setVisibility(View.GONE);
                                textView4.setVisibility(View.GONE);
                                editText5.setVisibility(View.GONE);
                                textView5.setVisibility(View.GONE);
                                editText6.setVisibility(View.GONE);
                                textView6.setVisibility(View.GONE);

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
                                edtA1.setVisibility(View.VISIBLE);
                                edtA2.setVisibility(View.VISIBLE);
                                edtA3.setVisibility(View.VISIBLE);
                                edtA4.setVisibility(View.VISIBLE);

                                edtA21.setVisibility(View.VISIBLE);
                                edtA22.setVisibility(View.VISIBLE);
                                edtA23.setVisibility(View.VISIBLE);
                                edtA24.setVisibility(View.VISIBLE);

                                edtA31.setVisibility(View.VISIBLE);
                                edtA32.setVisibility(View.VISIBLE);
                                edtA33.setVisibility(View.VISIBLE);
                                edtA34.setVisibility(View.VISIBLE);

                                edtA41.setVisibility(View.VISIBLE);
                                edtA42.setVisibility(View.VISIBLE);
                                edtA43.setVisibility(View.VISIBLE);
                                edtA44.setVisibility(View.VISIBLE);

                                edtA5.setVisibility(View.GONE);
                                edtA6.setVisibility(View.GONE);

                                edtA25.setVisibility(View.GONE);
                                edtA26.setVisibility(View.GONE);

                                edtA35.setVisibility(View.GONE);
                                edtA36.setVisibility(View.GONE);

                                edtA45.setVisibility(View.GONE);
                                edtA46.setVisibility(View.GONE);

                                editText.setVisibility(View.VISIBLE);
                                textView.setVisibility(View.VISIBLE);
                                editText2.setVisibility(View.VISIBLE);
                                textView2.setVisibility(View.VISIBLE);
                                editText3.setVisibility(View.VISIBLE);
                                textView3.setVisibility(View.VISIBLE);
                                editText4.setVisibility(View.VISIBLE);
                                textView4.setVisibility(View.VISIBLE);
                                editText5.setVisibility(View.GONE);
                                textView5.setVisibility(View.GONE);
                                editText6.setVisibility(View.GONE);
                                textView6.setVisibility(View.GONE);

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
                                edtA1.setVisibility(View.VISIBLE);
                                edtA2.setVisibility(View.VISIBLE);
                                edtA3.setVisibility(View.VISIBLE);
                                edtA4.setVisibility(View.VISIBLE);
                                edtA5.setVisibility(View.VISIBLE);

                                edtA21.setVisibility(View.VISIBLE);
                                edtA22.setVisibility(View.VISIBLE);
                                edtA23.setVisibility(View.VISIBLE);
                                edtA24.setVisibility(View.VISIBLE);
                                edtA25.setVisibility(View.VISIBLE);

                                edtA31.setVisibility(View.VISIBLE);
                                edtA32.setVisibility(View.VISIBLE);
                                edtA33.setVisibility(View.VISIBLE);
                                edtA34.setVisibility(View.VISIBLE);
                                edtA35.setVisibility(View.VISIBLE);

                                edtA41.setVisibility(View.VISIBLE);
                                edtA42.setVisibility(View.VISIBLE);
                                edtA43.setVisibility(View.VISIBLE);
                                edtA44.setVisibility(View.VISIBLE);
                                edtA45.setVisibility(View.VISIBLE);

                                edtA51.setVisibility(View.VISIBLE);
                                edtA52.setVisibility(View.VISIBLE);
                                edtA53.setVisibility(View.VISIBLE);
                                edtA54.setVisibility(View.VISIBLE);
                                edtA55.setVisibility(View.VISIBLE);

                                edtA6.setVisibility(View.GONE);

                                edtA26.setVisibility(View.GONE);

                                edtA36.setVisibility(View.GONE);

                                edtA46.setVisibility(View.GONE);

                                edtA56.setVisibility(View.GONE);

                                editText.setVisibility(View.VISIBLE);
                                textView.setVisibility(View.VISIBLE);
                                editText2.setVisibility(View.VISIBLE);
                                textView2.setVisibility(View.VISIBLE);
                                editText3.setVisibility(View.VISIBLE);
                                textView3.setVisibility(View.VISIBLE);
                                editText4.setVisibility(View.VISIBLE);
                                textView4.setVisibility(View.VISIBLE);
                                editText5.setVisibility(View.VISIBLE);
                                textView5.setVisibility(View.VISIBLE);
                                editText6.setVisibility(View.GONE);
                                textView6.setVisibility(View.GONE);

                                edtA61.setVisibility(View.GONE);
                                edtA62.setVisibility(View.GONE);
                                edtA63.setVisibility(View.GONE);
                                edtA64.setVisibility(View.GONE);
                                edtA65.setVisibility(View.GONE);
                                edtA66.setVisibility(View.GONE);
                                break;
                            case 6:
                                edtA1.setVisibility(View.VISIBLE);
                                edtA2.setVisibility(View.VISIBLE);
                                edtA3.setVisibility(View.VISIBLE);
                                edtA4.setVisibility(View.VISIBLE);
                                edtA5.setVisibility(View.VISIBLE);
                                edtA6.setVisibility(View.VISIBLE);

                                edtA21.setVisibility(View.VISIBLE);
                                edtA22.setVisibility(View.VISIBLE);
                                edtA23.setVisibility(View.VISIBLE);
                                edtA24.setVisibility(View.VISIBLE);
                                edtA25.setVisibility(View.VISIBLE);
                                edtA26.setVisibility(View.VISIBLE);

                                edtA31.setVisibility(View.VISIBLE);
                                edtA32.setVisibility(View.VISIBLE);
                                edtA33.setVisibility(View.VISIBLE);
                                edtA34.setVisibility(View.VISIBLE);
                                edtA35.setVisibility(View.VISIBLE);
                                edtA36.setVisibility(View.VISIBLE);

                                edtA41.setVisibility(View.VISIBLE);
                                edtA42.setVisibility(View.VISIBLE);
                                edtA43.setVisibility(View.VISIBLE);
                                edtA44.setVisibility(View.VISIBLE);
                                edtA45.setVisibility(View.VISIBLE);
                                edtA46.setVisibility(View.VISIBLE);

                                edtA51.setVisibility(View.VISIBLE);
                                edtA52.setVisibility(View.VISIBLE);
                                edtA53.setVisibility(View.VISIBLE);
                                edtA54.setVisibility(View.VISIBLE);
                                edtA55.setVisibility(View.VISIBLE);
                                edtA56.setVisibility(View.VISIBLE);

                                edtA61.setVisibility(View.VISIBLE);
                                edtA62.setVisibility(View.VISIBLE);
                                edtA63.setVisibility(View.VISIBLE);
                                edtA64.setVisibility(View.VISIBLE);
                                edtA65.setVisibility(View.VISIBLE);
                                edtA66.setVisibility(View.VISIBLE);

                                editText.setVisibility(View.VISIBLE);
                                textView.setVisibility(View.VISIBLE);
                                editText2.setVisibility(View.VISIBLE);
                                textView2.setVisibility(View.VISIBLE);
                                editText3.setVisibility(View.VISIBLE);
                                textView3.setVisibility(View.VISIBLE);
                                editText4.setVisibility(View.VISIBLE);
                                textView4.setVisibility(View.VISIBLE);
                                editText5.setVisibility(View.VISIBLE);
                                textView5.setVisibility(View.VISIBLE);
                                editText6.setVisibility(View.VISIBLE);
                                textView6.setVisibility(View.VISIBLE);
                                break;
                        }
                        break;

                    case R.id.btnAns:
                        str = "Ответ:\n";
                        matrixA = new float[x][x+1];
                        matrixR = new float[matrixA.length];

                        switch (x) {
                            case 1:
                                matrixA[0][0] = Float.parseFloat(edtA1.getText().toString());
                                matrixA[0][1] = Float.parseFloat(editText.getText().toString());

                                break;
                            case 2:
                                matrixA[0][0] = Float.parseFloat(edtA1.getText().toString());
                                matrixA[0][1] = Float.parseFloat(edtA2.getText().toString());
                                matrixA[1][0] = Float.parseFloat(edtA21.getText().toString());
                                matrixA[1][1] = Float.parseFloat(edtA22.getText().toString());

                                matrixA[0][2] = Float.parseFloat(editText.getText().toString());
                                matrixA[1][2] = Float.parseFloat(editText2.getText().toString());

                                break;
                            case 3:
                                matrixA[0][0] = Float.parseFloat(edtA1.getText().toString());
                                matrixA[0][1] = Float.parseFloat(edtA2.getText().toString());
                                matrixA[0][2] = Float.parseFloat(edtA3.getText().toString());

                                matrixA[1][0] = Float.parseFloat(edtA21.getText().toString());
                                matrixA[1][1] = Float.parseFloat(edtA22.getText().toString());
                                matrixA[1][2] = Float.parseFloat(edtA23.getText().toString());

                                matrixA[2][0] = Float.parseFloat(edtA31.getText().toString());
                                matrixA[2][1] = Float.parseFloat(edtA32.getText().toString());
                                matrixA[2][2] = Float.parseFloat(edtA33.getText().toString());

                                matrixA[0][3] = Float.parseFloat(editText.getText().toString());
                                matrixA[1][3] = Float.parseFloat(editText2.getText().toString());
                                matrixA[2][3] = Float.parseFloat(editText3.getText().toString());

                                break;
                            case 4:
                                matrixA[0][0] = Float.parseFloat(edtA1.getText().toString());
                                matrixA[0][1] = Float.parseFloat(edtA2.getText().toString());
                                matrixA[0][2] = Float.parseFloat(edtA3.getText().toString());
                                matrixA[0][3] = Float.parseFloat(edtA4.getText().toString());

                                matrixA[1][0] = Float.parseFloat(edtA21.getText().toString());
                                matrixA[1][1] = Float.parseFloat(edtA22.getText().toString());
                                matrixA[1][2] = Float.parseFloat(edtA23.getText().toString());
                                matrixA[1][3] = Float.parseFloat(edtA24.getText().toString());

                                matrixA[2][0] = Float.parseFloat(edtA31.getText().toString());
                                matrixA[2][1] = Float.parseFloat(edtA32.getText().toString());
                                matrixA[2][2] = Float.parseFloat(edtA33.getText().toString());
                                matrixA[2][3] = Float.parseFloat(edtA34.getText().toString());

                                matrixA[3][0] = Float.parseFloat(edtA41.getText().toString());
                                matrixA[3][1] = Float.parseFloat(edtA42.getText().toString());
                                matrixA[3][2] = Float.parseFloat(edtA43.getText().toString());
                                matrixA[3][3] = Float.parseFloat(edtA44.getText().toString());

                                matrixA[0][4] = Float.parseFloat(editText.getText().toString());
                                matrixA[1][4] = Float.parseFloat(editText2.getText().toString());
                                matrixA[2][4] = Float.parseFloat(editText3.getText().toString());
                                matrixA[3][4] = Float.parseFloat(editText4.getText().toString());
                                break;
                            case 5:
                                matrixA[0][0] = Float.parseFloat(edtA1.getText().toString());
                                matrixA[0][1] = Float.parseFloat(edtA2.getText().toString());
                                matrixA[0][2] = Float.parseFloat(edtA3.getText().toString());
                                matrixA[0][3] = Float.parseFloat(edtA4.getText().toString());
                                matrixA[0][4] = Float.parseFloat(edtA5.getText().toString());

                                matrixA[1][0] = Float.parseFloat(edtA21.getText().toString());
                                matrixA[1][1] = Float.parseFloat(edtA22.getText().toString());
                                matrixA[1][2] = Float.parseFloat(edtA23.getText().toString());
                                matrixA[1][3] = Float.parseFloat(edtA24.getText().toString());
                                matrixA[1][4] = Float.parseFloat(edtA25.getText().toString());

                                matrixA[2][0] = Float.parseFloat(edtA31.getText().toString());
                                matrixA[2][1] = Float.parseFloat(edtA32.getText().toString());
                                matrixA[2][2] = Float.parseFloat(edtA33.getText().toString());
                                matrixA[2][3] = Float.parseFloat(edtA34.getText().toString());
                                matrixA[2][4] = Float.parseFloat(edtA35.getText().toString());

                                matrixA[3][0] = Float.parseFloat(edtA41.getText().toString());
                                matrixA[3][1] = Float.parseFloat(edtA42.getText().toString());
                                matrixA[3][2] = Float.parseFloat(edtA43.getText().toString());
                                matrixA[3][3] = Float.parseFloat(edtA44.getText().toString());
                                matrixA[3][4] = Float.parseFloat(edtA45.getText().toString());

                                matrixA[4][0] = Float.parseFloat(edtA51.getText().toString());
                                matrixA[4][1] = Float.parseFloat(edtA52.getText().toString());
                                matrixA[4][2] = Float.parseFloat(edtA53.getText().toString());
                                matrixA[4][3] = Float.parseFloat(edtA54.getText().toString());
                                matrixA[4][4] = Float.parseFloat(edtA55.getText().toString());

                                matrixA[0][5] = Float.parseFloat(editText.getText().toString());
                                matrixA[1][5] = Float.parseFloat(editText2.getText().toString());
                                matrixA[2][5] = Float.parseFloat(editText3.getText().toString());
                                matrixA[3][5] = Float.parseFloat(editText4.getText().toString());
                                matrixA[4][5] = Float.parseFloat(editText5.getText().toString());

                                break;
                            case 6:
                                matrixA[0][0] = Float.parseFloat(edtA1.getText().toString());
                                matrixA[0][1] = Float.parseFloat(edtA2.getText().toString());
                                matrixA[0][2] = Float.parseFloat(edtA3.getText().toString());
                                matrixA[0][3] = Float.parseFloat(edtA4.getText().toString());
                                matrixA[0][4] = Float.parseFloat(edtA5.getText().toString());
                                matrixA[0][5] = Float.parseFloat(edtA6.getText().toString());

                                matrixA[1][0] = Float.parseFloat(edtA21.getText().toString());
                                matrixA[1][1] = Float.parseFloat(edtA22.getText().toString());
                                matrixA[1][2] = Float.parseFloat(edtA23.getText().toString());
                                matrixA[1][3] = Float.parseFloat(edtA24.getText().toString());
                                matrixA[1][4] = Float.parseFloat(edtA25.getText().toString());
                                matrixA[1][5] = Float.parseFloat(edtA26.getText().toString());

                                matrixA[2][0] = Float.parseFloat(edtA31.getText().toString());
                                matrixA[2][1] = Float.parseFloat(edtA32.getText().toString());
                                matrixA[2][2] = Float.parseFloat(edtA33.getText().toString());
                                matrixA[2][3] = Float.parseFloat(edtA34.getText().toString());
                                matrixA[2][4] = Float.parseFloat(edtA35.getText().toString());
                                matrixA[2][5] = Float.parseFloat(edtA36.getText().toString());

                                matrixA[3][0] = Float.parseFloat(edtA41.getText().toString());
                                matrixA[3][1] = Float.parseFloat(edtA42.getText().toString());
                                matrixA[3][2] = Float.parseFloat(edtA43.getText().toString());
                                matrixA[3][3] = Float.parseFloat(edtA44.getText().toString());
                                matrixA[3][4] = Float.parseFloat(edtA45.getText().toString());
                                matrixA[3][5] = Float.parseFloat(edtA46.getText().toString());

                                matrixA[4][0] = Float.parseFloat(edtA51.getText().toString());
                                matrixA[4][1] = Float.parseFloat(edtA52.getText().toString());
                                matrixA[4][2] = Float.parseFloat(edtA53.getText().toString());
                                matrixA[4][3] = Float.parseFloat(edtA54.getText().toString());
                                matrixA[4][4] = Float.parseFloat(edtA55.getText().toString());
                                matrixA[4][5] = Float.parseFloat(edtA56.getText().toString());

                                matrixA[5][0] = Float.parseFloat(edtA61.getText().toString());
                                matrixA[5][1] = Float.parseFloat(edtA62.getText().toString());
                                matrixA[5][2] = Float.parseFloat(edtA63.getText().toString());
                                matrixA[5][3] = Float.parseFloat(edtA64.getText().toString());
                                matrixA[5][4] = Float.parseFloat(edtA65.getText().toString());
                                matrixA[5][5] = Float.parseFloat(edtA66.getText().toString());

                                matrixA[0][6] = Float.parseFloat(editText.getText().toString());
                                matrixA[1][6] = Float.parseFloat(editText2.getText().toString());
                                matrixA[2][6] = Float.parseFloat(editText3.getText().toString());
                                matrixA[3][6] = Float.parseFloat(editText4.getText().toString());
                                matrixA[4][6] = Float.parseFloat(editText5.getText().toString());
                                matrixA[5][6] = Float.parseFloat(editText6.getText().toString());

                                break;
                        }


                      for (int i = 0; i < matrixA.length; i++) {
                          for (int j = i + 1; j < matrixA.length; j++) {
                              z = matrixA[j][i] / matrixA[i][i];
                              for (int q = i; q < matrixA[0].length; q++) {
                                  matrixA[j][q] = matrixA[j][q] - z * matrixA[i][q];

                              }
                          }
                      }

                            matrixR[matrixR.length - 1] = matrixA[matrixA.length-1][matrixA[0].length-2]/matrixA[matrixA.length-1][matrixA.length-1];


                        int i;
                        i = matrixA.length -1;
                        while (i>=0){
                            matrixR[i] = matrixA[i][matrixA[0].length -1];
                            for (int j = i+1; j<matrixA[0].length -1; j++) {
                                matrixR[i] -= matrixA[i][j] * matrixR[j];
                            }
                            matrixR[i] /= matrixA[i][i];
                            i= i - 1;

                        }

                        for (int j = 0; j < matrixR.length; j++ ) {
                            double x = matrixR[j];
                            if (Double.valueOf(x).isNaN()){
                                str = " Ошибка,\n корней нет,\n проверьте введённые данные\n или ведите другие";
                            }
                            else {
                                x = Math.rint(10000.0 * x) / 10000.0;
                                str = str + "x" +String.valueOf(j+1) + "= " + String.valueOf(x) + '\n';
                            }
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
