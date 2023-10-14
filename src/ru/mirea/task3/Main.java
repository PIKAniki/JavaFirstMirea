package ru.mirea.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("---------Number 1------------");
        double[] dbArray = new double[10];
        for (int i = 0; i < dbArray.length; i++) {
            dbArray[i] = Math.random() * 100;
        }
        Arrays.sort(dbArray);
        System.out.println(Arrays.toString(dbArray));
        for (int i = 0; i < dbArray.length; i++) {
            dbArray[i] = rand.nextDouble(100);
        }
        Arrays.sort(dbArray);
        System.out.println(Arrays.toString(dbArray));

        System.out.println("---------Number 2------------");
        int[] intArr = new int[4];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(10, 99);
        }
        System.out.println(Arrays.toString(intArr));
        int countOfUp = 0;
        for (int i = 0; i < intArr.length - 1; i++) {
            if (intArr[i] >= intArr[i+1]) countOfUp++;
        }
        if (countOfUp == 0) {
            System.out.println("Strogo vozr");
        } else{
            System.out.println("Net");
        }
        System.out.println("---------Number 3------------");
        System.out.println("Type shells");
        Double dbValue = Double.valueOf(5);
        Double dbParseStr = Double.parseDouble("54");
        System.out.println(dbValue);
        System.out.println(dbParseStr);
        System.out.println("---------Formatting String--------");
        Employee[] empls = {new Employee("Student1", 400),
                new Employee("Student2", 500),
                new Employee("Student3", 600),
                new Employee("Student4", 200)};
        Report.generateReport(empls);
    }
}
