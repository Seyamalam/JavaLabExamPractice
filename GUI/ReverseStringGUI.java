package com.javalab.firstproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseStringGUI extends JFrame {
    private JTextField inputField;
    private JButton reverseButton;
    private JLabel resultLabel;

    public ReverseStringGUI() {
        setTitle("Reverse String");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container container = getContentPane();
        container.setLayout(new GridLayout(3, 1));

        inputField = new JTextField();
        reverseButton = new JButton("Reverse");
        resultLabel = new JLabel();

        reverseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String reversed = reverseString(input);
                resultLabel.setText("Reversed string: " + reversed);
            }
        });

        container.add(inputField);
        container.add(reverseButton);
        container.add(resultLabel);

        setVisible(true);
    }

    private String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        new ReverseStringGUI();
    }
}
