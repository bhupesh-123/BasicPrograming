package com.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddInArray {
	// Input: A = [1,2,0,0], K = 34
	// Output: [1,2,3,4]
	// Explanation: 1200 + 34 = 1234
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 1 };
		System.out.println(addToArray(arr, 12));
		List<Integer> res = new ArrayList<Integer>();
		
		/*res.add(0, 7);
		res.add(0, 8);
		res.add(0, 6);
		System.out.println(res);
		List<Integer> res1 = new ArrayList<Integer>();
		res1.add(2);
		res1.add(5);
		System.out.println(res1);*/
	}

	public static List<Integer> addToArray(int[] A, int K) {

		List<Integer> res = new ArrayList<Integer>();
		int i = A.length - 1;
		int carry = 0;

		while (i >= 0 || K > 0) {
			int n1 = i >= 0 ? A[i] : 0;
			int n2 = K % 10;

			int sum = n1 + n2 + carry;
			res.add(0, sum % 10);
			carry = sum / 10;

			i--;
			K = K/10;
		}

		if (carry != 0) {
			res.add(0, carry);
		}

		return res;

	}
	
public List<Integer> addToArrayForm(int[] A, int K) {
        
        int n=A.length;
        int cur=K;
        
        List<Integer> ans=new ArrayList<Integer>();
        int i=n;
        while(--i>=0 || cur>0)
        {
            if(i>=0)
                cur=cur+A[i];
            ans.add(cur%10);
            cur=cur/10;
        }
        
        Collections.reverse(ans);
        return ans;
        
    }
}
