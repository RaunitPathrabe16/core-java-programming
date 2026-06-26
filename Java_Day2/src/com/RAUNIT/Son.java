package com.RAUNIT;

//MultilevelInheritance

class Grandfather {
    void plot() {
        System.out.println("7CR");
    }
}

class Father extends Grandfather {
    void car() {
        System.out.println("BMW");
    }
}

public class Son extends Father {
    public static void main(String[] args) {
        Son obj = new Son();
        obj.plot();
        obj.car();
    }
}

