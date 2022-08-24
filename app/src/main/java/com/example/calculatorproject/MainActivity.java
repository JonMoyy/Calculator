package com.example.calculatorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*
    sources:
    https://www.tutorialkart.com/kotlin-android/kotlin-android-button-background-color/
    https://www.geeksforgeeks.org/math-pow-method-in-java-with-example/


     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findAdd(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Integer.parseInt((number1ET.getText().toString()));
        double num2 = Integer.parseInt((number2ET.getText().toString()));
        double sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

    public void findSub(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Integer.parseInt((number1ET.getText().toString()));
        double num2 = Integer.parseInt((number2ET.getText().toString()));
        double sum = num1 - num2;

        numberSumTV.setText("" + sum);
    }

    public void findDiv(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Integer.parseInt((number1ET.getText().toString()));
        double num2 = Integer.parseInt((number2ET.getText().toString()));
        double sum = num1 / num2;

        numberSumTV.setText("" + sum);
    }

    public void findMulti(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Integer.parseInt((number1ET.getText().toString()));
        double num2 = Integer.parseInt((number2ET.getText().toString()));
        double sum = num1 * num2;

        numberSumTV.setText("" + sum);
    }


    public void findPower(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Integer.parseInt((number1ET.getText().toString()));
        double num2 = Integer.parseInt((number2ET.getText().toString()));
        double sum = Math.pow(num1, num2);

        numberSumTV.setText("" + sum);
    }

    public void switchScreen(View view){

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }



}