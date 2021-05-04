import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberOfGuesses extends JFrame implements ActionListener {
    
    public NumberOfGuesses(String t) {
        buildUI();
        setTitle(t);
        setSize(300, 300);
        setLocation(200, 150);
        setVisible(true);
    }

    public void buildUI() {
        JTextField fld = new JTextField(10);
        JButton btn = new JButton("Check Guesses");
        JPanel pnl = new JPanel();
        pnl.add(fld);
        pnl.add(btn);

        Container cnt = getContentPane();
        cnt.setLayout(new BorderLayout());
        cnt.add("Center", pnl);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            int n = Integer.parseInt(fld.getText());
            int i;

            while (n >= 0) {
                n /= 2;
                i++;
            }

            txt.setText("it will take at most" + i + " guesses to guess a number between 1 and " + n + ".");
        }
    }
}
