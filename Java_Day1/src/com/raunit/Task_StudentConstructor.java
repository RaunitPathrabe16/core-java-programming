package com.raunit;

public class Task_StudentConstructor {

    String name;
    int age;

    Task_StudentConstructor(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Task_StudentConstructor s1 = new Task_StudentConstructor("Sohail", 25);
        Task_StudentConstructor s2 = new Task_StudentConstructor("Ali", 20);
    }
}
