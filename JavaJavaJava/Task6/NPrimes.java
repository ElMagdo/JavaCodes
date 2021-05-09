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
        btn.addActionListener(this);

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

    public boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (i%n == 0) return false;

        return true;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            int n = Integer.parseInt(inp.getText()), p = 0;

            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    p++;
                    if (p%10 != 0) {
                        disp.append(i + " ");
                    } else {
                        disp.append("\n" + i);
                    }
                }
            }

            num.setText("There are " + p + " Primes!");
            disp.setSize(10, p%10);
        }
    }

    public static void main(String[] args) {
        new NPrimes("Check Number Of Primes");
    }
}
