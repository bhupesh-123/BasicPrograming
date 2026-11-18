package com.practice;

public class PrintOddEvenNumber {
    private  int number=1;
    private  int Max=10;
    public static void main(String[] args) {
        PrintOddEvenNumber printOddEvenNumber=new PrintOddEvenNumber();
        Thread odd=new Thread(printOddEvenNumber::printOddNumber,"Odd Number");
        Thread even=new Thread(printOddEvenNumber::printEvenNumber,"Even Number");
        odd.start();
        even.start();

    }
    public  synchronized  void  printOddNumber(){
        while (number<=Max){
            while (number%2==0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(number<=Max){
                System.out.println(number+" : "+Thread.currentThread().getName());
                number++;
                notify();
            }
        }
    }
    public  synchronized  void  printEvenNumber(){
        while (number<=Max){
            while (number%2!=0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(number<=Max){
                System.out.println(number+" : "+Thread.currentThread().getName());
                number++;
                notify();
            }
        }
    }
}
