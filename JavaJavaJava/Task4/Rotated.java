package JavaJavaJava.Task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rotated extends JFrame implements ActionListener {
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
        cnt.add("North", first);
        cnt.add("Center", second);
        cnt.add("South", third);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == first) {
            first.setText("First");
            second.setText("Second");
            third.setText("Third");
        }

        if (e.getSource() == second) {
            first.setText("Third");
            second.setText("First");
            third.setText("Second");
        }

        if (e.getSource() == third) {
            first.setText("Second");
            second.setText("Third");
            third.setText("First");
        }
    }

    public static void main(String[] args) {
        new Rotated("Rotated Buttons UI");
    }
}
