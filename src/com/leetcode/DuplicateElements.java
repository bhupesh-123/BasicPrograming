package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateElements {
    public static void main(String[] args) {
      int[] arr=new int[]{4,3,2,7,8,2,3,1};
      List<Integer> result=DuplicateElements.findAllDuplicate(arr);
        System.out.println(result);
    }
    public static List<Integer> findAllDuplicate(int[] nums){
        List <Integer>ans = new ArrayList<Integer>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int index =  Math.abs(nums[i]) - 1;
            if(nums[index]<0)
            {
                ans.add (index+1);
            }
            else
            {
                nums[index] = nums[index] * -1;
            }
        }
        return ans;
    }

    public static List<Integer> findAllDuplicates(int[] nums) {
        Map<Integer,Long> map= IntStream.of(nums).boxed().collect(Collectors.groupingBy(e->e,Collectors.counting()));
        return map.entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).sorted().collect(Collectors.toList());
    }

    }
