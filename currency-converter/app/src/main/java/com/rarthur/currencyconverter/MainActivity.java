package com.rarthur.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View v) {
        EditText amountEditText = findViewById(R.id.editText);

        Double amount = Double.parseDouble(amountEditText.getText().toString());

        Double amountInPounds = amount * 0.76;

        Toast.makeText(MainActivity.this,"Pounds: " + String.format("%.2f", amountInPounds), Toast.LENGTH_SHORT).show();
    }
}
