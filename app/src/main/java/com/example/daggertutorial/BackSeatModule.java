package com.example.daggertutorial;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class BackSeatModule {

    @Binds
     abstract Seats provideSeats(BackSeats backSeats);
}
