package com.raunit;

public class SquareCalculator {

    public int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        SquareCalculator sc = new SquareCalculator();

        int result = sc.square(5);

        System.out.println("Square = " + result);
    }
}