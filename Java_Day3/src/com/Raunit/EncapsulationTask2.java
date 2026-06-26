package com.Raunit;
import java.util.Scanner ;

class Book {
	private String bookName;
	private int bookId;
	private String authorName;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
}

public class EncapsulationTask2 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Book b = new Book();
		
		b.setBookName("Story of Billionare Raunit Pathrabe");
		b.setBookId(16);
		b.setAuthorName("Arundhati Roy");
		
		System.out.println("Name: " + b.getBookName());
		System.out.println("Id: " + b.getBookId());
		System.out.println("authorName: " + b.getAuthorName());
		
		sc.close();
		
	}
	
}
