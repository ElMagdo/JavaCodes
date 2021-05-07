import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Extinguisher extends JFrame implements ActionListener {
    private JLabel lx, ly;
    private JTextField tx, ty;
    private JButton btn;
    private JTextArea disp;

    public Extinguisher(String t) {
        setTitle(t);
        buildUI();
        pack();
        setLocation(150, 200);
        setSize(400, 300);
        setVisible(true);
    }

    public void buildUI() {
        lx = new JLabel("Enter the LOSS percent: ");
        ly = new JLabel("Enter the THRESHOLD percent: ");
        tx = new JTextField(10);
        ty = new JTextField(10);
        btn = new JButton("Percent left");
        disp = new JTextArea();

        JPanel bg = new JPanel(), nt = new JPanel(), ct = new JPanel(), st = new JPanel();
        nt.add(lx);
        nt.add(tx);

        ct.add(ly);
        ct.add(ty);

        st.add(btn);
        st.add(disp);

        bg.add(nt);
        bg.add(ct);
        bg.add(st);

        Container cnt = getContentPane();
        cnt.setLayout(new BorderLayout());
        cnt.add("Center", bg);
    }

    public int duration(double x, double y) {
        int i = 0, mx = 100;
        while (mx > y) {
            mx -= x;
            i++;
        }

        return i;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            double x = Double.parseDouble(tx.getText());
            double y = Double.parseDouble(ty.getText());
            double days = duration(x, y);
            double wks = days / 7.0;

            disp.setText("Extinguisher could last for " + wks + " weeks!");
        }
    }

    public static void main(String[] args) {
        new Extinguisher("EXTINGUISHER DURATION PROGRAM");
    }
}
