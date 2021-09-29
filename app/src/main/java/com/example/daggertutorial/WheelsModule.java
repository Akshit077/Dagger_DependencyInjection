package com.example.daggertutorial;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims(){
        return new Rims();
    }
    @Provides
    Tires provideTires(){
        Tires tires=new Tires();
        tires.inflate();
        return tires;
    }
    @Provides
    Wheels provideWheels(Rims rims,Tires tires){
        return new Wheels(rims,tires);
    }

    @Provides
    Motor provideMotor(){
        Motor motor=new Motor();
        motor.checkSound();
        return motor;
    }

    @Provides
    IgnitionPump provideIgnitionPump(){
        IgnitionPump ignitionPump=new IgnitionPump();
        ignitionPump.testPump();
        return ignitionPump;
    }

    @Provides
    Engine provideEngine(Motor motor,IgnitionPump ignitionPump){
        return new Engine(motor,ignitionPump);
    }
}
