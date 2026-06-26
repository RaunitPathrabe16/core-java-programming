package com.Raunit;


import java.util.LinkedHashSet;

public class HashSetDemo {
   public static void main(String [] args) {
	 LinkedHashSet<String> students = new LinkedHashSet<String>();
	   students.add("Rahul");
	   students.add("tejas");
	   students.add("virat");
	   students.add("vir");
	   
	   System.out.println(students);
   }
}
