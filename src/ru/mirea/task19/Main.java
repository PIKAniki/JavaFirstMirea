package ru.mirea.task19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        validFIO();
        validINN();
        System.out.println("All correct!");
    }
    public static void validFIO() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your FIO: ");
        String fio;
        try{
            fio = sc.nextLine();
            if (fio.split(" ").length != 3) {
                throw new BadFIOArgumentsException("FIO must have 3 words");
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Illegal");
        } catch (BadFIOArgumentsException badFIOArgumentsException) {
            System.out.println(badFIOArgumentsException.getMessage());
            validFIO();
        }
    }
    public static void validINN() {
        Scanner sc = new Scanner(System.in);
        String inn;
        System.out.println("Input your INN: ");
        try{
            inn = sc.nextLine();
            try{
                Long.parseLong(inn);
            } catch (NumberFormatException numberFormatException) {
                throw new BadINNArgumentsException("INN should be number");
            }
            if (inn.length() != 12) {
                throw new BadINNArgumentsException("Length of INN must be 12");
            }

        } catch (InputMismatchException inputMismatchException) {
            System.out.println("You entered wrong type. Please, enter integer");
        } catch (BadINNArgumentsException badINNArgumentsException) {
            System.out.println(badINNArgumentsException.getMessage());
            validINN();
        }
    }

}
