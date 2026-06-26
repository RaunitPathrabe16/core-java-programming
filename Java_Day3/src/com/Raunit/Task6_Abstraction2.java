package com.Raunit;

abstract class Appliance {

    abstract void start();
}

class WashingMachine extends Appliance {

   
    void start() {
        System.out.println("Washing Machine Started");
    }
}

public class Task6_Abstraction2 {

    public static void main(String[] args) {
        Appliance a = new WashingMachine();
        a.start();
    }
}
