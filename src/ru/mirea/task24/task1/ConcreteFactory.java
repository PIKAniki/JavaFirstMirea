package ru.mirea.task24.task1;

public class ConcreteFactory implements ComplexAbstractFactory{
    private Complex complexNumber;

    @Override
    public Complex createComplex() {
        complexNumber = new Complex();
        return  complexNumber;
    }

    @Override
    public Complex createComplex(int real, int image) {
        complexNumber = new Complex(real, image);
        return complexNumber;
    }

    @Override
    public String toString() {
        return complexNumber.toString();
    }
}
