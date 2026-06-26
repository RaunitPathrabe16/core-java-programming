package com.Raunit;

abstract class ATM {
	abstract void withdraw();

}

class HDFC extends ATM {
	void withdraw() {
		System.out.println("Money Withdraw successfully");
	}
}

public class AbstractionDemo {
	public static void main(String[] args) {
		ATM a = new HDFC();
		a.withdraw();
	}

}
