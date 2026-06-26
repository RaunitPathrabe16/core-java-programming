package com.raunit;

import java.util.Scanner;

public class Day1_Task2SumofN {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		
		System.out.println("sum from 1 to " + n + "=" + sum);
		
		sc.close();
			 
	}

}