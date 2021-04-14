package JavaJavaJava.Task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dimensions extends JFrame {
    private JButton big;
    private JButton small;
    private JButton btn;

    public Dimensions(String t) {
        buildGUI();
        setTitle(t);
        setSize(100, 100);
        setLocation(200, 150);
        setVisible(true);
    }

    public void buildGUI() {
        big = new JButton("Big");
        small = new JButton("Small");
        btn = new JButton("Big");

        Container cnt = getContentPane();
        cnt.setLayout(new BorderLayout());
        cnt.add("West", big);
        cnt.add("Center", btn);
        cnt.add("East", small);
    }
}
