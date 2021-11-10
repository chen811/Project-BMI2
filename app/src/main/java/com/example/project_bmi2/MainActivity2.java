package com.example.project_bmi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView message = (TextView)findViewById(R.id.textView3);
        TextView message2 = (TextView)findViewById(R.id.textView4);
        Intent intent = this.getIntent();
        float BMI = intent.getFloatExtra("ATOB",0);
        message.setText("你的BMI指數為" + BMI);
        if (BMI > 18.5 && BMI < 24){
            message2.setText("檢測結果為  正常");
        }
        else {
            message2.setText("檢測結果為  異常");
        }
    }

    public void runLogin(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}