package com.srihari.java.basic.cleancode.clean;

import java.util.Scanner;

public class CustomConsole {
    private static final Scanner scanner = new Scanner(System.in);

    /* This is static because, we have only one console to work with
       We won't have mutiple consoles per object */
    public static double readNumber(String prompt){
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
