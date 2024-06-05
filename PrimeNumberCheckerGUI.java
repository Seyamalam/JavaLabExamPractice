package com.javalab.firstproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrimeNumberCheckerGUI extends JFrame {
    private JTextField inputField;
    private JButton checkButton;
    private JLabel resultLabel;

    public PrimeNumberCheckerGUI() {
        setTitle("Prime Number Checker");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container container = getContentPane();
        container.setLayout(new GridLayout(3, 1));

        inputField = new JTextField();
        checkButton = new JButton("Check");
        resultLabel = new JLabel();

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(inputField.getText());
                    boolean isPrime = isPrime(number);
                    if (isPrime) {
                        resultLabel.setText(number + " is a prime number.");
                    } else {
                        resultLabel.setText(number + " is not a prime number.");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Please enter a valid integer.");
                }
            }
        });

        container.add(inputField);
        container.add(checkButton);
        container.add(resultLabel);

        setVisible(true);
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new PrimeNumberCheckerGUI();
    }
}
