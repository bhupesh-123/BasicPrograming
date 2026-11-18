package com.java8;

import java.io.FileInputStream;
import java.io.IOException;

public class WithoutTryWithResorces {
    public static void main(String[] args) {
        readData();
    }
    public static void readData(){
        FileInputStream input=null;
        try {
            input=new FileInputStream("C:/Users/Bhupesh Vishwakarma/Documents/My_work/files/test.txt");
            int data;

            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }
        }
        catch (IOException e){
            System.out.println("Getting IOException: "+e.getMessage());
        }
        finally {
            try {
                if(input!=null){
                    input.close();;
                }
            }
            catch (IOException ie){
                System.out.println("Finally Getting IOException: "+ie.getMessage());

            }
        }
    }
}
