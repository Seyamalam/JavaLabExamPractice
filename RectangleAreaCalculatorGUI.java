package com.javalab.firstproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RectangleAreaCalculatorGUI extends JFrame {
    private JLabel lengthLabel;
    private JTextField lengthField;
    private JLabel widthLabel;
    private JTextField widthField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public RectangleAreaCalculatorGUI() {
        setTitle("Area Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container c = getContentPane();
        c.setLayout(new GridLayout(4, 2));

        lengthLabel = new JLabel("Enter the length:");
        lengthField = new JTextField();
        widthLabel = new JLabel("Enter the width:");
        widthField = new JTextField();
        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel();

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double length = Double.parseDouble(lengthField.getText());
                    double width = Double.parseDouble(widthField.getText());
                    double area = length * width;
                    resultLabel.setText("Area: " + area);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Please enter valid numbers.");
                }
            }
        });

        c.add(lengthLabel);
        c.add(lengthField);
        c.add(widthLabel);
        c.add(widthField);
        c.add(new JLabel()); // Empty space
        c.add(calculateButton);
        c.add(new JLabel()); // Empty space
        c.add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new RectangleAreaCalculatorGUI();
    }
}
