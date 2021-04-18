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
        pack();
        //setSize(200, 150);
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

        Container cnt = getContentPane();
        cnt.setLayout(new BorderLayout());

        JPanel up = new JPanel();
        JPanel mid = new JPanel();
        JPanel dwn = new JPanel();

        up.add(new JLabel("Input Temperature >>"));
        up.add(inp);
        mid.add(ctf);
        mid.add(ftc);
        dwn.add(new JLabel("Conversion Result:"));
        dwn.add(out);

        cnt.add("North", up);
        cnt.add("Center", mid);
        cnt.add("South", dwn);
    }

    public String celToFah(int c) {
        double f = (9.0 * c / 5.0 + 32.0);
        return c + "C = " + f + "F";
    }

    public String fahToCel(int f) {
        double c = (5.0 * (f - 32.0) / 9.0);
        return f + "F = " + c + "C";
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ctf) {
            if (inp.getText() != null) {
                out.setText(celToFah(Integer.parseInt(inp.getText())));
            }
        }

        if (e.getSource() == ftc) {
            if (inp.getText() != null) {
                out.setText(fahToCel(Integer.parseInt(inp.getText())));
            }
        }
    }

    public static void main(String[] args) {
        new TemperatureGUI("Temperature GUI");
    }
}
