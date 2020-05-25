package com.srihari.java.advanced.a_exceptions.b_withfinally;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Looking bit ugly
 */
public class ExceptionReplicate {
    private static FileReader reader = null;

    public static void show() {
        try {
            reader = new FileReader("dummy.txt");
            var value = reader.read();
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("Couldn't read value");
        }
        finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
