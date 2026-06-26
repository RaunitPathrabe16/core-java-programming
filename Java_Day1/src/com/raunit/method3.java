package com.raunit;

public class method3 {
	
	public void siri() {
		 System.out.println("Hey How Are You");
		 
		}
	//Parameters with arguments method
	static void add(int a, int b) {//parameters
	}
	//method with return type
	static int square(int n) {
		return n*n;
		
	}
	
	//basic program even and odd with methods
	public void checkEvenOdd(int n) {
		if(n % 2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
			
		}
	}
	public static void main(String[] args) {
		MethodDemo obj = new MethodsDemo();
		obj.siri();
		obj.siri();
		obj.add(12, 15); //arguments
		System.out.println()
	}
}
