package com.raunit;

public class MethodsDemo {
	
	//default value
	public void siri() {
	 System.out.println("Hey How Are You");
	 
	}
	//Parameters With arguments method
	public static void add(int a, int b) {//Parameters
		System.out.println(a+b);
	}
	public static void main (String [] args) {
		MethodsDemo obj = new MethodsDemo();
		obj.siri();
		obj.siri();
		obj.add(12, 15);
		
	}
	
}

//1 default
//2.arguments with parameters