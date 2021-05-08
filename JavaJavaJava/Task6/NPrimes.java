import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NPrimes extends JFrame implements ActionListener {
    private JLabel lbl, num;
    private JTextField inp;
    private JButton btn;
    private JTextArea disp;

    public NPrimes(String t) {
        buildUI();
        setTitle(t);
        setSize(200, 300);
        setLocation(150, 200);
        setVisible(true);
    }

    public void buildUI() {
        lbl = new JLabel("Enter a number greater than zero(n > 0):");
        inp = new JTextField(10);
        btn = new JButton("Check Primes");
        num = new JLabel("No primes yet!");
        disp = new JTextArea();
    }
}
