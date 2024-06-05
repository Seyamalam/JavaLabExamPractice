package com.javalab.firstproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LinearSearchGUI extends JFrame {
    private JTextField arrayField;
    private JTextField targetField;
    private JButton searchButton;
    private JTextArea outputArea;

    public LinearSearchGUI() {
        setTitle("Linear Search");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout());
        JLabel arrayLabel = new JLabel("Enter the array (comma separated):");
        arrayField = new JTextField(20);
        JLabel targetLabel = new JLabel("Enter the target number:");
        targetField = new JTextField(5);
        topPanel.add(arrayLabel);
        topPanel.add(arrayField);
        topPanel.add(targetLabel);
        topPanel.add(targetField);

        JPanel bottomPanel = new JPanel(new FlowLayout());
        searchButton = new JButton("Search");
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        bottomPanel.add(searchButton);

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String[] arrayStr = arrayField.getText().split(",");
                    int[] array = new int[arrayStr.length];
                    for (int i = 0; i < arrayStr.length; i++) {
                        array[i] = Integer.parseInt(arrayStr[i]);
                    }
                    int target = Integer.parseInt(targetField.getText());
                    int index = linearSearch(array, target);
                    if (index != -1) {
                        outputArea.setText("Target " + target + " found at index " + index + ".");
                    } else {
                        outputArea.setText("Target " + target + " not found in the array.");
                    }
                } catch (NumberFormatException ex) {
                    outputArea.setText("Invalid input! Please enter valid integers.");
                }
            }
        });

        container.add(topPanel, BorderLayout.NORTH);
        container.add(new JScrollPane(outputArea), BorderLayout.CENTER);
        container.add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new LinearSearchGUI();
    }
}

