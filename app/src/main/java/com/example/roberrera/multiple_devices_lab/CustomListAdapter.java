package com.example.roberrera.multiple_devices_lab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rob on 2/17/16.
 */
public class CustomListAdapter extends ArrayAdapter<Number>{

    ArrayList<Number> mNumbers;

    public CustomListAdapter(Context context, ArrayList<Number> numbers) {
        super(context, -1);
        mNumbers = numbers;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Number currentNumber = mNumbers.get(position);

        Context context = getContext();
        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View numberLayoutView = inflater.inflate(R.layout.item_list_layout, parent, false);

        TextView numberTextView = (TextView) numberLayoutView.findViewById(R.id.textview_list);
        numberTextView.setText(currentNumber.getmNumber() );

        return numberLayoutView;
    }

    @Override
    public int getCount() {
        return mNumbers.size();
    }

}
