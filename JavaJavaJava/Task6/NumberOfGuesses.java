import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberOfGuesses extends JFrame {
    
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
}
