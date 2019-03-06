package com.example.jsu.lab4a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class TipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);
    }

    public void calculateClicked(View v){
        EditText billEditText = findViewById(R.id.billEditText);
        EditText tipPercentageEditText = findViewById(R.id.tipEditText);
        EditText numberPeopleEditText = findViewById(R.id.numberOfPeopleEditText);

        if (billEditText.getText().length() > 0 && numberPeopleEditText.getText().length() > 0){

            double tipPercentage = 0.0;
            if (tipPercentageEditText.getText().length() > 0){
                tipPercentage = Double.valueOf(tipPercentageEditText.getText().toString());
            }
            else{
                tipPercentageEditText.setText("0");
            }
            double totalBill = Double.valueOf(billEditText.getText().toString());
            double numberPeople = Double.valueOf(numberPeopleEditText.getText().toString());
            double totalPerPerson = (totalBill + totalBill * tipPercentage / 100.0) / numberPeople;

            TextView resultTextView = findViewById(R.id.calculatedResultTextView);
            resultTextView.setText(NumberFormat.getCurrencyInstance().format(Math.round(totalPerPerson * 100.00) / 100.00));
        }
    }
}
