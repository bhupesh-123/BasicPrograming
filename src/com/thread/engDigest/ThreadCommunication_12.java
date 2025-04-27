package com.thread.engDigest;


class SharedResource{
public int data;
private boolean hasData;

public  synchronized void produce(int value){
        while (hasData){
                try {
               wait();
                }
                 catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                }
        }
        data=value;
        hasData=true;
    System.out.println("produce: "+value);
    notify();
}

public  synchronized int consume(){
    while (!hasData){
        try {
         wait();
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    hasData=false;
    System.out.println("consumed: "+data);
    notify();
  return  data;
}
        }
public class ThreadCommunication_12 {
    public static void main(String[] args) {
        SharedResource sharedResource=new SharedResource();
        Thread produceThread=new Thread(new Producer(sharedResource));
        Thread consumeThread=new Thread(new Consumer(sharedResource));

        produceThread.start();
        consumeThread.start();

    }
}

class Producer implements Runnable{
    private  SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
   for (int i=0;i<10;i++){
    resource.produce(i);
       }
    }
}

class Consumer implements  Runnable{
    private  SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
           int value= resource.consume();
        }
    }
}
