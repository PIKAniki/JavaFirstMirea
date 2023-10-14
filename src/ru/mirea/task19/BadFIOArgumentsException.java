package ru.mirea.task19;

public class BadFIOArgumentsException extends RuntimeException{
    public BadFIOArgumentsException(String errorMessage) {
        super(errorMessage);
    }
}
