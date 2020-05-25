package com.srihari.java.basic.f_interfaces.c_interfacesegregation;

public interface UIWidget
        extends Draggable, Sizeable { // Interfaces are segregated
    void render();
}
