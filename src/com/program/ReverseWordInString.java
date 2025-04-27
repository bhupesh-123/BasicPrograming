package com.program;

import java.util.Stack;

public class ReverseWordInString {
public static void main(String[] args) {
	reverse("bhupesh kumar vish");
}
public static void reverse(String str){
	Stack<Character> stack=new Stack<Character>();
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)!=' '){
			stack.push(str.charAt(i));
		}
		else{
			while (!stack.empty()) {
				System.out.print(stack.pop());
			}
			System.out.print(" ");
		}
	}
	
	
	while (!stack.empty()) {
		System.out.print(stack.pop());
	}
}
}
