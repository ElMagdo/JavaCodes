import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberToString extends JFrame implements ActionListener {
    private JLabel hdx;
    private JTextArea txt;
    private JButton chk;
    
    public NumberToString(String t) {
        setTitle(t);
        setSize(300, 300);
        setLocation(150, 200);
        setVisible(true);
    }
}
