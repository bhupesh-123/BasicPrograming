package com.thread;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureCombine {
    public static void main(String[] args) {
        CompletableFuture<String> future1=CompletableFuture.supplyAsync(()->"Hello");
        CompletableFuture<String> future2=CompletableFuture.supplyAsync(()->"World");

        CompletableFuture<Void> result=future1.thenCombine(future2,(f1, f2)->f1+" "+f2).thenApply(res->res.toUpperCase()).thenAccept(System.out::println);


    }
}
