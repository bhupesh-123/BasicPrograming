package com.thread;

import java.util.concurrent.CompletableFuture;

public class BasicCompletableFuture1 {
    public static void main(String[] args) {
        CompletableFuture<String> future=CompletableFuture.supplyAsync(()->{
            try {
         Thread.sleep(2000);
            }
             catch (InterruptedException e) {
                e.printStackTrace();
            }
            return  "hello";
        });
        future.thenApply(res->res.toUpperCase()).thenAccept(result->{System.out.println("Result: "+result);});
        future.join();

        CompletableFuture.supplyAsync(()->"Hello").thenApply(str->str+"  World").thenAccept(System.out::println);
    }
}
