package com.RAUNIT;

//singleInheritance

class Parent {
    void house() {
        System.out.println("2BHK");
    }
}

public class Child extends Parent {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.house();
    }
}


