package com.example.daggertutorial;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    @Inject
    public Remote()
    {

    }

    void setListener(Car car){
        Log.d("DAGGER","Remote vehicle");
    }
}
