package com.RAUNIT;
class Vehicle {
    String brand;

    
    Vehicle(String brand) {
        this.brand = brand;
    }
}

public class Task2_Inheritance extends Vehicle {
    String model;

   
    Task2_Inheritance(String brand, String model) {
        super(brand);
        this.model = model;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        Task2_Inheritance c = new Task2_Inheritance("Tata", "Nexon");
        c.display();
    }
}
