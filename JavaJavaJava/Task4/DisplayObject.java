package JavaJavaJava.Task4;

import javax.swing.*;

public class DisplayObject extends JFrame {
    private JButton btn;
    private JTextField fld;
    private JLabel lbl;

    public DisplayObject(String t) {
        setTitle(t);
        pack();
        setVisible(true);
    }

    public void buildGUI() {
        btn = new JButton("Am just simple");
        fld = new JTextField(10);
    }
}
