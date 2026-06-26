package com.Raunit;

//MethodOverriding

class Employee {

    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {

   
    void work() {
        System.out.println("Developer is writing code");
    }
}

public class Task4_Polymorphism {

    public static void main(String[] args) {
        Employee emp = new Developer(); 
        emp.work(); 
    }
}