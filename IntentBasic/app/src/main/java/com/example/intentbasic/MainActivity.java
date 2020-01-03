package com.example.intentbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LIFE", "MainAc-onCreate");
    }

    @Override
    protected void onStart() {
        Log.d("LIFE", "MainAc-onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("LIFE", "MainAc-onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("LIFE", "MainAc-onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("LIFE", "MainAc-onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("LIFE", "MainAc-onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("LIFE", "MainAc-onRestart");
        super.onRestart();
    }

    public void btnSend_onClick(View view) {
        Intent intent = new Intent(MainActivity.this, SubActivity.class);

        startActivity(intent);
    }
}
