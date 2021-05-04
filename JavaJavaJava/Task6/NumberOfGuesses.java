import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberOfGuesses extends JFrame implements ActionListener {
    private JTextField fld;
    private JButton btn;
    private JTextArea txt;
    
    public NumberOfGuesses(String t) {
        buildUI();
        setTitle(t);
        setSize(300, 300);
        setLocation(200, 150);
        setVisible(true);
    }

    public void buildUI() {
        fld = new JTextField(10);
        btn = new JButton("Check Guesses");
        txt = new JTextArea("CLICK THE BUTTON!!");
        JPanel pnl = new JPanel();
        pnl.add(fld);
        pnl.add(btn);
        pnl.add(txt);

        Container cnt = getContentPane();
        cnt.setLayout(new BorderLayout());
        cnt.add("Center", pnl);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            int n = Integer.parseInt(fld.getText());
            int i = 0;

            while (n >= 0) {
                n /= 2;
                i++;
            }

            txt.setText("it will take at most" + i + " guesses to guess a number between 1 and " + n + ".");
        }
    }

    public static void main(String[] args) {
        new NumberOfGuesses("Number Of Guesses");
    }
}
