package com.RAUNIT;

class College {
    String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }
}

public class BonusTask extends College {
    String departmentName;

    BonusTask(String collegeName, String departmentName) {
        super(collegeName);
        this.departmentName = departmentName;
    }

    void display() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Department Name: " + departmentName);
    }

    public static void main(String[] args) {
        BonusTask d = new BonusTask("KDK College", "Computer Science");
        d.display();
    }
}