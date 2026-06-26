package com.Raunit;


public class ExceptionHandling {

    public static void main(String[] args) {

        int x = 10;
        int y = 0;

        try {
            int result = x / y;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("Program continues...");
    }
}