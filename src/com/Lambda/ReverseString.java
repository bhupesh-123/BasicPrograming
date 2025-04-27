package com.Lambda;

public class ReverseString {
public static void main(String[] args) {
	MyInterface ref=(str)->{
		String result="";
		for(int i=str.length()-1;i>=0;i--){
			result=result+str.charAt(i);
		}
		return result;
	};
	System.out.println("result:"+ref.reverse("bhupesh"));
}
}
interface MyInterface{
	String reverse(String s);
}