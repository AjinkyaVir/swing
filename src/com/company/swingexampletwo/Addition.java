package com.company.swingexampletwo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addition extends JFrame implements ActionListener {

    JTextField jTextField,jTextField1;
    JButton jButton;
    JLabel jLabel;

    public Addition() throws HeadlessException {


         jTextField = new JTextField(20);
         jTextField1 = new JTextField(20);

         jButton = new JButton("OK");

         jLabel = new JLabel("Result");

        add(jTextField);
        add(jTextField1);
        add(jButton);
        add(jLabel);

        jButton.addActionListener(this); // Action Listener Interface

        setLayout(new FlowLayout()); // FlowLayout GridLayout Null
        setVisible(true);
        setSize(300,300);
        setTitle("Number Addition");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int number1 = Integer.parseInt(jTextField.getText());
        int number2 = Integer.parseInt(jTextField1.getText());

        int value = number1 + number2;
        jLabel.setText(value + " ");
    }
}
