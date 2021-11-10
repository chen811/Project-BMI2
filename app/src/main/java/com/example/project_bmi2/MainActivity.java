package com.example.project_bmi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void runLogin(View view) {
        EditText feildheight = findViewById(R.id.editTextNumber);
        EditText feildweigth = findViewById(R.id.editTextNumber2);

        float Height = Float.parseFloat(feildheight.getText().toString())/100;
        float Weight = Float.parseFloat(feildweigth.getText().toString());
        float BMI = Weight / (Height*Height);

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("ATOB",BMI);
        startActivity(intent);
    }
}