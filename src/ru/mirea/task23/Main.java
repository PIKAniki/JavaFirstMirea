package ru.mirea.task23;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayQueueModule arrayQueueModule = new ArrayQueueModule();
        arrayQueueModule.enqueue("Hello");
        arrayQueueModule.enqueue("World");
        arrayQueueModule.enqueue("Heheh");
        System.out.println(Arrays.toString(arrayQueueModule.toArray()));
        System.out.println(arrayQueueModule.size());
        arrayQueueModule.clear();
        System.out.println(Arrays.toString(arrayQueueModule.toArray()));
        System.out.println(arrayQueueModule.size());
    }
}
