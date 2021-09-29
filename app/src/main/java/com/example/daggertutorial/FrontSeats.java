package com.example.daggertutorial;

import android.util.Log;

import javax.inject.Inject;

public class FrontSeats implements Seats {

    @Inject
    public FrontSeats(){

    }
    @Override
    public void quality() {
        Log.d("CAR","Quality is german leather seats with bold lining outside");
    }
}
