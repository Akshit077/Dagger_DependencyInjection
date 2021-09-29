package com.example.daggertutorial;

import dagger.Module;
import dagger.Provides;

@Module
public class FrontSeatModule {

    @Provides
    static Seats provideSeats(FrontSeats frontSeats){
        return frontSeats;
    }
}
