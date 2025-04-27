package com.program;

public class CheckWord {
	public static boolean wordCurrect(String str) {
		if (Character.isUpperCase(str.charAt(0)) && Character.isUpperCase(str.charAt(1))) {
			for (int i = 2; i < str.length(); i++) {
				if (Character.isLowerCase(str.charAt(i))) {
					return false;
				}
			}
		}
		else {
			for (int i = 1; i < str.length(); i++) {
				if (Character.isUpperCase(str.charAt(i))) {
					return false;
				}
			}
		}
		return true;
		}
public static void main(String[] args) {
	
	boolean result=CheckWord.wordCurrect("aHU");
	System.out.println(result);
}
}
