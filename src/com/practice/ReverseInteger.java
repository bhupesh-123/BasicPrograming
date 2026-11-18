package com.practice;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("12/10:  "+12/10+"     12%10:  "+12%10);
        System.out.println("123446/10:  "+123446/10+"     123446%10:  "+123446%10);
        System.out.println("12344/10:  "+12344/10+"     123446%10:  "+12344%10);

        int result=reverseGivenInteger(123446);
        System.out.println("result: "+result);

    }
    public static int reverseGivenInteger(int n){
        // 123446
        int reverse = 0;
        while (0<n){
            reverse=reverse*10+n%10;
            n=n/10;
        }
        return  reverse;
    }
}
