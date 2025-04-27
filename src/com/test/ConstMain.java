package com.test;

public class ConstMain {
public static void main(String[] args) {
	B b=new B(5);
}
}
abstract class A{
	A(){
		System.out.println("class A");
	}
	public void method1(int b,int c){
		System.out.println("addition "+(b+c));
	}
}
class B extends A{
	
	B(int a){
		super();
		
		System.out.println("class B"+a);
	}
	/*public int A(){
		return 1;
	}
	public void A(){
		
	}*/
}