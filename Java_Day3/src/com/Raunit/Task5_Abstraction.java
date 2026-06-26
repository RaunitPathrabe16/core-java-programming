package com.Raunit;

abstract class Payment {

    abstract void pay();
}

class UPIPayment extends Payment {

    
    void pay() {
        System.out.println("UPI Payment Successful");
    }
}

public class Task5_Abstraction {

    public static void main(String[] args) {
        Payment p = new UPIPayment();
        p.pay();
    }
}
