package com.example.widgetsradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rgroup = findViewById(R.id.rgroup);
        rgroup.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        RadioButton checkedBtn = group.findViewById(checkedId);
                        Toast.makeText(MainActivity.this,
                                String.format("[%s]が選択されました", checkedBtn.getText()),
                                Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
}
