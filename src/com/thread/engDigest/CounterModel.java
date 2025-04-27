package com.thread.engDigest;

public class CounterModel {
    private int count=0;

    public   void increment(){
        synchronized (this){
        count++;
        }
    }

    public int getCount(){
        return  count;
    }
}
