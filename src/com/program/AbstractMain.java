package com.program;
 abstract class A{
	 public void MethodA(){
		 System.out.println("Method A");
	 }
	 abstract public void MethodB();
	 abstract public void MethodC();

 }
abstract class B extends A{
	  public void MethodB(){
		  System.out.println("method b in class B");
	  };
}
public class AbstractMain extends B {
public static void main(String[] args) {
	A a=new AbstractMain();
	a.MethodA();
	a.MethodB();
	a.MethodC();
}

@Override
public void MethodC() {
	System.out.println("in abstract");
}


}
