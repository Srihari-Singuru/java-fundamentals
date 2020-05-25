package com.srihari.java.b_advanced.a_exceptions.c_withresources;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionReplicate {
    public static void show() {

        // Should implement AutoClosable interface
        try (
            var reader = new FileReader("dummy1.txt");
            var writer = new FileWriter("dummy2.txt");
        ) {
            var value = reader.read();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
