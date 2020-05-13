package com.srihari.java.basic.polymorphism;

public class GUIApplication {
    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(), new CheckBox()}; // We can add UIControl also if we do not make it abstract

        for(var control : controls)
            control.render();           // Classic example of Polymorphism
    }
}
