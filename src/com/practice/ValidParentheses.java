package com.practice;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
       String st="{}[";
        System.out.println(isValidParentheses(st));
    }

    public static  boolean isValidParentheses(String str){
        if(str==null || str.isEmpty()){
            return  true;
        }
        char[] chars=str.toCharArray();
        Stack<Character> st=new Stack<>();
        for (char ch:chars){
            if(ch=='{' || ch=='[' || ch=='('){
                st.push(ch);
            }
            else{
                if(st.empty()){
                    return false;
                }
                char top=st.peek();
                if((top == '{' && ch == '}') || (top == '[' && ch == ']') || (top == '(' && ch == ')')){
                    st.pop();
                }
                else {
                    return  false;
                }
            }
        }
        return st.isEmpty();
    }
}
