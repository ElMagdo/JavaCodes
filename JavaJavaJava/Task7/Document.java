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
        hdx = new JLabel("Enter some text in the box:");
        numWords = new JLabel("Number of words: ");
        numChars = new JLabel("Number of characters: ");
        sixMore = new JLabel("Percentage of words that have more than six letters");
    }

    public static void main(String[] args) {
        new Document("DOCUMENT ANALYSIS UI");
    }
}
