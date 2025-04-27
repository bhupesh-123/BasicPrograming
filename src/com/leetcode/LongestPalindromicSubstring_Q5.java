package com.leetcode;

public class LongestPalindromicSubstring_Q5 {
	public static void main(String[] args) {
	String value=	LongestPalindromicSubstring_Q5.longestPalindrome1("abad");
	String palString=longestPalindrom("bhubbbs");
	System.out.println(palString);
	System.out.println(value);
	}
	
	public static String longestPalindrome1(String s) {
		int maxPalinLength = 0;
		String longestPalindrome = null;
		int length = s.length();
		// check all possible sub strings
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				int len = j - i;
				String curr = s.substring(i, j + 1);
				if (isPalindrome(curr)) {
					if (len > maxPalinLength) {
						longestPalindrome = curr;
						maxPalinLength = len;
					}
				}
			}
		}
		return longestPalindrome;
	}

	public static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
	public static String longestPalindrom(String s) {
		int stringLength=s.length();
		String palindromString=null;
		int maxPalLength=0;
		for(int i=0;i<stringLength;i++) {
			for(int j=i+1;j<stringLength;j++) {
				int length=j-i;
				String CurrSubString=s.substring(i, j+1);
				if(isPalindrom(CurrSubString)) {
					if(maxPalLength<length) {
					palindromString=CurrSubString;
					maxPalLength=length;
				   }
				}
			}
		}
		return palindromString;
	}
	
	public static boolean isPalindrom(String s) {
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}
