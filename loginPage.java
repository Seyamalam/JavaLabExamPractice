package com.javalab.firstproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class loginPage extends JFrame {
    Container c = getContentPane();
    JLabel L1, L2;
    JTextField f1, f2;
    JButton b1, b2;
    JCheckBox jb1, jb2;
    JRadioButton r1, r2, r3;

    public loginPage() {
        L1 = new JLabel("Name");
        L1.addMouseListener(new MouseHandler());

        f1 = new JTextField(20);
        Icon Ic1 = new ImageIcon("c.JPEG");
        L2 = new JLabel("Password", Ic1, SwingConstants.CENTER);
        L2.setIcon(Ic1);

        f2 = new JTextField(20);
        b1 = new JButton("login");
        b1.addActionListener(new LoginHandler());
        b2 = new JButton("Cancel");
        b2.addActionListener(new CancelHandler());
        jb1 = new JCheckBox("Fuad");
        jb2 = new JCheckBox("Fuad1");
        r1 = new JRadioButton("a");
        r1.addItemListener(new RadioButtonHandler());
        r2 = new JRadioButton("b");
        r3 = new JRadioButton("c");

        c.setLayout(new FlowLayout());
        c.add(L1);
        c.add(f1);
        c.add(L2);
        c.add(f2);
        c.add(b1);
        c.add(b2);
        c.add(jb1);
        c.add(jb2);
        c.add(r1);
        c.add(r2);
        c.add(r3);

        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new loginPage();
    }

    private class LoginHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Successfully login");
            JOptionPane.showMessageDialog(null, "login");
        }
    }

    private class CancelHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "cancel");
            System.exit(0);
        }
    }

    private class RadioButtonHandler implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            c.setBackground(Color.red);
        }
    }

    private class MouseHandler implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            System.out.println("clicked");
        }

        public void mousePressed(MouseEvent e) {
            System.out.println("pressed");
        }

        public void mouseReleased(MouseEvent e) {
            System.out.println("released");
        }

        public void mouseEntered(MouseEvent e) {
            System.out.println("entered");
        }

        public void mouseExited(MouseEvent e) {
            System.out.println("exited");
        }
    }
}
