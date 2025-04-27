package com.thread.engDigest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture_19 {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker.");
            } catch (Exception e) {

            }
            return "ok";
        });    //.orTimeout(1, TimeUnit.SECONDS).exceptionally(s ->"Timeout occured");
        String s = null;
        try {
            s = completableFuture.get();
        } catch (InterruptedException e) {
            throw new RuntimeException();
        } catch (ExecutionException e) {
            throw new RuntimeException();

        }
    }

}
