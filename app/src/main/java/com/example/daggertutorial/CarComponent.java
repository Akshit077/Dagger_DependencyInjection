package com.example.daggertutorial;

import dagger.Component;

@Component(modules = {WheelsModule.class,BackSeatModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

}
