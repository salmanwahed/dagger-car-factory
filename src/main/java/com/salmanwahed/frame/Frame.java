package com.salmanwahed.frame;

import javax.inject.Inject;

public class Frame {

    private Chassis chassis;
    private Paint paint;

    @Inject
    public Frame(Chassis chassis, Paint paint) {
        this.chassis = chassis;
        this.paint = paint;
    }

    public void addFrame(){
        chassis.addChassis();
        paint.doPaint();
        System.out.println("Frame Added.");
    }

}
