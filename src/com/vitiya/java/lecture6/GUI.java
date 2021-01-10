package com.vitiya.java.lecture6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Elements of GUI : Components, Layouts, Events
 * AWT - Abstract Windows Toolkit
 * Swing -Swing does not replace the AWT; it is built on top of it
 * JavaFX
 * */

public class GUI {

    static int count = 0;

    public static void main(String[] args) {

        JFrame f = new JFrame();
        JButton b = new JButton("Click");

        JLabel l = new JLabel();
        l.setText("Hello World !");

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                count++;
                l.setText("Number of Clicks : "+String.valueOf(count));
            }
        });

        b.setBounds(130,100,100, 40);//x axis, y axis, width, height
        l.setBounds(130,150,150, 40);//x axis, y axis, width, height
        f.add(b);//adding button in JFrame
        f.add(l);//adding label in JFrame

        f.setSize(400,400);
        f.setTitle("Java Swing Pane");
        f.setLayout(null);
        f.setVisible(true);
    }

}
