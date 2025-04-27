package com.thread.engDigest;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExplained_8 {
   private int balance=100;

    private final Lock lock=new ReentrantLock();
    public static void main(String[] args) {
        Runnable task=new Runnable() {
            LockExplained_8 lockExplained=new LockExplained_8();

            @Override
            public void run() {
                lockExplained.withDraw(100);
            }
        };
        Thread t1=new Thread(task,"Thread 1");
        Thread t2=new Thread(task,"Thread 2");

        t1.start();
        t2.start();

    }

    public  void withDraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw "+amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    System.out.println(Thread.currentThread().getName() + " proceeding with withdraw");
                    try {
                        Thread.sleep(5000);
                        balance -=balance;
                        System.out.println(Thread.currentThread().getName()+" completed withdraw. Remaining balance is "+balance);

                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    finally {
                        lock.unlock();
                    }

                }
                else {
                    System.out.println(Thread.currentThread().getName()+" insufficient balance.");
                }

            }
            else {
                System.out.println("Could not aquired the lock will try later.");
            }
        }
        catch (Exception e){

        }

       }
}

