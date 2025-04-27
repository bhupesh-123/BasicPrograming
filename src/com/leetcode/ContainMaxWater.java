package com.leetcode;

public class ContainMaxWater {
	public static void main(String[] args) {
		int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea=maximumWater(heights);
        System.out.println(maxArea);
	}

	public static int maximumWater(int[] arr) {
		int leftPointer = 0;
		int rightPointer = arr.length - 1;
		int maxArea = 0;
		int leftHeight = 0;
		int rightHeight = 0;
		int minHeight = 0;
		for (int i = 0; i < arr.length; i++) {
			while (leftPointer < rightPointer) {
				leftHeight = arr[leftPointer];
				rightHeight = arr[rightPointer];
				minHeight = Math.min(leftHeight, rightHeight);
				maxArea = Math.max(maxArea, minHeight * (rightPointer - leftPointer));
				if (leftHeight < rightHeight) {
					leftPointer++;
				} else {
					rightPointer--;
				}

			}

		}
		return maxArea;
	}
	
}
