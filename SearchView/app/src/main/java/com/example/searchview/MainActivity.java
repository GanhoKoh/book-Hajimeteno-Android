package com.example.searchview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> data = new ArrayList<>();
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

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, data);

        final  ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setTextFilterEnabled(true);

        SearchView search = findViewById(R.id.search);
        search.setOnQueryTextListener(
                new SearchView.OnQueryTextListener() {

                    @Override
                    public boolean onQueryTextChange(String newText) {
                        if(newText == null || newText.equals("")) {
                            list.clearTextFilter();
                        } else {
                            list.setFilterText(newText);
                        }
                        return false;
                    }

                    @Override
                    public boolean onQueryTextSubmit(String query) {
                        return false;
                    }
                }
        );
    }
}
