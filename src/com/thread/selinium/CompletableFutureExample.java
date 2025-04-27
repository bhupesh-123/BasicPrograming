package com.thread.selinium;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public  String getName(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      return  "Bhupesh";
    }
    public static void main(String[] args) throws InterruptedException {
        CompletableFutureExample completableFutureExample=new CompletableFutureExample();
        CompletableFuture.supplyAsync(() -> completableFutureExample.getName()).thenAccept(str -> System.out.println(str));
        System.out.println("done..");
        Thread.sleep(4000);
    }
}
