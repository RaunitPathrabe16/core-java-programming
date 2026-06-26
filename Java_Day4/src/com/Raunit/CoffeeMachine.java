package com.Raunit;

class BoilWater extends Thread{
	public void run( ) {
		System.out.println("Heating Milk");
		
		
	}
}

class GrindCoffee extends Thread {
	public void run() {
		System.out.println("Grinding Coffee");
	}
}


public class CoffeeMachine {
    public static void main(String[] args) {
    	BoilWater t1 = new BoilWater();
    	GrindCoffee t2 =  new GrindCoffee();
    	CoffeeMachine t3 = new CoffeeMachine();
    	
    	t1.start();
    	t2.start();
    	t3.start();
    	
    	
    	
    }

	private void start() {
		// TODO Auto-generated method stub
		
	}
}


