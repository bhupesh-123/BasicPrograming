package com.program;

public class ReverseString {
    public static void main(String[] args) {
    }

    public static String reverseStringBuffer(String str){
        String revString=new StringBuffer(str).reverse().toString();
        return  revString;
    }
    public static String reverseStringUsingForLoop(String str) {
        String revString=null;
        for(int i=str.length()-1;i>=0;i--){
            revString +=str.charAt(i);
        }
        return  revString;
    }


    }
