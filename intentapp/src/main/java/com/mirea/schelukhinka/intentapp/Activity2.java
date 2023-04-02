package com.mirea.schelukhinka.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView tv = findViewById(R.id.textView);

        Bundle arguments = getIntent().getExtras();
        if(arguments!=null){
            String time = arguments.get("time").toString();
            String number = arguments.get("sqrNumber").toString();
            String message = "КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ " + number + ", а текущее время " + time;
            tv.setText(message);
        }
    }
}