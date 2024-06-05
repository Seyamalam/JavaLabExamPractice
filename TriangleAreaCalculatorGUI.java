/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javalab.firstproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TriangleAreaCalculatorGUI extends JFrame {
    private JLabel sideALabel;
    private JTextField sideAField;
    private JLabel sideBLabel;
    private JTextField sideBField;
    private JLabel sideCLabel;
    private JTextField sideCField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public TriangleAreaCalculatorGUI() {
        setTitle("Area Calculator");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        c.setLayout(new GridLayout(5, 2));

        sideALabel = new JLabel("Enter the length of side A:");
        sideAField = new JTextField();
        sideBLabel = new JLabel("Enter the length of side B:");
        sideBField = new JTextField();
        sideCLabel = new JLabel("Enter the length of side C:");
        sideCField = new JTextField();
        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel();

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double sideA = Double.parseDouble(sideAField.getText());
                    double sideB = Double.parseDouble(sideBField.getText());
                    double sideC = Double.parseDouble(sideCField.getText());
                    double semiPerimeter = (sideA + sideB + sideC) / 2;
                    double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
                    resultLabel.setText("Area: " + area);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Please enter valid numbers.");
                }
            }
        });

        c.add(sideALabel);
        c.add(sideAField);
        c.add(sideBLabel);
        c.add(sideBField);
        c.add(sideCLabel);
        c.add(sideCField);
        c.add(new JLabel()); // Empty space
        c.add(calculateButton);
        c.add(new JLabel()); // Empty space
        c.add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TriangleAreaCalculatorGUI();
    }
}
