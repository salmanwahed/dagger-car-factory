package com.salmanwahed.engine;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {AutoModule.class, IgnitionModule.class})
public interface EngineComponent {
    Ignition ignition();
    Auto auto();
}
