package com.example.roberrera.multiple_devices_lab;

import android.widget.ImageView;

import java.io.Serializable;

/**
 * Created by Rob on 2/17/16.
 */
public class Number implements Serializable {

    private static final long serialVersionUID = 7526472295622776147L;

    public static Number instance;
    private String mNumber;

    public Number(String number){
        mNumber = number;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }

    public static Number getInstance() {
        return instance;
    }
}
