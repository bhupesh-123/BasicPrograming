package com.thread;

public class ThreadPrintNumber {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        // Odd thread
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 10; i += 2) {
                printer.printOdd(i);
            }
        });

        // Even thread
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                printer.printEven(i);
            }
        });

        oddThread.start(); // Start odd thread
        evenThread.start(); // Start even thread
    }
}
class NumberPrinter {
    private boolean isOdd = true; // Flag to control odd and even printing

    public synchronized void printOdd(int number) {
        while (!isOdd) {
            try {
                wait(); // Wait until it's this thread's turn
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd: " + number);
        isOdd = false; // Switch flag to even
        notify(); // Notify the other thread
    }

    public synchronized void printEven(int number) {
        while (isOdd) {
            try {
                wait(); // Wait until it's this thread's turn
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even: " + number);
        isOdd = true; // Switch flag to odd
        notify(); // Notify the other thread
    }
}