package JavaJavaJava.Task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dimensions extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JButton big;
    private JButton small;
    private JButton btn;

    public Dimensions(String t) {
        buildGUI();
        setTitle(t);
        setSize(200, 200);
        setLocation(200, 150);
        setVisible(true);
    }

    public void buildGUI() {
        big = new JButton("Big");
        big.addActionListener(this);

        small = new JButton("Small");
        small.addActionListener(this);

        btn = new JButton("Big");
        btn.addActionListener(this);

        Container cnt = getContentPane();
        cnt.setLayout(new BorderLayout());
        cnt.add("West", big);
        cnt.add("Center", btn);
        cnt.add("East", small);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == big) {
            setSize(300, 200);
        }

        if (e.getSource() == small) {
            setSize(200, 100);
        }

        if (e.getSource() == btn) {
            if (btn.getText() == "Big") {
                setSize(300, 200);
                btn.setText("Small");
            } else {
                setSize(200, 100);
                btn.setText("Big");
            }
        }
    }

    public static void main(String[] args) {
        new Dimensions("Dimensions UI");
    }
}
