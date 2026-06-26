package com.Raunit;

interface ATM1 {
    void window();
    void show();
}

class Axis1 implements ATM1 {

    public void window() {
        System.out.println("Money Withdraw Successfully");
    }

    public void show() {
        System.out.println("Hello");
    }
}

public class InterfacesDemo {

    public static void main(String[] args) {

        Axis1 a = new Axis1();
        a.window();
        a.show();
    }
}