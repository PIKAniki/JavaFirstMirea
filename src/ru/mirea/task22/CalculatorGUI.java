package ru.mirea.task22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        frame.add(view);

        frame.setVisible(true);
    }
}

class CalculatorModel {
    private String input = "";

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public double evaluateInput() {
        try {
            return (int)RPNCalculator.calculateRPN(input);
        } catch (Exception e) {
            return Double.NaN;
        }
    }
}

class CalculatorView extends JPanel {
    protected JTextField inputField;
    protected JButton[] numberButtons;
    protected JButton addButton;
    protected JButton subtractButton;
    protected JButton multiplyButton;
    protected JButton divideButton;
    protected JButton equalsButton;
    protected JButton clearButton;

    public CalculatorView() {
        setLayout(new GridLayout(5, 4));

        inputField = new JTextField();
        inputField.setEditable(false);
        add(inputField);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            add(numberButtons[i]);
        }

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalsButton = new JButton("=");
        clearButton = new JButton("C");

        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(equalsButton);
        add(clearButton);
    }
}

class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        // Добавляем слушатели для кнопок и текстового поля
        for (int i = 0; i < 10; i++) {
            final int digit = i;
            view.numberButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    model.setInput(model.getInput() + digit);
                    view.inputField.setText(model.getInput());
                }
            });
        }

        view.addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setInput(model.getInput() + " + ");
                view.inputField.setText(model.getInput());
            }
        });

        view.subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setInput(model.getInput() + " - ");
                view.inputField.setText(model.getInput());
            }
        });

        view.multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setInput(model.getInput() + " * ");
                view.inputField.setText(model.getInput());
            }
        });

        view.divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setInput(model.getInput() + " / ");
                view.inputField.setText(model.getInput());
            }
        });

        view.equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = model.evaluateInput();
                view.inputField.setText(String.valueOf(result));
            }
        });

        view.clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setInput("");
                view.inputField.setText("");
            }
        });
    }
}

