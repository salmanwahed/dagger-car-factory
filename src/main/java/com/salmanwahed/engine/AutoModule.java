package com.salmanwahed.engine;

import dagger.Module;
import dagger.Provides;

@Module
public class AutoModule {
    @Provides
    CrankShaft provideCrankShaft(){
        return new CrankShaft();
    }
    @Provides
    Piston providePiston(){
        return new Piston();
    }
}
