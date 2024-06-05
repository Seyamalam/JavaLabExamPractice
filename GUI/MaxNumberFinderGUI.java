package com.javalab.firstproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MaxNumberFinderGUI extends JFrame {
    private JTextField inputField;
    private JButton addButton;
    private JButton findMaxButton;
    private JTextArea outputArea;
    private int[] numbers;
    private int currentIndex;

    public MaxNumberFinderGUI() {
        setTitle("Maximum Number Finder");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        numbers = new int[10]; // Maximum 10 numbers
        currentIndex = 0;

        Container container = getContentPane();
        container.setLayout(new GridLayout(4, 1));

        inputField = new JTextField();
        addButton = new JButton("Add Number");
        findMaxButton = new JButton("Find Maximum Number");
        outputArea = new JTextArea();
        outputArea.setEditable(false);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(inputField.getText());
                    if (currentIndex < numbers.length) {
                        numbers[currentIndex] = number;
                        currentIndex++;
                        outputArea.append("Number " + number + " added.\n");
                    } else {
                        outputArea.append("Array is full. Cannot add more numbers.\n");
                    }
                    inputField.setText("");
                } catch (NumberFormatException ex) {
                    outputArea.append("Invalid input! Please enter a valid integer.\n");
                }
            }
        });

        findMaxButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (currentIndex > 0) {
                    int max = numbers[0];
                    for (int i = 1; i < currentIndex; i++) {
                        if (numbers[i] > max) {
                            max = numbers[i];
                        }
                    }
                    outputArea.append("Maximum number: " + max + "\n");
                } else {
                    outputArea.append("Array is empty. Add numbers first.\n");
                }
            }
        });

        container.add(inputField);
        container.add(addButton);
        container.add(findMaxButton);
        container.add(new JScrollPane(outputArea));

        setVisible(true);
    }

    public static void main(String[] args) {
        new MaxNumberFinderGUI();
    }
}

