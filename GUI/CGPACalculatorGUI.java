package com.javalab.firstproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CGPACalculatorGUI extends JFrame {
    private JLabel[] subjectLabels;
    private JTextField[] gradeFields;
    private JButton calculateButton;
    private JLabel resultLabel;

    public CGPACalculatorGUI() {
        setTitle("CGPA Calculator");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        int numberOfSubjects = 5; // You can change this to match the number of subjects
        subjectLabels = new JLabel[numberOfSubjects];
        gradeFields = new JTextField[numberOfSubjects];

        Container container = getContentPane();
        container.setLayout(new GridLayout(numberOfSubjects + 2, 2));

        for (int i = 0; i < numberOfSubjects; i++) {
            subjectLabels[i] = new JLabel("Enter grade for Subject " + (i + 1) + ":");
            gradeFields[i] = new JTextField();
            container.add(subjectLabels[i]);
            container.add(gradeFields[i]);
        }

        calculateButton = new JButton("Calculate CGPA");
        resultLabel = new JLabel();

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double totalGradePoints = 0;
                    int totalCredits = 0;

                    for (int i = 0; i < numberOfSubjects; i++) {
                        double grade = Double.parseDouble(gradeFields[i].getText());
                        totalGradePoints += grade;
                        totalCredits += 1; // Assuming each subject has 1 credit
                    }

                    double cgpa = totalGradePoints / totalCredits;
                    resultLabel.setText("CGPA: " + cgpa);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Please enter valid grades.");
                }
            }
        });

        container.add(new JLabel()); // Empty space
        container.add(calculateButton);
        container.add(new JLabel()); // Empty space
        container.add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CGPACalculatorGUI();
    }
}
