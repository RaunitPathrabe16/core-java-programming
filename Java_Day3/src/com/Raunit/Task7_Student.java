package com.Raunit;

public class Task7_Student {

    private int rollNo;
    private String name;
    private String course;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public static void main(String[] args) {
        Task7_Student s = new Task7_Student();

        s.setRollNo(101);
        s.setName("Sohail");
        s.setCourse("Java");

        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Course: " + s.getCourse());
    }
}
