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
    }
}
