package ru.mirea.task24.task1;

public class Main {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        ConcreteFactory fact = new ConcreteFactory();
        Complex nums1 = fact.createComplex();
        Complex nums2 = fact.createComplex(3, 5);
        System.out.println(nums1);
        System.out.println(nums2);
    }
}
