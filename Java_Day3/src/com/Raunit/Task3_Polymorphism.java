package com.Raunit;

//MethodOverloading

public class Task3_Polymorphism {

    public void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    public void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    public static void main(String[] args) {
        Task3_Polymorphism a = new Task3_Polymorphism();

        a.area(5);
        a.area(10, 20);
    }
}
