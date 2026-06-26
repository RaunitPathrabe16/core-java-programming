package com.raunit;

class Dadaji {

    public void plot() {
        System.out.println("7CR");
    }
}

class Father extends Dadaji {

    public void car() {
        System.out.println("BMW");
    }
}

public class Son extends Father {

    public void bike() {
        System.out.println("Kawasaki Ninja");
    }

    public static void main(String[] args) {

        Son rahul = new Son();

        rahul.plot();  // Method from Dadaji
        rahul.car();   // Method from Father
        rahul.bike();  // Method from Son
    }
}