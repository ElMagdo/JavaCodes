package JavaJavaJava.Task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToggleButton extends JFrame implements ActionListener {

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

        Container cnt = getContentPane();
        cnt.setLayout(new BorderLayout());
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            if (btn.getText().equals("The Doctor is out")) {
                btn.setText("The Doctor is in");
                return;
            }

            btn.setText("The Doctor is out");
        }
    }

    public static void main(String[] args) {
        new ToggleButton("Toggle Button UI");
    }
    
}
