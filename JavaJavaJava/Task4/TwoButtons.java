package JavaJavaJava.Task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtons extends JFrame implements ActionListener {
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
        btn1.addActionListener(this);

        btn2 = new JButton("Me next!");
        btn2.addActionListener(this);

        Container cnt = getContentPane();
        cnt.setLayout(new BorderLayout());

        cnt.add("North", btn1);
        cnt.add("South", btn2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn2) {
            btn1.setText("Me next!");
            btn2.setText("Me first!");
        }

        if (e.getSource() == btn1) {
            btn1.setText("Me first!");
            btn2.setText("Me next!");
        }
    }

    public static void main(String[] args) {
        new TwoButtons("Toggle Two Buttons UI");
    }
}
