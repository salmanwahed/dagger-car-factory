package com.salmanwahed.engine;

import com.salmanwahed.util.Part;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Ignition extends Part {
    SparkPlug sparkPlug;
    Cylinder cylinder;

    @Inject
    public Ignition(SparkPlug sparkPlug, Cylinder cylinder) {
        this.sparkPlug = sparkPlug;
        this.cylinder = cylinder;
    }

    public void init(){
        cylinder.fillCylinder();
        sparkPlug.ignite();
    }

}
