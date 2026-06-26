package com.Raunit;

public class Day3Task_Polymorphism {

    private int employeeId;
    private String employeeName;
    private double salary;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Day3Task_Polymorphism e = new Day3Task_Polymorphism();

        e.setEmployeeId(101);
        e.setEmployeeName("Sohail");
        e.setSalary(50000);

        System.out.println("Employee ID: " + e.getEmployeeId());
        System.out.println("Employee Name: " + e.getEmployeeName());
        System.out.println("Salary: " + e.getSalary());
    }
}