import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberToString extends JFrame implements ActionListener {
    private JLabel hdx;
    private JTextArea txt;
    private JButton chk;

    public NumberToString(String t) {
        buildUI();
        setTitle(t);
        setSize(300, 300);
        setLocation(150, 200);
        setVisible(true);
    }

    public void buildUI() {
        hdx.setText("Enter some text with single-digits:");
        txt.setSize(5, 20);
        chk.setText("Convert");
    }

    public static void main(String[] args) {
        new NumberToString("Number To String Conversion");
    }
}
