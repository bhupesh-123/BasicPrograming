package com.thread.engDigest;

public class BankAccount {

    int balance=100;
    public synchronized void withDraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attemting to withdraw "+amount);
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + "proceeding with withdraw");
            try {
                Thread.sleep(3000);
                balance -=balance;
                System.out.println(Thread.currentThread().getName()+"completed withdraw. Remaining balance is "+balance);

            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        else {
            System.out.println(Thread.currentThread().getName()+"insufficient balance.");
        }
    }
}
