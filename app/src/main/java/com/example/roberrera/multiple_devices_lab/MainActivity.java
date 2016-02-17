package com.example.roberrera.multiple_devices_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mListview;
    ArrayAdapter<String> mListAdapter;
    ArrayList<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = new ArrayList<>();
        mList.add("One");
        mList.add("Two");
        mList.add("Three");
        mList.add("Four");
        mList.add("Five");
        mList.add("Six");

        mListview = (ListView) findViewById(R.id.listview);
        mListAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, mList);

        mListview.setAdapter(mListAdapter);

    }
}
