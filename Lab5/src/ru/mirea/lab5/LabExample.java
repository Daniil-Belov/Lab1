package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabExample extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton("+");
    Font fnt = new Font("Times new roman",Font.BOLD,20);

    LabExample(){
        super("мое окно");
        setLayout(new FlowLayout());
        setSize(400,250);
        add(new JLabel("первое число"));
        add(jta1);
        add(new JLabel("второе число"));
        add(jta2);
        add(button);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event) {
                try {
                    double x1, x2, x3;
                    x1 = Double.parseDouble(jta1.getText().trim());
                    x2 = Double.parseDouble(jta2.getText().trim());
                    x3 = x1 + x2;
                    JOptionPane.showMessageDialog(null, "результат сложения=" + x3, "ATTENTION", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "неправильный ввод пользователя", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


       jta1.setBackground(Color.GRAY);
       jta1.setForeground(Color.BLUE);
       jta1.setFont(fnt);

        setVisible(true);
    }
}
