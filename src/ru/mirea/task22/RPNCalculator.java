package ru.mirea.task22;

import java.util.Stack;
import java.util.StringTokenizer;

public class RPNCalculator {
    public static double calculateRPN(String expression) {
        String rpnExpression = infixToRPN(expression);
        String[] tokens = rpnExpression.split(" ");
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid RPN expression");
                }
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(operand1, operand2, token);
                stack.push(result);
            } else {
                throw new IllegalArgumentException("Invalid token in RPN expression: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid RPN expression");
        }

        return stack.pop();
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String str) {
        return str.matches("[+\\-*/]");
    }

    private static double performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }

    private static int getPrecedence(String operator) {
        if (operator.equals("+") || operator.equals("-")) {
            return 1;
        }
        if (operator.equals("*") || operator.equals("/")) {
            return 2;
        }
        return 0;
    }

    private static String infixToRPN(String expression) {
        Stack<String> operatorStack = new Stack<>();
        StringBuilder output = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/()", true);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().trim();
            if (isNumeric(token)) {
                output.append(token).append(" ");
            } else if (isOperator(token)) {
                while (!operatorStack.isEmpty() && !token.equals("(") && (getPrecedence(token) <= getPrecedence(operatorStack.peek()))) {
                    output.append(operatorStack.pop()).append(" ");
                }
                operatorStack.push(token);
            } else if (token.equals("(")) {
                operatorStack.push(token);
            } else if (token.equals(")")) {
                while (!operatorStack.isEmpty() && !operatorStack.peek().equals("(")) {
                    output.append(operatorStack.pop()).append(" ");
                }
                if (!operatorStack.isEmpty() && operatorStack.peek().equals("(")) {
                    operatorStack.pop();
                }
            }
        }

        while (!operatorStack.isEmpty()) {
            output.append(operatorStack.pop()).append(" ");
        }

        return output.toString();
    }

    public static void main(String[] args) {
        String infixExpression = "3 + 4 * ( 2 - 1 ) / 5";
        double result = calculateRPN(infixExpression);
        System.out.println("Result: " + result);
    }
}


