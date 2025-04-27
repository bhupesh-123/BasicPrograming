package com.leetcode;

public class MoveNumbers {

	public static void main(String[] args) {
		int[] arr={12,6,0,14,30,0,16}; 
		moveZeros(arr);
	}
	// 12,6,0,14,0,30,16
	public static void moveZeros(int[] arr) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0 && arr[j]==0 ) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
			if(arr[j]!=0) {
				j++;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}
	
}
