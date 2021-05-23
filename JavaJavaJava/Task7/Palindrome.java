import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Palindrome extends JFrame implements ActionListener {
    private JLabel hdx, disp;
    private JTextField txt;

    public Palindrome(String t) {
        buildUI();
        setTitle(t);
        setSize(300, 300);
        setLocation(150, 200);
        setVisible(true);
    }

    public void buildUI() {
        hdx = new JLabel("Enter a word or a phrase:");
        txt = new JTextField(15);
        txt.addActionListener(this);
        disp = new JLabel("Nothing yet!");

        JPanel ct = new JPanel();
        ct.add(hdx);
        ct.add(txt);
        ct.add(disp);

        Container cnt = getContentPane();
        cnt.setLayout(new BorderLayout());
        cnt.add("Center", ct);
    }

    public boolean isPalindrome(String str) {
        String s = str;

        for (int i = 0, j = s.length() - 1; i < str.length() && j >= 0; i++, j--) {
            if (s.charAt(j) != str.charAt(i)) return false;
        }

        return true;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == txt) {
            if (isPalindrome(txt.getText())) {
                disp.setText("Hooray!! String is a Palindrome");
            } else {
                disp.setText("Sorry!! Not a Palindrome");
            }
        }
    }

    public static void main(String[] args) {
        new Palindrome("Check Palindromes");
    }
}
