package com.thread;

public class PrintNumberUsingThreeThread {
    int number=1;
    int MAX=20;
    public static void main(String[] args) {
        PrintNumberUsingThreeThread printNumber=new PrintNumberUsingThreeThread();
        Thread thread1=new Thread(()-> printNumber.printNumbers(0),"thread 1");
        Thread thread2=new Thread(()-> printNumber.printNumbers(1),"thread 2");
        Thread thread3=new Thread(()-> printNumber.printNumbers(2),"thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

    }

    public synchronized void  printNumbers(int threadId){
        while (number<=MAX){
    while ((number-1)%3!=threadId && number<=MAX){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    if(number<=MAX){
        System.out.println(number+" : "+Thread.currentThread().getName());
        number++;
        notifyAll();
    }
}
     notifyAll();
    }
}
