package ru.mirea.task18;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {

    }
    public static void exceptionDemo() {
//        Scanner myScanner = new Scanner( System.in);
//        System.out.print( "Enter an integer ");
        try {
            tryInput();
        }
//        } catch (Exception exception) {
//            System.out.println("Wrong entered int");
//        }
        catch (NumberFormatException numberFormatException) {
            System.out.println("You entered wrong type of number. Must be INTEGER");
            exceptionDemo();
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Are you trying to divide by zero. It`s impossible");
            exceptionDemo();
        }
    }

    public static void tryInput() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer for 2/x: ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }

}
