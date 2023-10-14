package ru.mirea.task20;


import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        MyGenericClass<Integer, Dog, String> myGenericClass = new MyGenericClass<>(20, new Dog(), "Hello");
        myGenericClass.printClassName();
        Integer[] intArray = {2,3,4,5};
        MinMax<Integer> minMax = new MinMax<>(intArray);
        System.out.println("Max value: " + minMax.findMax());
        System.out.println("Min value: " + minMax.findMin());
        System.out.println(Calculate.sum(2, 3));
        System.out.println(Calculate.sum(2.7, 2));
        System.out.println(Calculate.multiply(2, 7.4));
    }
}


class Animal {}

class Dog extends Animal implements Serializable{}

class MyGenericClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T t;
    private V v;
    private K k;

    public MyGenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void printClassName() {
        System.out.println("Type of T: " + t.getClass().getName());
        System.out.println("Type of V: " + v.getClass().getName());
        System.out.println("Type of K: " + k.getClass().getName());
    }
}
