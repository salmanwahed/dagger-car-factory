package com.salmanwahed.frame;

import dagger.Module;
import dagger.Provides;

@Module
public class FrameModule {
    @Provides
    Chassis provideChassis() {
        return new Chassis();
    }

    @Provides
    Paint providePaint(){
        return new Paint();
    }
}
