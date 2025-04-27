package com.thread;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class FraudDetectionSystem {
    public static void main(String[] args) {
        CompletableFuture<Double> amountRisk = analyzeAmountRisk(5000);
        CompletableFuture<Double> locationRisk = analyzeLocationRisk("Nigeria");
        CompletableFuture<Double> historyRisk = analyzeTransactionHistory("User123");

        CompletableFuture<Double> fraudScore = amountRisk.thenCombine(locationRisk, Double::sum).thenCombine(historyRisk, Double::sum);
        fraudScore.thenAccept(score -> {
            if (score > 7.5) {
                System.out.println("🚨 Fraud Detected! Score: " + score);
            } else {
                System.out.println("✅ Transaction Approved. Score: " + score);
            }
        }).join();
    }

    public static CompletableFuture<Double> analyzeAmountRisk(double amounts) {
        return CompletableFuture.supplyAsync(() -> amounts > 30000 ? 4.0 : 1.0);
    }

    public static CompletableFuture<Double> analyzeLocationRisk(String riskCountry) {
        return CompletableFuture.supplyAsync(() -> riskCountry.equalsIgnoreCase("Nigeria") ? 3.0 : 0.5);
    }

    public static CompletableFuture<Double> analyzeTransactionHistory(String userId) {
        return CompletableFuture.supplyAsync(() -> new Random().nextDouble() * 3);
    }

}
