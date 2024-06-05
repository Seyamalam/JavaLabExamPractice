package com.javalab.firstproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CircleAreaCalculatorGUI extends JFrame {
    private JLabel radiusLabel;
    private JTextField radiusField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public CircleAreaCalculatorGUI() {
        setTitle("Circle Area Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 2));

        radiusLabel = new JLabel("Enter the radius:");
        radiusField = new JTextField();
        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel();

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double radius = Double.parseDouble(radiusField.getText());
                    double area = Math.PI * radius * radius;
                    resultLabel.setText("Area: " + area);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Please enter a valid number.");
                }
            }
        });

        c.add(radiusLabel);
        c.add(radiusField);
        c.add(new JLabel()); // Empty space
        c.add(calculateButton);
        c.add(new JLabel()); // Empty space
        c.add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CircleAreaCalculatorGUI();
    }
}
