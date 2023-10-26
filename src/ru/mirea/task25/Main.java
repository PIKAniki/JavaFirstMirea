package ru.mirea.task25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean validateIP(String s) {
        String regexIP = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$";
        return Pattern.matches(regexIP, s);
    }

    public static String validateBrackets(String s) {
        String openBracket = "\\(";
        String closeBracket = "\\)";
        Pattern patternOpen = Pattern.compile(openBracket);
        Matcher matcherOpen = patternOpen.matcher(s);
        Pattern patternClose = Pattern.compile(closeBracket);
        Matcher matcherClose = patternClose.matcher(s);
        int openedBrackets = 0;
        int closedBrackets = 0;
        while (matcherOpen.find()) {
            openedBrackets++;
        }
        while (matcherClose.find()) {
            closedBrackets++;
        }
        if (openedBrackets == closedBrackets) {
            return "Correct format";
        } else {
            return "Wrong format";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your IP address");
        String str = sc.nextLine();
        while (!str.equals("stop")) {
            if (validateIP(str)) {
                System.out.println("Correct format");
            } else {
                System.out.println("Wrong format");
            }
            str = sc.nextLine();
        }
        System.out.println("Enter your string with brackets");
        str = sc.nextLine();
        while (!str.equals("stop")) {
            System.out.println(validateBrackets(str));
            str = sc.nextLine();
        }
    }

}
