package com.javalab.firstproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FibonacciCalculatorGui extends JFrame {
    private Container c = getContentPane();
    private JLabel inputLabel, resultLabel;
    private JTextField inputField, resultField;
    private JButton calculateButton;

    public FibonacciCalculatorGui() {
        inputLabel = new JLabel("Enter the number of terms:");
        inputField = new JTextField(10);
        resultLabel = new JLabel("Result:");
        resultField = new JTextField(20);
        resultField.setEditable(false);
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new CalculateHandler());

        c.setLayout(new FlowLayout());
        c.add(inputLabel);
        c.add(inputField);
        c.add(resultLabel);
        c.add(resultField);
        c.add(calculateButton);

        setVisible(true);
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FibonacciCalculatorGui();
    }

    private class CalculateHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int numTerms = Integer.parseInt(inputField.getText());
            StringBuilder result = new StringBuilder();
            int first = 0, second = 1;
            result.append(first).append(", ").append(second);
            for (int i = 2; i < numTerms; i++) {
                int next = first + second;
                result.append(", ").append(next);
                first = second;
                second = next;
            }
            resultField.setText(result.toString());
        }
    }
}

