package com.example.intentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        String txtName = intent.getStringExtra("txtName");
        Toast.makeText(this,
                String.format("%sさんこんにちは", txtName),
                Toast.LENGTH_SHORT).show();
    }


    public void btnBack(View view) {
        finish();
    }
}
