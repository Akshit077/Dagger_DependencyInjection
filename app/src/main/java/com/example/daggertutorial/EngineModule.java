package com.example.daggertutorial;

import dagger.Module;
import dagger.Provides;

@Module
public class EngineModule {

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
