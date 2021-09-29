package com.example.daggertutorial;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private Engine engine;
    private Wheels wheels;
    private Seats seats;

    @Inject
    public Car(Engine engine,Wheels wheels,Seats seats){
        this.engine=engine;
        this.wheels=wheels;
        this.seats=seats;
    }

    @Inject
    void addRemote(Remote remote){
        remote.setListener(this);
    }


    void drive()
    {
        seats.quality();
        Log.d("DAGGER","driving...");
    }
}
