package ru.mirea.task19;

public class BadINNArgumentsException extends RuntimeException{
    public BadINNArgumentsException(String errorMessage) {
        super(errorMessage);
    }
}
