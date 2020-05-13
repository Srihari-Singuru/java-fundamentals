package com.srihari.java.basic.interfaces.interfacesegregation;

public interface UIWidget
        extends Draggable, Sizeable { // Interfaces are segregated
    void render();
}
