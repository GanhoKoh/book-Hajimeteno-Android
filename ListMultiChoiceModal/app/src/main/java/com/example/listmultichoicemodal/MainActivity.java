package com.example.listmultichoicemodal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> data = new ArrayList<>();
        data.add("胡椒");
        data.add("ターメリック");
        data.add("コリアンダー");
        data.add("生姜");
        data.add("ニンニク");
        data.add("サフラン");

        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_checked, data);
        list = findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {

            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return true;
            }

            @Override
            public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked) {

            }

            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode mode) {
                StringBuilder msg = new StringBuilder("選択したのは。");

                for(int i = 1; i < list.getChildCount(); i++) {
                    CheckedTextView checked = (CheckedTextView) list.getChildAt(i);
                    if(checked.isChecked()) {
                        msg.append(checked.getText()).append(",");
                    }
                }

                Toast.makeText(MainActivity.this,
                        msg.subSequence(0, msg.length() -1),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
