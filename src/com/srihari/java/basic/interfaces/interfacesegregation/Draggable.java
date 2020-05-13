package com.srihari.java.basic.interfaces.interfacesegregation;

public interface Draggable {
    // All dragging related declarations can come here
    // A change in the signature or method will not make all UIWidget's implementations compile again
    void drag();
}
