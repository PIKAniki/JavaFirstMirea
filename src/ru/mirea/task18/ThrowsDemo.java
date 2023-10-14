package ru.mirea.task18;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        System.out.println("Enter somebody for data");
        try {
            Scanner myScanner = new Scanner(System.in);
            String key = myScanner.next();
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Retry please");
            getKey();
        }

    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch (Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("wrong")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key; }
}


