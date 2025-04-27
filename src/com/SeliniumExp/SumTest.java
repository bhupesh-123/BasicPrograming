package com.SeliniumExp;

public class SumTest {
    public static void main(String[] args) {
    //annonomius class
        Isum isum=new Isum() {
        @Override
        public int sum(int value1, int value2) {
            return value1+value2;
        }
    };
        int sum=isum.sum(2,3);
        System.out.println("sum of num: "+sum);
//lambda expession
        Isum isumLambda=((value1, value2) -> value1+value2);
        int sum2=isumLambda.sum(3,5);
        System.out.println("sum: "+sum2);

        // interface method referance
        Isum addSumRef=SumTest::addition;
        int addsum=addSumRef.sum(12,2);
        System.out.println("addsum: "+addsum);

        Isum addSumRefInt=Integer::sum;
        int addsumInt=addSumRefInt.sum(12,2);
        System.out.println("addsum: "+addsum);


    }
    public static  int addition(int value1,int value2){
        return value1+value2;
    }
}
