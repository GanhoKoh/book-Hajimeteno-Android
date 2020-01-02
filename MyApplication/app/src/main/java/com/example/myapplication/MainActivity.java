package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView txt = findViewById(R.id.txtResult);
                        txt.setText(new Date().toString());
                        Toast toast = Toast.makeText(MainActivity.this, new Date().toString(), Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
        );
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        TextView txtResult = findViewById(R.id.txtResult);
        outState.putString("txtResult", txtResult.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        TextView txtResult = findViewById(R.id.txtResult);
        txtResult.setText(savedInstanceState.getString("txtResult"));
    }
}
