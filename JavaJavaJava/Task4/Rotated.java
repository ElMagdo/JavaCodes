package JavaJavaJava.Task4;

import javax.swing.*;

import jdk.internal.platform.Container;

import java.awt.*;
import java.awt.event.*;

public class Rotated extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton first;
    private JButton second;
    private JButton third;

    public Rotated(String t) {
        buildGUI();
        setTitle(t);
        setSize(200, 150);
        setLocation(200, 150);
        setVisible(true);
    }

    public void buildGUI() {
        first = new JButton("First");
        second = new JButton("Second");
        third = new JButton("Third");

        Container cnt = getContentPane();
        cnt.setLayout(new BorderLayout());
    }
}
