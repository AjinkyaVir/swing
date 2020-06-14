package com.company.swingexampleone;

import javax.swing.*;
import java.awt.*;

public class Abc extends JFrame  // CardLayout
{

    public Abc() throws HeadlessException {



        JLabel label = new JLabel("Hello world"); // To show label
        add(label);

        JLabel jLabel= new JLabel("Welcome Ajinkya");
        add(jLabel);

        setLayout(new FlowLayout()); // FlowLayout GridLayout Null
        setVisible(true); // To visibility
        setSize(300,300); //To set size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // To enable close button


    }
}
