package com.RAUNIT;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class Task1_Inheritance extends Person {
    String course;

    Task1_Inheritance(String name, String course) {
        super(name);
        this.course = course;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Task1_Inheritance s = new Task1_Inheritance("Sohail", "Java");
        s.display();
    }
}
