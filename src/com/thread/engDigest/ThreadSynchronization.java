package com.thread.engDigest;

public class ThreadSynchronization {
    public static void main(String[] args) {
        CounterModel counter=new CounterModel();
        MyThreadCounter threadCounter1=new MyThreadCounter(counter);
        MyThreadCounter threadCounter2=new MyThreadCounter(counter);

        threadCounter1.start();
        threadCounter2.start();

        try {
            threadCounter1.join();
            threadCounter2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getCount());

    }
}
