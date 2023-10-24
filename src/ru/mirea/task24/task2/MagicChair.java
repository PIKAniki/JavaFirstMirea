package ru.mirea.task24.task2;

public class MagicChair implements Chair{
    @Override
    public void sit(Chair chair) {
        System.out.println("Magic");
    }

    @Override
    public String GetType() {
        return "Magic";
    }
}
