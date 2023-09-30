package com.example.conversionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text11;
    TextView text12;
    TextView text13;
    TextView text14;
    TextView text15;

    EditText edit1;
    EditText edit2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.textView);
        text2 = findViewById(R.id.textView2);
        text3 = findViewById(R.id.textView3);
        text4 = findViewById(R.id.textView4);
        text5 = findViewById(R.id.textView5);
        text11 = findViewById(R.id.textView11);
        text12 = findViewById(R.id.textView12);
        text13 = findViewById(R.id.textView13);
        text14 = findViewById(R.id.textView14);
        text15 = findViewById(R.id.textView15);

        edit1  = findViewById(R.id.editText);
        edit2 = findViewById(R.id.editText2);


        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){

        }
        else{

        }




    }
}