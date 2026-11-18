package com.designpattern.builder;
// https://chatgpt.com/c/6a7237d7-5abc-83ee-ae8f-c112ca15115e
public class BuilderMain {
    public static void main(String[] args) {

        Computer computer = new Computer.Builder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard(true)
                .build();

        System.out.println(computer);


    }
}
