package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNumber1(View v){
        Log.i("MainActivity","clicked 1");
    }
    public void onClickNumber2(View v){
        Log.i("MainActivity","clicked 2");
    }
    public void onClickNumber3(View v){
        Log.i("MainActivity","clicked 3");
    }
    public void onClickNumber4(View v){
        Log.i("MainActivity","clicked 4");
    }
}