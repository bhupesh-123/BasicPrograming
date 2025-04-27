package com.leetcode;

import java.util.Stack;

public class ValidParentheses {
    
    
    public static boolean isValidParenthesesUsingMap(String s) {
    	Stack<Character> stack=new Stack<>();
    	for(char c : s.toCharArray()){
    		if(c=='(' || c=='{' || c=='['){ 
    			stack.push(c);
    			}
    		else if(c==')' && !stack.empty() && stack.peek()=='(') {
    			stack.pop();
    		}
    		else if(c=='}' && !stack.empty() && stack.peek()=='{') {
    			stack.pop();
    		}
    		else if(c==']' && !stack.empty() && stack.peek()=='[') {
    			stack.pop();
    		}
    		else {
    			return false;
    		}
    		
    	}
    	return stack.empty();
    }

	public static void main(String[] args) {
		boolean isvalid=isValidParentheses("(){[]}{}");
		System.out.println(isvalid);
		boolean isvalidmap=isValidParenthesesUsingMap("(){[]}{}");
		System.out.println(isvalidmap);

	}
	
	public static boolean isValidParentheses(String s) {
		int count=0;
		for(char c : s.toCharArray()) {
			if(c=='(' || c=='{' || c=='['){
				count++;
			}
			else if(c==')' && count>0) {
				count--;
			}
			else if(c=='}' && count>0) {
				count--;
			}
			else if(c==']' && count>0) {
				count--;
			}
			else {
				return false;
			}
			
		}
		return count==0;
	}

}
