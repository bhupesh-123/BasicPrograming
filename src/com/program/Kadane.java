package com.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kadane {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(-2, -3, 4, -1, -2, 1, 5, -3));
	int res=	maxSubArraySum(list);
	System.out.println(res);	
	}
	
	static int maxSubArraySum(final List<Integer> A){
		 int maxSum=Integer.MIN_VALUE,maxEnding=0;
		for(int i=0;i<A.size();i++){
			maxEnding=maxEnding+A.get(i);
			if(maxEnding>maxSum){
				maxSum=maxEnding;
			}
			if(0>maxEnding){
				maxEnding=0;
			}
		}
		return maxSum;
	}
}
