package ru.mirea.task2;

import java.util.ArrayList;
import java.util.List;

public class TestDog {
    public List<Dog> dogs = new ArrayList<>();
    public void addDog(Dog dog) {
        dogs.add(dog);
    }
    public void addDog(String name, int age) {
        dogs.add(new Dog(name, age));
    }
}
