package com.thread;

public class ThreadInterrupt extends  Thread {
    @Override
    public void run() {
        System.out.println("Thread running");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Getting Exception");
        }
    }

    public static void main(String[] args) {
        ThreadInterrupt threadInterrupt=new ThreadInterrupt();
        threadInterrupt.start();
        threadInterrupt.interrupt();
    }
}
