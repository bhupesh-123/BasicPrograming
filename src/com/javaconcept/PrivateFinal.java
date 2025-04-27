package com.javaconcept;

class A{
	private void method1(){
		System.out.println("Method class A");
}
	final void method2(){
		System.out.println("Method class A");
}

class B extends A{
	private void method1(){
		System.out.println("Method class A");
}
	//final method can not override
	/*final void method2(){
		System.out.println("Method class A");
}*/

	
	}
}
public class PrivateFinal {

}
