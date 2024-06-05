package com.javalab.firstproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialCalculatorGUI extends JFrame {
    private JLabel numberLabel;
    private JTextField numberField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public FactorialCalculatorGUI() {
        setTitle("Factorial Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 2));

        numberLabel = new JLabel("Enter the number:");
        numberField = new JTextField();
        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel();

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(numberField.getText());
                    long factorial = 1;
                    for (int i = 1; i <= number; i++) {
                        factorial *= i;
                    }
                    resultLabel.setText("Factorial: " + factorial);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Please enter a valid integer.");
                }
            }
        });

        c.add(numberLabel);
        c.add(numberField);
        c.add(new JLabel()); // Empty space
        c.add(calculateButton);
        c.add(new JLabel()); // Empty space
        c.add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FactorialCalculatorGUI();
    }
}
