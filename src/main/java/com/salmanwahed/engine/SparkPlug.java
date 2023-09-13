package com.salmanwahed.engine;

import com.salmanwahed.util.Part;

public class SparkPlug extends Part {
    public void ignite(){
        this.addPart();
        System.out.println("Ignite Spark");
    }
}
