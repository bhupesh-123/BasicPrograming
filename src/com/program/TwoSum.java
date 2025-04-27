package com.program;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr=new int[]{3,23,7,9,14};
		int target=21;
	int[] res=	twoSum(arr, target);
	for(int r :res ){
		System.out.println(r);
	}
		/*Map<Integer, Integer> map = new HashMap<>();
		map.put(3, 10);
		map.put(1, 20);
		map.put(2, 30);
		map.put(16, 22);
		System.out.println(map+":"+map.containsKey(6)+":"+map.containsKey(3));
		System.out.println(":"+map.containsValue(10)+":"+map.get(1));*/
	}
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}

}
