package com.raunit;

import java.util.Scanner;

public class Task_NumberChecker {

    public void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        Task_NumberChecker nc = new Task_NumberChecker();
        nc.checkEvenOdd(num);

        sc.close();
    }
}
