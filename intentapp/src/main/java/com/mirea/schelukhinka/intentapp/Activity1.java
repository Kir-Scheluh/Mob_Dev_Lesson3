package com.mirea.schelukhinka.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("time", getDateString());
        intent.putExtra("sqrNumber", 729);

        startActivity(intent);
    }

    public String getDateString() {
        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        @SuppressLint("SimpleDateFormat") final SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date(dateInMillis));
    }




}