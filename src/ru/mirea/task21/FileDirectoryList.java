package ru.mirea.task21;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileDirectoryList {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\User\\Documents\\JavaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task21");
        File[] arrFiles = dir.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        for (int i = 0; i < 5; i++) {
            System.out.println(lst.get(i));
        }
    }
}
