package com.program;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String args[])

	{
System.out.println(15/10);
System.out.println(28%10);
	int a,i,count=0;

	Scanner s= new Scanner(System.in);

	System.out.println("Enter a number");

	a=s.nextInt();

	   while (a > 0) {

	i= a % 10;

	System.out.println(i);

	  a = a / 10;

	}

	   //System.out.println(a);

	}

}
