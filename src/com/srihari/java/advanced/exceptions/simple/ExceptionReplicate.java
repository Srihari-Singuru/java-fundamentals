package com.srihari.java.advanced.exceptions.simple;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionReplicate {
    public static void show() {
        try {
            var reader = new FileReader("dummy.txt");
            var value = reader.read();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("Couldn't read value");
        }
    }
}
