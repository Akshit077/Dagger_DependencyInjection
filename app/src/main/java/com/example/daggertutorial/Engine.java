package com.example.daggertutorial;


public class Engine {

    private Motor motor;
    private IgnitionPump pump;

    public Engine(Motor motor,IgnitionPump pump){
        this.motor=motor;
        this.pump=pump;
    }
}
