package ru.mirea.task24.task2;

public class FunctionalChair implements Chair{
    @Override
    public void sit(Chair chair) {
        System.out.println("Functional");
    }

    @Override
    public String GetType() {
        return "Functional Chair";
    }
}
