package com.javalab.firstproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BinarySearchGUI extends JFrame {
    private JTextField arrayField;
    private JTextField targetField;
    private JButton searchButton;
    private JLabel resultLabel;

    public BinarySearchGUI() {
        setTitle("Binary Search");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container container = getContentPane();
        container.setLayout(new GridLayout(4, 2));

        arrayField = new JTextField();
        JLabel arrayLabel = new JLabel("Enter the array (comma separated):");
        targetField = new JTextField();
        JLabel targetLabel = new JLabel("Enter the target number:");
        searchButton = new JButton("Search");
        resultLabel = new JLabel();

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String[] arrayStr = arrayField.getText().split(",");
                    int[] array = new int[arrayStr.length];
                    for (int i = 0; i < arrayStr.length; i++) {
                        array[i] = Integer.parseInt(arrayStr[i]);
                    }
                    int target = Integer.parseInt(targetField.getText());
                    int index = binarySearch(array, target);
                    if (index != -1) {
                        resultLabel.setText("Found " + target + " at index " + index + ".");
                    } else {
                        resultLabel.setText(target + " not found in the array.");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Please enter valid integers.");
                }
            }
        });

        container.add(arrayLabel);
        container.add(arrayField);
        container.add(targetLabel);
        container.add(targetField);
        container.add(new JLabel()); // Empty space
        container.add(searchButton);
        container.add(new JLabel()); // Empty space
        container.add(resultLabel);

        setVisible(true);
    }

    private int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new BinarySearchGUI();
    }
}

