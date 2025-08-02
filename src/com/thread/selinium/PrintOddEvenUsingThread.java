package com.thread.selinium;

public class PrintOddEvenUsingThread {
    public static void main(String[] args) {
        OddEvenUsingThread oddEvenUsingThread=new OddEvenUsingThread();
        Thread odd=new Thread(oddEvenUsingThread::oddNumber);
        Thread even=new Thread(oddEvenUsingThread::evenNumber);

        odd.start();
        even.start();

    }


}

class OddEvenUsingThread{
    private int number = 1;
    private final int MAX = 10;

    public synchronized  void evenNumber(){
        while(number<=MAX){
            if(number%2==0){
                System.out.println("Even: "+number);
                number++;
                notify();
            }
            else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void oddNumber(){
        while (number<=MAX){
            if(number%2!=0){
                System.out.println("Odd: "+number);
                number++;
                notify();
            }
            else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

}
