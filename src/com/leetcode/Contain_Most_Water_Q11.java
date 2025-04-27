package com.leetcode;

public class Contain_Most_Water_Q11 {
	public static void main(String[] args) {
		int[] height={0,0,2,1,3,9};
		
		System.out.println(mostArea(height));
	}
public static int mostArea(int[] height){
	int maxArea=0;
	int leftPointer=0;
	int rightPointer=height.length-1;
	int leftHeight=0;
	int rightHeight=0;
	int minHeight=0;
	while(leftPointer<rightPointer){
		leftHeight=height[leftPointer];
		rightHeight=height[rightPointer];
		minHeight=Math.min(leftHeight, rightHeight);
		
		maxArea=Math.max(maxArea, (minHeight*(rightPointer-leftPointer)));
		if(leftHeight<rightHeight){
			leftPointer++;
		}
		else{
			rightPointer--;
		}
	}
	return maxArea;
}
}
