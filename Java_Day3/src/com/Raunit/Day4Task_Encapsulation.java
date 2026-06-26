package com.Raunit;

import java.util.Scanner;

public class Day4Task_Encapsulation {

    private int bookId;
    private String bookName;
    private String authorName;

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Day4Task_Encapsulation b = new Day4Task_Encapsulation();

        System.out.print("Enter Book ID: ");
        b.setBookId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        b.setBookName(sc.nextLine());

        System.out.print("Enter Author Name: ");
        b.setAuthorName(sc.nextLine());

        System.out.println("\nBook ID: " + b.getBookId());
        System.out.println("Book Name: " + b.getBookName());
        System.out.println("Author Name: " + b.getAuthorName());

        sc.close();
    }
}
