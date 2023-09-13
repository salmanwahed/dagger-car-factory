package com.salmanwahed.frame;

import dagger.Component;

@Component(modules = {FrameModule.class})
public interface FrameComponent {
    Frame frame();
}
