package JavaJavaJava.Task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtons extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton btn1;
    private JButton btn2;

    public TwoButtons(String t) {
        buildGUI();
        setTitle(t);
        setSize(200, 150);
        setLocation(200, 150);
        setVisible(true);
    }

    public void buildGUI() {
        btn1 = new JButton("Me first!");
        btn2 = new JButton("Me next!");
    }
}
