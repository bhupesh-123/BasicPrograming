package com.test;

public class InterfaceMain implements AI {

	@Override
	public void method1() {
		System.out.println("method1 in main");
	}
	public static void main(String[] args) {
		InterfaceMain im=new InterfaceMain();
		im.defaultmethod();
		im.method1();
		AI.staticMethod();
	}

}
interface AI{
	public static final int a=10;
	public void method1();
	public default void defaultmethod(){
		System.out.println("default method");
	}
	public static void staticMethod(){
		System.out.println("static method");
	}
}