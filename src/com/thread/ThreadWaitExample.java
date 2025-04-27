package com.thread;

public class ThreadWaitExample {
    public static void main(String[] args) {
        final Object lock = new Object();
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread1: waiting for lock...");
                try {
                    lock.wait();
                    System.out.println("thread1: resume after notify");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread2: acquired lock, notifying...");
                lock.notify();
                System.out.println("Thread2: notified thread1 and exiting..");
            }
        });
        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}
