package com.thread.engDigest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnFairLockExample_9{
    private final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        UnFairLockExample_9 unFairLockExample=new  UnFairLockExample_9();

        Runnable task= unFairLockExample::accessResorce;
        Thread thread1=new Thread(task,"Thread 1");
        Thread thread2=new Thread(task,"Thread 2");
        Thread thread3=new Thread(task,"Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

    }

    private void accessResorce() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+ "  acquired the lock. ");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
            System.out.println(Thread.currentThread().getName()+ "  release the lock. ");
        }
    }
}