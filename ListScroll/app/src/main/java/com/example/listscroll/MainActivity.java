package com.example.listscroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter<String> adapter;

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
        data.add("オレガノ");
        data.add("クミン");
        data.add("クローブ");
        data.add("シナモン");
        data.add("ナツメグ");
        data.add("セージ");
        data.add("タイム");
        data.add("パクチー");
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnScrollListener(new AbsListView.OnScrollListener() {

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                if(firstVisibleItem + visibleItemCount + 3 > totalItemCount) {
                    adapter.add("新　胡椒");
                    adapter.add("新　ターメリック");
                    adapter.add("新　コリアンダー");
                }
            }

            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) { }
        });
    }
}
