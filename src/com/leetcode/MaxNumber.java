package com.leetcode;

public class MaxNumber {
public static void main(String[] args) {
	int[] arr={12,6,14,30,16}; 
	System.out.println(findsecondMaxNumber(arr));
}
// 12,6,14,30,16
public static int  findsecondMaxNumber(int[] array) {
	int max=Integer.MIN_VALUE;
	int secondMax=Integer.MIN_VALUE;
	for(int i=0;i<array.length;i++) {
		if(array[i]>max) {
			secondMax=max;
			max=array[i];
		}
		else if(array[i]>secondMax && max!=array[i]) {
			secondMax=array[i];
		}
		
	}
	return secondMax;
}
}
