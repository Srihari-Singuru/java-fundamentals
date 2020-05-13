package com.srihari.java.interfaces.interfacesegregation;

public class Dragger {
    public void drag(UIWidget widget) { // Eventhough we segregated, since UIWidget implements all those interfaces we are good
        widget.drag();
        System.out.println("Dragged");
    }
}
