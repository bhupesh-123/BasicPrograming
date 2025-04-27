package com.leetcode;

import java.util.HashMap;

public class TwoSum_Q1 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 7 };
		sumTwo(arr, 9);
		sumTwo2(arr, 9);
	}

	public static int[] sumTwo2(int arr[], int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int remender = target - num;
			if (map.containsKey(remender)) {
				int index = map.get(remender);
				if (index == i)
					continue;
				System.out.println("sumTwo2: "+i + ":" + index);

				return new int[] { i, index };
			}
		}
		return new int[] { -1, -1 };
	}

	public static int[] sumTwo(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {

					System.out.println("sumTwo: "+i + ":" + j);
					return new int[] { i, j};
				}
			}
		}
		return new int[] { arr[0], arr[0] };

	}

}
