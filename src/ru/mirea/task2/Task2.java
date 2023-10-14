package ru.mirea.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Author author = new Author("Nikita", "@mail.ru", 'm');
        System.out.println(author);
        String[] arrayStrings = {"Hello", "From", "RTU", "MIREA"};
        ReverseArr.reverse(arrayStrings);
        howMany();
        TestDog testDog = new TestDog();
        Dog dog1 = new Dog("Mike", 3);
        System.out.println(dog1);
        testDog.addDog("Gaw", 2);
        testDog.addDog(dog1);
        System.out.println(testDog.dogs);
    }
    public static void howMany() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] howMany;
        howMany = str.split(" ");
        System.out.println("You entered " + howMany.length + " words");
    }


}

