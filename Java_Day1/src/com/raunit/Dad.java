package com.raunit;
//single inheritance

  public class Dad {
	public void House() {
		System.out.println("1CR") ;
	}
		
		public void Car() {
			System.out.println("VolksWagen Virtus");
		}
		
	}
	
public	 class Child extends Dad {
		
		public static void main(String[] args) {
			Child Varun = new Child();
			Varun.House();
			Varun.Car();
			

	 }

}
