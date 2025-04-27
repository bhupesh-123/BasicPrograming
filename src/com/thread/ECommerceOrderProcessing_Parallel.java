package com.thread;

import java.util.concurrent.CompletableFuture;

public class ECommerceOrderProcessing_Parallel {
    public static void main(String[] args) {
        CompletableFuture<Void> orderValidation=CompletableFuture.runAsync(()-> {
         simulateDelay(3000);
            System.out.println("Order validated.");
        });

        CompletableFuture<Void> paymentProccessing=CompletableFuture.runAsync(()->{
           simulateDelay(2000);
            System.out.println("payment processed.");
        });
        CompletableFuture<Void> inventoryUpdate=CompletableFuture.runAsync(()->{
            simulateDelay(5000);
            System.out.println("Inventory updated. ");
        });

        CompletableFuture<Void> emailConfirmation=CompletableFuture.runAsync(()->{
            simulateDelay(1000);
            System.out.println("Email sent.");
        });

        CompletableFuture<Void> allTasks=CompletableFuture.allOf(orderValidation,paymentProccessing,inventoryUpdate,emailConfirmation);

        allTasks.join();
        System.out.println("Order completed");
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
