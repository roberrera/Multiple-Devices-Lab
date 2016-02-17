package com.example.roberrera.multiple_devices_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListview;
    private ArrayList<Number> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListview = (ListView) findViewById(R.id.listview);
        mList = new ArrayList<>();
        Number number = Number.getInstance();

        mList.add(new Number("One"));
        mList.add(new Number("Two"));
        mList.add(new Number("Three"));
        mList.add(new Number("Four"));
        mList.add(new Number("Five"));
        mList.add(new Number("Six"));

        CustomListAdapter listAdapter = new CustomListAdapter(this, mList);
        mListview.setAdapter(listAdapter);

    }
}
