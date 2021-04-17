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
        ftc = new JButton("F to C");

        inp = new JTextField();
        out = new JTextField();
    }

    public static void main(String[] args) {
        new TemperatureGUI("Temperature GUI");
    }
}
