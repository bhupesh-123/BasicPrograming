package com.structure;

public class Recursion {
public static void main(String[] args) {
	//printNumber(5);
	//System.out.println(factorial(5));
	towerOfHanoi(3,'A','C', 'B');
}

public static int printNumber(int number) {
	if(number==0) {
		return 0;
	}
	else {
		System.out.println(number);
		return printNumber(number-1);
	}
}

 public static int factorial(int number) {
	if(number==1) {
		return 1;
	}
	else {
		return number*factorial(number-1);
	}
}
 static void towerOfHanoi(int n, char from_rod, char to_rod, char helper_rod)
 {
     if (n == 1)
     {
         System.out.println("Take disk 1 from rod " +  from_rod + " to rod " + to_rod);
         return;
     }
     towerOfHanoi(n-1, from_rod, helper_rod, to_rod);
     System.out.println("Take disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
     towerOfHanoi(n-1, helper_rod, to_rod, from_rod);
 }
}
