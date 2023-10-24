package ru.mirea.task24.task2;

public class VictorianChair implements Chair{
    @Override
    public void sit(Chair chair) {
        System.out.println("Victorian");
    }

    @Override
    public String GetType() {
        return "Victorian chair";
    }
}
