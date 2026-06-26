package com.raunit;

import java.util.Scanner ;


public class Task1 {
	
	
	public static void main(String [] agrs) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		 int num = sc.nextInt();
		 
		 if (num %2 == 0) {
			 System.out.println(num + " is Even ");
		 } else {
			 System.out.println(num + " is Odd ");
		 }
		 sc.close();
		 
		 
		 	 
		 }
	}
	
