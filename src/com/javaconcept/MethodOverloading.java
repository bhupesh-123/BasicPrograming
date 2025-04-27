package com.javaconcept;

class CheckOverloading{
	public void test(Object obj) {
		 System.out.println("Object");
		}
	public void test(String str) {
		 System.out.println("String");
		}
	
}

public class MethodOverloading {
	public static void main(String[] args) {
		CheckOverloading check=new CheckOverloading();
		check.test(null);
	}
}
