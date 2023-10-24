package ru.mirea.task24.task1;

public class Complex {
    private int real;
    private int imaginary;
    public Complex() {
        real = 0;
        imaginary = 0;
    }
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return "Complex: " +
                "real=" + real +
                ", imaginary=" + imaginary;
    }
}
