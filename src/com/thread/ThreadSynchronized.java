package com.thread;

public class ThreadSynchronized {
    public static void main(String[] args) {
        Counter counter=new Counter();
        MyThread t1=new MyThread(counter);
        MyThread t2=new MyThread(counter);

        t1.start();
        t2.start();

        System.out.println(counter.getCounter());

    }
}
