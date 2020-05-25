package com.srihari.java.a_basic;

import java.util.Scanner;

/**
 * If a given number is divisible by 5, print "Fizz"
 * If a given number is divisible by 3, print "Buzz"
 * If a given number is divisible by both 5 and 3, print "FizzBuzz"
 * If a given number is not divisible by both 5 and 3, print the given number
 */

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();
        scanner.close();

        if(number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        } else if(number % 5 == 0){
            System.out.println("Fizz");
        } else if(number % 3 == 0){
            System.out.println("Buzz");
        } else{
            System.out.println(number);
        }
    }
}