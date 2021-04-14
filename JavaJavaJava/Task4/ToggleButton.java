package JavaJavaJava.Task4;

import javax.swing.*;
import java.awt.event.*;

public class ToggleButton extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JButton btn;

    public ToggleButton(String t) {
        buildGUI();
        setTitle(t);
        setSize(200, 150);
        setLocation(200, 150);
        setVisible(true);
    }

    public void buildGUI() {
        btn = new JButton("The Doctor is out");
    }
    
}
