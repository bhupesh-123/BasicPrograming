package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmptyStringFromArray {
    public static void main(String[] args) {
        String[] arr={"bhupesh","","Kumar","abc"};
        removeEmptyString(arr);
        String[] arr1 = {"apple", "", "  ", null, "banana", "cherry", "   "};
        removeEmptyAndNullString(arr1);

    }
    public static void removeEmptyString(String[] str){
        String result = Arrays.stream(str).filter(s->!s.equalsIgnoreCase("")).collect(Collectors.joining(","));
        System.out.println(result);
        List<String> list = Arrays.stream(str).filter(s->!s.equalsIgnoreCase("")).collect(Collectors.toList());
        System.out.println(list);
        String[] arrResult = Arrays.stream(str).filter(s->!s.isEmpty()).toArray(String[]::new);
        System.out.println(Arrays.toString(arrResult));
    }
    public static void removeEmptyAndNullString(String[] arr) {
        String[] result = Arrays.stream(arr)
                .filter(s -> s != null && !s.trim().isEmpty())  // remove null, empty, and whitespace
                .toArray(String[]::new);
        System.out.println(Arrays.toString(result));
    }
    }
