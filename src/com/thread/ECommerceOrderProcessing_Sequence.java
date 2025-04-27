package com.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ECommerceOrderProcessing_Sequence {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(4);

        CompletableFuture<Void> orderProcessingFlow=CompletableFuture.runAsync(()->{
            simulateDelay(1000);
            System.out.println("Order validated.");
            // throw new RuntimeException("Order validation failed"); // Uncomment to simulate failure
        },executor).thenRunAsync(()->{
            simulateDelay(3000);
            System.out.println("Payment processed");
            // throw new RuntimeException("Payment process failed"); // Uncomment to simulate failure
        },executor).thenRunAsync(()->{
            simulateDelay(3000);
        System.out.println("Inventory updated");
            // throw new RuntimeException("Inventory updated failed"); // Uncomment to simulate failure
        },executor).thenRunAsync(()->{
            simulateDelay(2000);
            System.out.println("Confirmation email sent");
            // throw new RuntimeException("Confirmation email failed"); // Uncomment to simulate failure
        });
        try{
            orderProcessingFlow.join();
            System.out.println("order completed successfully.");
        }
        catch (CompletionException e){
            System.out.println("Getting Exception: "+e);
        }
        finally {
            executor.shutdown();
            System.out.println("Process completed!!!");
        }
    }

    public static  void simulateDelay(int millis) {
        try {
            Thread.sleep(millis);
        }
        catch (InterruptedException e){
            System.out.println("InterruptedException: "+e);
        }
    }
}
