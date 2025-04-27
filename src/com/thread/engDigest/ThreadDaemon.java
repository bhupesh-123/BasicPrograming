package com.thread.engDigest;

public class ThreadDaemon extends Thread {


    public static void main(String[] args) {
        ThreadDaemon thread= new ThreadDaemon();
        thread.setDaemon(true);
        thread.start();
        System.out.println("main done");

    }

    @Override
    public void run() {
        while (true){
            System.out.println("Hello world");
        }
    }
}
