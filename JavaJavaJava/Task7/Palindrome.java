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
        txt = new JTextField(10);
        disp = new JLabel("Nothing yet!");

        JPanel ct = new JPanel();
        ct.add(hdx);
        ct.add(txt);
        ct.add(disp);
    }

    public static void main(String[] args) {
        new Palindrome("Check Palindromes");
    }
}
