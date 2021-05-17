import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Document extends JFrame implements ActionListener {
    private JTextArea doc;
    private JLabel hdx, numWords, numChars, sixMore;

    public Document(String t) {
        buildUI();
        setTitle(t);
        setSize(300, 300);
        setLocation(150, 200);
        setVisible(true);
    }

    public void buildUI() {
        int i;
    }
}
