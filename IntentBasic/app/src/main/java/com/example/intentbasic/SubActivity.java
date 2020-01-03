package com.example.intentbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Log.d("LIFE","SubAc-onCreate");
    }

    @Override
    protected void onStart() {
        Log.d("LIFE", "SubAc-onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("LIFE", "SubAc-onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("LIFE", "SubAc-onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("LIFE", "SubAc-onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("LIFE", "SubAc-onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("LIFE", "SubAc-onRestart");
        super.onRestart();
    }

    public void btnBack_onClick(View view) {
        finish();
    }
}
