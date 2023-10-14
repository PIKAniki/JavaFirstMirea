package ru.mirea.task21;

import java.util.Arrays;

public class AnyTypeArray<T> {
    private T[] array;

    public AnyTypeArray(int size) {
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        array[index] = value;
    }

    public T get(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return array[index];
    }

    public int size() {
        return array.length;
    }


    public static void main(String[] args) {
        AnyTypeArray<Integer> intArray = new AnyTypeArray<>(4);
        intArray.set(0,2);
        intArray.set(1,4);
        intArray.set(2,6);
        intArray.set(3,3);
        System.out.println(Arrays.toString(intArray.array));
        System.out.println(intArray.get(2));
    }
}
