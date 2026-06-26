package com.RAUNIT;


class Parent {
    void house() {
        System.out.println("2BHK");
    }
}

class Sister extends Parent {
}

public class Brother extends Parent {
    public static void main(String[] args) {
        Brother b = new Brother();
        Sister s = new Sister();

        b.house();
        s.house();
    }
}
