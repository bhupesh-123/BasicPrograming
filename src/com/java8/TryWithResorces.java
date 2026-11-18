package com.java8;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResorces {
    public static void main(String[] args) {
      readData();
    }
    public static void readData(){
        try(FileInputStream input=new FileInputStream("C:/Users/Bhupesh Vishwakarma/Documents/My_work/files/test.txt")) {
            int data;

            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }
        }
        catch (IOException e){
            System.out.println("Getting IOException: "+e.getMessage());
        }

    }
}
