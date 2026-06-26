package com.raunit;

public class Task_LargestNumber {

    public int findLargest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Task_LargestNumber ln = new Task_LargestNumber();

        int result = ln.findLargest(10, 20);

        System.out.println("Largest Number is " + result);
    }
}