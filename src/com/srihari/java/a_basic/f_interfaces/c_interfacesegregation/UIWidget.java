package com.srihari.java.a_basic.f_interfaces.c_interfacesegregation;

public interface UIWidget
        extends Draggable, Sizeable { // Interfaces are segregated
    void render();
}
