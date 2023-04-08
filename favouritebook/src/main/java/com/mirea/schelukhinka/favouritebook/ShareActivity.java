package com.mirea.schelukhinka.favouritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        editText = findViewById(R.id.inputBook);
    }

    public void onClickButton(View v){
        String bookName = editText.getText().toString();
        if(bookName!=null){
            Intent data = new Intent();
            data.putExtra(MainActivity.KEY, bookName);
            setResult(RESULT_OK, data);
            finish();
        }
        else {
            setResult(RESULT_CANCELED);
            finish();
        }
    }
}