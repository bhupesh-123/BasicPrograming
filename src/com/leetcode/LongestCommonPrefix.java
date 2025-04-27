package com.leetcode;

public class LongestCommonPrefix {
public static void main(String[] args) {
	String[] strings = {"flower", "flow", "flight"};
    String result = longestCommonPrefix(strings);
    
    System.out.println("Longest Common Prefix: " + result);
   
}
public static String longestCommonPrefix(String[] array) {
	if(array==null || array.length==0) {
		return "";
	}
	String prefix=array[0];
	for(int i=1;i<array.length;i++) {
		int j=0;
		  // Compare characters until a mismatch is found or the end of the prefix is reached
		while(j<prefix.length() && j<array[i].length() && prefix.charAt(j)==array[i].charAt(j)) {
			j++;
		}
		// Update the common prefix based on the mismatch position
        prefix = prefix.substring(0, j);
	}
	return prefix;
}

}
