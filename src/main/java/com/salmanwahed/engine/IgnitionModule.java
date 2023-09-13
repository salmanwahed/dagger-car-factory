package com.salmanwahed.engine;


import dagger.Module;
import dagger.Provides;

@Module
public class IgnitionModule {
    @Provides
    Cylinder provideCylinder(){
       return new Cylinder();
    }
    @Provides
    SparkPlug provideSparkPlug(){
        return new SparkPlug();
    }
}
