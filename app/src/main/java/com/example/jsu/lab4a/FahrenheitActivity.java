package com.example.jsu.lab4a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FahrenheitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit);
    }

    public void calculateClicked(View v){
        String fahrenheit = ((EditText) findViewById(R.id.fahrenheitEditText)).getText().toString();
        String celsius = ((EditText) findViewById(R.id.celsiusEditText)).getText().toString();

        if (fahrenheit.isEmpty()){
            if (!celsius.isEmpty()){
                double c = Double.valueOf(celsius);
                double f = ((c * 9 / 5) + 32);
                ((EditText) findViewById(R.id.fahrenheitEditText)).setText(Double.toString(f));
            }
        }
        else{
            double f = Double.valueOf(fahrenheit);
            double c = ((f - 32) * 5 / 9);
            ((EditText) findViewById(R.id.celsiusEditText)).setText(Double.toString(c));
        }

    }


}
