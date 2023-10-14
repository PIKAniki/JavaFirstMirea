package ru.mirea.task20;

public class Calculate {
    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number> double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number> double divide(T num1, T num2) {
        if (num2.doubleValue() == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public static <T extends Number> double subtraction(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
}
