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
        String miles = ((EditText) findViewById(R.id.milesEditText)).getText().toString();
        String kilometers = ((EditText) findViewById(R.id.kilometersEditText)).getText().toString();

        if (miles.isEmpty()){
            if (!kilometers.isEmpty()){
                Double m = Double.valueOf(kilometers) / 1.609344;
                ((EditText) findViewById(R.id.milesEditText)).setText(Double.toString(m));
            }
        }
        else{
            Double km = Double.valueOf(miles) * 1.609344;
            ((EditText) findViewById(R.id.kilometersEditText)).setText(Double.toString(km));
        }
    }
}
