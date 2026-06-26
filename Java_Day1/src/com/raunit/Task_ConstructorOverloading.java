package com.raunit;

public class Task_ConstructorOverloading {

    String name;
    double salary;

    Task_ConstructorOverloading() {
        System.out.println("Default Employee");
        System.out.println();
    }

    Task_ConstructorOverloading(String name) {
        this.name = name;

        System.out.println("Employee Name: " + name);
        System.out.println();
    }

    Task_ConstructorOverloading(String name, double salary) {
        this.name = name;
        this.salary = salary;

        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Task_ConstructorOverloading e1 = new Task_ConstructorOverloading();

        Task_ConstructorOverloading e2 = new Task_ConstructorOverloading("Sohail");

        Task_ConstructorOverloading e3 = new Task_ConstructorOverloading("Sohail", 50000);
    }
}
