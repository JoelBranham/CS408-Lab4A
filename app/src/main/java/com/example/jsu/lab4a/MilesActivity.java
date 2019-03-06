package com.example.jsu.lab4a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MilesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miles);
    }

    public void calculateClicked(View v){
        EditText milesEditText = findViewById(R.id.milesEditText);
        EditText kilometersEditText = findViewById(R.id.kilometersEditText);

        String miles = milesEditText.getText().toString();
        String kilometers = kilometersEditText.getText().toString();

        if (miles.isEmpty()){
            if (!kilometers.isEmpty()){
                Double m = Double.valueOf(kilometers) * .62137;
                milesEditText.setText(Double.toString(Math.round(m * 100.00) / 100.00));
            }
        }
        else{
            Double km = Double.valueOf(miles) / .62137;
            kilometersEditText.setText(Double.toString(Math.round(km * 100.00) / 100.00));
        }
    }
}
