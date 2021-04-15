package JavaJavaJava.Task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeBackground extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;

    public ChangeBackground(String t) {
        buildGUI();
        setTitle(t);
        setSize(300, 300);
        setBackground(Color.magenta);
        setLocation(200, 150);
        setVisible(true);
    }

    public void buildGUI() {
        btn1 = new JButton("Red");
        btn1 .addActionListener(this);

        btn2 = new JButton("Green");
        btn2.addActionListener(this);

        btn3 = new JButton("Blue");
        btn3.addActionListener(this);

        JPanel pnl = new JPanel();
        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(btn3);

        Container cnt = getContentPane();
        cnt.setLayout(new BorderLayout());
        cnt.add("Center", pnl);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            setBackground(Color.red);
        }

        if (e.getSource() == btn2) {
            setBackground(Color.green);
        }

        if (e.getSource() == btn3) {
            setBackground(Color.blue);
        }
    }

    public static void main(String[] args) {
        new ChangeBackground("Change Background UI");
    }
}
