package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    String param1 = "0";
    String param2 = "0";
    String mathExpression = "";
    TextView textView;
    TextView textView1;
    private boolean isExpEntered = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView1);

        textView1.setText("");
        textView.setText("0");

    }

    public void onClickAC(View v){
        textView.setText("0");
        textView1.setText("");
    }

    public void onClickPlus(View v){
        isExpEntered = true;
        param1 = textView.getText().toString();
        mathExpression = "+";
        if(!param1.isEmpty()) {
            textView1.setText(param1 + mathExpression);
            textView.setText(param1);
        }
    }

    public void onClickMinus(View v){
        isExpEntered = true;
        param1 = textView.getText().toString();
        mathExpression = "-";
        if(!param1.isEmpty()) {
            textView1.setText(param1 + mathExpression);
            textView.setText(param1);
        }
    }

    public void onClickMultiply(View v){
        isExpEntered = true;
        param1 = textView.getText().toString();
        mathExpression = "*";
        if(!param1.isEmpty()) {
            textView1.setText(param1 + mathExpression);
            textView.setText(param1);
        }
    }

    public void onClickDivide(View v){
        isExpEntered = true;
        param1 = textView.getText().toString();
        mathExpression = "/";
        if(!param1.isEmpty()) {
            textView1.setText(param1 + mathExpression);
            textView.setText(param1);
        }
    }

    public void onClickEqual(View v){
        isExpEntered = true;
        param2 = textView.getText().toString();
        double p1 = Double.parseDouble(param1);
        double p2 = Double.parseDouble(param2);
        double r = calculateResult(p1, p2, mathExpression);
        String result = r+"";
        Log.i("MainActivity", "result: "+result);
        String[] rr =  result.split("\\.");
        Log.i("MainActivity", "rr length: "+rr.length);
        for(String s: rr){
            Log.i("MainActivity", "rr array: "+s);
        }
        Log.i("MainActivity", rr[1].charAt(0)+"");
        String decimal = rr[1].charAt(0)+"";
        Log.i("MainActivity", "decimal: "+rr[1].charAt(0)+"");
        if(decimal.equals("0")){
            textView1.setText(param1 + " " + mathExpression + " " + param2 + " =");
            textView.setText(rr[0]);
        }else {
            DecimalFormat df = new DecimalFormat("0.00");
            df.setMaximumFractionDigits(4);
            textView1.setText(param1 + " " + mathExpression + " " + param2 + " =");

            if (r != 0) {
                textView.setText(df.format(r));
            }
        }

        param1 = "0";
        param2 = "0";
        mathExpression = "";
    }

    public double calculateResult(double p1, double p2, String expression){
        double result = 0;
        if(expression == "+"){
            result = p1 + p2;
        }
        if(expression == "-"){
            result = p1 - p2;
        }
        if(expression == "*"){
            result = p1 * p2;
        }
        if(expression == "/"){
            result = p1 / p2;
        }

        return  result;
    }

    public void onClickNumber1(View v){
        if(isExpEntered){
            isExpEntered = false;
            textView.setText(1 + "");
        }
        else {
            if(textView.getText().toString().isEmpty()) {
                textView.setText(1 + "");
            }
            else {
                String s = textView.getText().toString();
                if(!s.equals("0"))
                    textView.setText(s+1);
                else
                    textView.setText("1");
            }
        }
        if(mathExpression.isEmpty()){
           textView1.setText("");
        }
        Log.i("MainActivity","clicked 1");
    }
    public void onClickNumber2(View v){

        if(isExpEntered){
            isExpEntered = false;
            textView.setText(2 + "");

        }
        else {
            if(textView.getText().toString().isEmpty()) {
                textView.setText(2 + "");
            }
            else {
                String s = textView.getText().toString();
                if(!s.equals("0"))
                    textView.setText(s+2);
                else
                    textView.setText("2");
            }
        }
        if(mathExpression.isEmpty()){
            textView1.setText("");
        }
        Log.i("MainActivity","clicked 2");
    }
    public void onClickNumber3(View v){

        if(isExpEntered){
            isExpEntered = false;
            textView.setText(3 + "");
        }
        else {
            if(textView.getText().toString().isEmpty()) {
                textView.setText(3 + "");
            }
            else {
                String s = textView.getText().toString();
                if(!s.equals("0"))
                    textView.setText(s+3);
                else
                    textView.setText("3");
            }
        }
        Log.i("MainActivity","clicked 3");
    }

    public void onClickNumber4(View v){
        if(isExpEntered){
            isExpEntered = false;
            textView.setText(4+"");
        }
        else {
            if(textView.getText().toString().isEmpty()) {
                textView.setText(4+"");
            }
            else {
                String s = textView.getText().toString();
                if(!s.equals("0"))
                    textView.setText(s+4);
                else
                    textView.setText("4");
            }
        }
        if(mathExpression.isEmpty()){
            textView1.setText("");
        }
        Log.i("MainActivity","clicked 4");
    }

    public void onClickNumber5(View v){
        if(isExpEntered){
            isExpEntered = false;
            textView.setText(5 + "");
        }
        else {
            if(textView.getText().toString().isEmpty()) {
                textView.setText(5 + "");
            }
            else {
                String s = textView.getText().toString();
                if(!s.equals("0"))
                    textView.setText(s+5);
                else
                    textView.setText("5");
            }
        }
        if(mathExpression.isEmpty()){
            textView1.setText("");
        }
        Log.i("MainActivity","clicked 5");
    }

    public void onClickNumber6(View v){
        if(isExpEntered){
            isExpEntered = false;
            textView.setText(6 + "");
        }
        else {
            if(textView.getText().toString().isEmpty()) {
                textView.setText(6 + "");
            }
            else {
                String s = textView.getText().toString();
                if(!s.equals("0"))
                    textView.setText(s+6);
                else
                    textView.setText("6");
            }
        }
        if(mathExpression.isEmpty()){
            textView1.setText("");
        }
        Log.i("MainActivity","clicked 6");
    }

    public void onClickNumber7(View v){
        if(isExpEntered){
            isExpEntered = false;
            textView.setText(7 + "");
        }
        else {
            if(textView.getText().toString().isEmpty()) {
                textView.setText(7 + "");
            }
            else {
                String s = textView.getText().toString();
                if(!s.equals("0"))
                    textView.setText(s+7);
                else
                    textView.setText("7");
            }
        }
        if(mathExpression.isEmpty()){
            textView1.setText("");
        }
        Log.i("MainActivity","clicked 7");
    }

    public void onClickNumber8(View v){
        if(isExpEntered){
            isExpEntered = false;
            textView.setText(8 + "");
        }
        else {
            if(textView.getText().toString().isEmpty()) {
                textView.setText(8 + "");
            }
            else {
                String s = textView.getText().toString();
                if(!s.equals("0"))
                    textView.setText(s+8);
                else
                    textView.setText("8");
            }
        }
        if(mathExpression.isEmpty()){
            textView1.setText("");
        }
        Log.i("MainActivity","clicked 8");
    }

    public void onClickNumber9(View v){
        if(isExpEntered){
            isExpEntered = false;
            textView.setText(9 + "");
        }
        else {
            if(textView.getText().toString().isEmpty()) {
                textView.setText(9 + "");
            }
            else {
                String s = textView.getText().toString();
                if(!s.equals("0"))
                    textView.setText(s+9);
                else
                    textView.setText("9");
            }
        }
        if(mathExpression.isEmpty()){
            textView1.setText("");
        }
        Log.i("MainActivity","clicked 9");
    }

    public void onClickNumber0(View v){
        if(isExpEntered){
            isExpEntered = false;
            textView.setText(0 + "");
        }
        else {
            if(textView.getText().toString().isEmpty()) {
                textView.setText(0 + "");
            }
            else {
                String s = textView.getText().toString();
                if(!s.equals("0"))
                    textView.setText(s+"0");
                else
                    textView.setText("0");
            }
        }
        if(mathExpression.isEmpty()){
            textView1.setText("");
        }
        Log.i("MainActivity","clicked 0");
    }
}