package com.thread.engDigest;

public class MyThreadCounter extends Thread{

    private CounterModel counter;

    public MyThreadCounter(CounterModel counter){
        this.counter=counter;
    }

    @Override
    public void run() {
    for(int i=0;i<100000;i++){
    counter.increment();
}
    }
}
