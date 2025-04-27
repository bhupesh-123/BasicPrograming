package com.thread.engDigest;

public class World extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
