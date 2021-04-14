package JavaJavaJava.Task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisplayLabel extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton left;
    private JButton right;
    private JTextField txt;

    public DisplayLabel(String t) {
        buildGUI();
        setTitle(t);
        setSize(200, 150);
        setLocation(200, 150);
        setVisible(true);
    }

    public void buildGUI() {
        left = new JButton("Left");
        right = new JButton("Right");
        txt = new JTextField(10);

        Container cnt = getContentPane();
        cnt.setLayout(new BorderLayout());
    }
}
