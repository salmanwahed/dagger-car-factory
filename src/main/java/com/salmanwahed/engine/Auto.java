package com.salmanwahed.engine;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Auto {
    CrankShaft crankShaft;
    Piston piston;
@   Inject
    public Auto(CrankShaft crankShaft, Piston piston) {
        this.crankShaft = crankShaft;
        this.piston = piston;
    }

    public void init(){
        crankShaft.start();
        piston.runPiston();
    }
}
