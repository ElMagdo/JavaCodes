package JavaJavaJava.Task4;

import javax.swing.*;
import java.awt.*;

public class DisplayObject extends JFrame {
    private JButton btn;
    private JTextField fld;
    private JLabel lbl;

    public DisplayObject(String t) {
        buildGUI();
        setTitle(t);
        setSize(500, 150);
        setLocation(200, 150);
        //pack();
        setVisible(true);
    }

    public void buildGUI() {
        btn = new JButton("Am just simple");
        fld = new JTextField(10);
        lbl = new JLabel("Welcome to this Simple GUI");

        Container cnt = getContentPane();
        cnt.setLayout(new BorderLayout());
        cnt.add("North", lbl);
        cnt.add("Center", fld);
        cnt.add("South", btn);

        System.out.println("Label: " + lbl.toString());
        System.out.println("Text field: " + fld.toString());
        System.out.println("Button: " + btn.toString());
    }

    public static void main(String[] args) {
        new DisplayObject("My simple UI");
    }
}
