import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Palindrome extends JFrame implements ActionListener {
    public Palindrome(String t) {
        biuldUI();
        setTitle(t);
        setSize(300, 300);
        setLocation(150, 200);
        setVisible(true);
    }

    public void biuldUI() {}

    public static void main(String[] args) {
        new Palindrome("Check Palindromes");
    }
}
