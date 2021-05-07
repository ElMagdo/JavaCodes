import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Extinguisher extends JFrame implements ActionListener {
    private JLabel lx, ly;
    private JTextField tx, ty;
    private JButton btn;
    private JTextArea disp;
    
    public Extinguisher(String t) {
        setTitle(t);
        buildUI();
        setLocation(150, 200);
        setSize(200, 300);
        setVisible(true);
    }

    public void buildUI() {
        int i;
    }
}
