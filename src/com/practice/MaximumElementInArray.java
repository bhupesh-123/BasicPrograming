package com.practice;

import java.util.HashMap;
import java.util.Map;

public class MaximumElementInArray {
    public static void main(String[] args) {
        int[] elements = {10, 20, 5, 20, 30, 40};
        findMaximumElement(elements);

    }
   public static void findMaximumElement(int[] elements){
       Map<Integer,Integer> map=new HashMap<>();
        for(int value:elements){
            if(map.containsKey(value)){
                map.put(value,map.get(value)+1);
            }
            else {
                map.put(value,1);
            }
        }
       int maxCount = 0;
       int maxValue = elements[0];
       for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(maxCount < m.getValue()){
                maxCount = m.getValue();
                maxValue = m.getKey();


            }
   }
       System.out.println(maxValue+" Maximum Repeated Value: " + maxCount);
   }
}
