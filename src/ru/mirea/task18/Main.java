package ru.mirea.task18;

import static ru.mirea.task18.Exception2.exceptionDemo;

public class Main {
    public static void main(String[] args) {
        exceptionDemo();
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.getKey();
    }
}
