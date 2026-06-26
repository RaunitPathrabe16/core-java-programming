package com.raunit;

import java.util.Scanner;

public class Day1_Task4Marks {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter marks: ");
	        int marks = sc.nextInt();

	        if (marks >= 90) {
	            System.out.println("A Grade");
	        } else if (marks >= 75 && marks <= 89) {
	            System.out.println("B Grade");
	        } else if (marks >= 50 && marks <= 74) {
	            System.out.println("C Grade");
	        } else {
	            System.out.println("Fail");
	        }

	        sc.close();
	    }
	}

