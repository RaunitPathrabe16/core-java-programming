package com.RAUNIT;

class Animal {

    Animal() {
        System.out.println("Animal Created");
    }
}

public class Task3_Inheritance extends Animal {

    Task3_Inheritance() {
        System.out.println("Dog Created");
    }

    public static void main(String[] args) {
        Task3_Inheritance d = new Task3_Inheritance();
    }
}
