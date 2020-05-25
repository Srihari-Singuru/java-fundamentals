package com.srihari.java.a_basic.d_polymorphism;

public abstract class UIControl {
    private boolean isEnabled = true;

    public abstract void render();

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
