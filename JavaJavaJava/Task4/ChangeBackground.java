package JavaJavaJava.Task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeBackground extends JFrame {
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;

    public ChangeBackground(String t) {
        buildGUI();
        setTitle(t);
        setSize(300, 300);
        setLocation(200, 150);
        setVisible(true);
    }

    public void buildGUI() {
        btn1 = new JButton("Red");
        btn2 = new JButton("Green");
        btn3 = new JButton("Blue");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            setBackground(Color.RED);
        }

        if (e.getSource() == btn2) {
            setBackground(Color.GREEN);
        }

        if (e.getSource() == btn3) {
            setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new ChangeBackground("Change Background UI");
    }
}
