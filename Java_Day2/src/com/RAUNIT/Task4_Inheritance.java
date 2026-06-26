package com.RAUNIT;

class Employee {
    String employeeName;
    int salary;

       Employee(String employeeName, int salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }
}

public class Task4_Inheritance extends Employee {
    String department;

   
    Task4_Inheritance(String employeeName, int salary, String department) {
        super(employeeName, salary);
        this.department = department;
    }

    void display() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Task4_Inheritance m = new Task4_Inheritance("Sohail", 50000, "IT");
        m.display();
    }
}
