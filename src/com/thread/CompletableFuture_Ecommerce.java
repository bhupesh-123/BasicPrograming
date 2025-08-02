package com.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFuture_Ecommerce {
    public static void main(String[] args) {
        System.out.println("Fetching user data...");
        CompletableFuture<String> userDbData = fetchUserFromDB();
        CompletableFuture<String> fetchOrder = fetchOrderFromService();

        CompletableFuture<String> combineResult = userDbData.thenCombine(fetchOrder, (user, order) -> {
            return "user info: " + user + "  order info: " + order;
        });
        combineResult.exceptionally(ex -> ex.getMessage()).thenAccept(System.out::println);

        combineResult.join();

    }

    public static CompletableFuture<String> fetchUserFromDB() {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(1);
            return "Bhupesh (id: 123)";
        });
    }

    public static CompletableFuture<String> fetchOrderFromService() {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay(1);
            return "Order#1234 , Order#6789";
        });
    }

    public static void simulateDelay(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
