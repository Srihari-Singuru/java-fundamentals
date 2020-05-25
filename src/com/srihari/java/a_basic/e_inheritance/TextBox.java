package com.srihari.java.a_basic.e_inheritance;

import java.util.Objects;

public class TextBox extends UIControl {
    private String text = "";
    private String type = "";

    public TextBox() {
        super(true);
    }

    @Override
    public String toString() {
        return text;
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
}
