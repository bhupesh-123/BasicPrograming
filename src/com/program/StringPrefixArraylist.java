package com.program;

import java.util.ArrayList;
     
public class StringPrefixArraylist {
	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		str.add("bhupesh");
		str.add("bhupema");
		str.add("bhu");
		longestCommonPrefix(str);
		}
	
	
	 public static String longestCommonPrefix(ArrayList<String> A) {
	        int len = Integer.MAX_VALUE;
	 for (String s : A) {
	 if (s.length() < len) {
	 len = s.length();
	 }
	 }
	 StringBuilder prefix = new StringBuilder();
	 for (int i = 0; i < len; i ++) {
	 char c = A.get(0).charAt(i);
	 for (int j = 1; j < A.size(); j ++) {
	 char n = A.get(j).charAt(i);
	 if (c != n) {
	 return prefix.toString();
	 }
	 }
	 prefix.append(c);
	 }
	 return prefix.toString();
	    }
}
