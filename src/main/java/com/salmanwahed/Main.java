package com.salmanwahed;

import com.salmanwahed.engine.Auto;
import com.salmanwahed.engine.DaggerEngineComponent;
import com.salmanwahed.engine.EngineComponent;
import com.salmanwahed.engine.Ignition;
import com.salmanwahed.frame.DaggerFrameComponent;
import com.salmanwahed.frame.Frame;
import com.salmanwahed.frame.FrameComponent;

public class Main {
    public static void main(String[] args) {
        EngineComponent engineComponent = DaggerEngineComponent.create();
        Auto auto = engineComponent.auto();
        Ignition ignition = engineComponent.ignition();
        auto.init();
        ignition.init();
        FrameComponent frameComponent = DaggerFrameComponent.create();
        Frame frame = frameComponent.frame();
        frame.addFrame();

    }
}