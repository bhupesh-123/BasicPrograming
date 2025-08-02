package com.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringLengthCompartor implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }

    public static void main(String[] args) {
        List<String> list= Arrays.asList("Bhupesh","Kumar","Vishwakarma");
        list.sort(new StringLengthCompartor());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
