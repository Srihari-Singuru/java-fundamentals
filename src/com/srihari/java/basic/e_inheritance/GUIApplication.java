package com.srihari.java.basic.e_inheritance;

public class GUIApplication {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("Srihari");
        textBox1.setType("TextArea");

        var textBox2 = new TextBox();
        textBox2.setText("Srihari");
        textBox2.setType("TextArea");

        // Prints false if we do not update equals method properly
        System.out.println(textBox1.equals(textBox2));

        // They won't be same f we do not update hashCode method
        System.out.println(textBox1.hashCode());
        System.out.println(textBox2.hashCode());
    }
}
