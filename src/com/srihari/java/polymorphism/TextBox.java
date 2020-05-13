package com.srihari.java.polymorphism;

import java.util.Objects;

public class TextBox extends UIControl {
    private String text = "";
    private String type = "";

    public void setText(String text) {
        this.text = text;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void clear() {
        text = "";
        type = "";
    }

    @Override
    public void render() {
        System.out.println("Rendering TextBox");
    }

    @Override
    public String toString() {
        return "TextBox{" +
                "text='" + text + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextBox textBox = (TextBox) o;
        return text.equals(textBox.text) &&
                type.equals(textBox.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, type);
    }
}
