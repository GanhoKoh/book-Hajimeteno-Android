package com.example.widgetsseekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seek = findViewById(R.id.seek);
        seek.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                        @Override
                        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                            Toast.makeText(MainActivity.this,
                                    String.format(Locale.JAPAN, "現在値:%d", progress),
                                    Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onStartTrackingTouch(SeekBar seekBar) { }

                        @Override
                        public void onStopTrackingTouch(SeekBar seekBar) { }
                    }
        );
    }
}
