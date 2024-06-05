package com.javalab.firstproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BubbleSortGUI extends JFrame {
    private JTextField arrayField;
    private JButton sortButton;
    private JTextArea outputArea;

    public BubbleSortGUI() {
        setTitle("Bubble Sort");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout());
        JLabel arrayLabel = new JLabel("Enter the array (comma separated):");
        arrayField = new JTextField(20);
        topPanel.add(arrayLabel);
        topPanel.add(arrayField);

        JPanel bottomPanel = new JPanel(new FlowLayout());
        sortButton = new JButton("Sort");
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        bottomPanel.add(sortButton);

        sortButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String[] arrayStr = arrayField.getText().split(",");
                    int[] array = new int[arrayStr.length];
                    for (int i = 0; i < arrayStr.length; i++) {
                        array[i] = Integer.parseInt(arrayStr[i]);
                    }
                    bubbleSort(array);
                    outputArea.setText("Sorted array: " + arrayToString(array));
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

    private void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        new BubbleSortGUI();
    }
}
