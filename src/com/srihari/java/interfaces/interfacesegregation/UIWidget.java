package com.srihari.java.interfaces.interfacesegregation;

public interface UIWidget
        extends Draggable, Sizeable { // Interfaces are segregated
    void render();
}
