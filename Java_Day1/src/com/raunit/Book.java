package com.raunit;

public class Book {

    String bookName;
    double price;

    Book(String bookName, double price) {
        this.bookName = bookName;
        this.price = price;
    }

    void displayBook() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Book b1 = new Book("Java Programming", 500);

        Book b2 = new Book("Python Basics", 450);

        Book b3 = new Book("C++ Guide", 400);

        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
    }
}
