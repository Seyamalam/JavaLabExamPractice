package com.javalab.firstproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SquareAreaCalculatorGUI extends JFrame {
    private JLabel sideLabel;
    private JTextField sideField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public SquareAreaCalculatorGUI() {
        setTitle("Area Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 2));

        sideLabel = new JLabel("Enter the length of side:");
        sideField = new JTextField();
        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel();

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double side = Double.parseDouble(sideField.getText());
                    double area = side * side;
                    resultLabel.setText("Area: " + area);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Please enter a valid number.");
                }
            }
        });

        c.add(sideLabel);
        c.add(sideField);
        c.add(new JLabel()); // Empty space
        c.add(calculateButton);
        c.add(new JLabel()); // Empty space
        c.add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new SquareAreaCalculatorGUI();
    }
}

