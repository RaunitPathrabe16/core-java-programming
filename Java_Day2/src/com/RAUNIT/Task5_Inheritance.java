package com.RAUNIT;

class Shape {

    Shape() {
        System.out.println("Shape Constructor");
    }
}

public class Task5_Inheritance extends Shape {

    Task5_Inheritance() {
        System.out.println("Rectangle Constructor");
    }

    public static void main(String[] args) {
        Task5_Inheritance r = new Task5_Inheritance();
    }
}