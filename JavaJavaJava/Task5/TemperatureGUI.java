package JavaJavaJava.Task5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureGUI extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JButton ctf;
    private JButton ftc;

    private JTextField inp;
    private JTextField out;

    public TemperatureGUI(String t) {
        buildGUI();
        setTitle(t);
        setSize(200, 150);
        setLocation(200, 150);
        setVisible(true);
    }

    public void buildGUI() {
        ctf = new JButton("C to F");
        ctf.addActionListener(this);

        ftc = new JButton("F to C");
        ftc.addActionListener(this);

        inp = new JTextField(10);
        out = new JTextField(15);
    }

    public String celToFah(int c) {
        double f = (9.0 * c / 5.0 + 32.0);
        return c + "C = " + f + "F";
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ctf) {}

        if (e.getSource() == ftc) {}
    }

    public static void main(String[] args) {
        new TemperatureGUI("Temperature GUI");
    }
}
