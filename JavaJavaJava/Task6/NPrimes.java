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
        setSize(420, 300);
        setLocation(150, 200);
        setVisible(true);
    }

    public void buildUI() {
        lbl = new JLabel("Enter a number greater than zero(n > 0):");
        inp = new JTextField(10);
        btn = new JButton("Check Primes");
        num = new JLabel("No primes yet!");
        disp = new JTextArea();

        JPanel nt = new JPanel(), ct = new JPanel(), st = new JPanel();
        nt.add(lbl);
        nt.add(inp);
        st.add(btn);
        st.add(num);
        ct.add(nt);
        ct.add(st);
        ct.add(disp);

        Container cnt = getContentPane();
        cnt.setLayout(new BorderLayout());
        cnt.add("Center", ct);
    }

    public static void main(String[] args) {
        new NPrimes("Check NUmber Of Primes");
    }
}
