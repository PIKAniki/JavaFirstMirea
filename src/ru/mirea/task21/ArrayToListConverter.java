package ru.mirea.task21;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConverter {

    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        list.addAll(Arrays.asList(array));
        return list;
    }

    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "cherry"};
        Integer[] intArray = {1, 2, 3, 4, 5};

        List<String> stringList = convertArrayToList(stringArray);
        List<Integer> intList = convertArrayToList(intArray);

        System.out.println("String List: " + stringList);
        System.out.println("Integer List: " + intList);
    }
}

