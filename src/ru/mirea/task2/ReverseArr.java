package ru.mirea.task2;

import java.util.Arrays;

public class ReverseArr {
    public static void reverse(String[] arr) {
        int n = arr.length;
        String tmp;
        for (int i = 0; i < n / 2; i++) {
            tmp = arr[n-1-i];
            arr[n-i-1] = arr[i];
            arr[i] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
