package com.example.daggertutorial;

import android.util.Log;

import javax.inject.Inject;

public class BackSeats implements Seats {

    @Inject
    public BackSeats(){

    }

    @Override
    public void quality() {
        Log.d("CAR","Quality of back seats is alloy wheels lubricant design");
    }
}
