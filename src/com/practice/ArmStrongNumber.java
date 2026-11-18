package com.practice;

public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println(isNumberIsArmStrong(153));
    }

    public static boolean isNumberIsArmStrong(int number){
        int result=0;
        int receivedNumber=number;
        //153
        while (0<receivedNumber){
            int r=receivedNumber%10;
            result=result+r*r*r;
            receivedNumber=receivedNumber/10;
        }
        if(result==number) {
            return true;
        }
        else {
            return false;
        }
    }
}
