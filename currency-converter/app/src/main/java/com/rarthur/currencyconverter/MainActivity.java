package com.rarthur.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View v) {
        EditText amountEditText = findViewById(R.id.editText);

        Log.d("Curreny Converter: ", amountEditText.getText().toString());

        Double amount = Double.parseDouble(amountEditText.getText().toString());

        Log.d("currency converter: ", amount.toString());
    }
}
