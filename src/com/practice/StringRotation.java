package com.practice;

import java.util.stream.IntStream;

public class StringRotation {
    public static void main(String[] args) {
      boolean result1=isStringRotation("IndiaVsEngland","EnglandIndiaVs");
        System.out.println(result1);

        boolean result2=isStringRotation("IndiaVsAustralia","AustraliaVsIndia");
        System.out.println(result2);

        boolean result3=isStringRotationWithContain("IndiaVsAustralia","AustraliaVsIndia");
        System.out.println(result3);

        isStringRotationUsingStream("IndiaVsAustralia","AustraliaVsIndia");
    }

    public static boolean isStringRotation(String original,String rotation){
        if (original.length()!=rotation.length()){
            return false;
        }
        String concatenated =original+original;
        if(concatenated.indexOf(rotation)!=-1){
            return  true;
        }
        return  false;
    }
    public static boolean isStringRotationWithContain(String original,String rotation) {
        if (original.length()!=rotation.length()){
            return false;
        }
        return  (original+original).contains(rotation);
    }

        public static void isStringRotationUsingStream(String original,String rotation) {
            boolean anyMatch = IntStream.range(0, original.length()).mapToObj(i -> original.substring(i) + original.substring(0, i)).anyMatch(rotation::equals);
            System.out.println(anyMatch);
        }

    }
