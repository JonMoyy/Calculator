package com.example.calculatorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class CurrencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currency);

        Intent intent = getIntent();
    }


        Spinner spinnerCurrency = findViewById(R.id.Currency1);

//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Currencies, android.R.layout.simple_spinner_item);
//
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
//
//        spinnerCurrency.setAdapter(adapter);





}