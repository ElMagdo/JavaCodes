import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;

public class Document extends JFrame implements ActionListener {
    private JTextArea doc;
    private JLabel hdx, numWords, numChars, sixMore;
    private JButton chk;

    public Document(String t) {
        buildUI();
        setTitle(t);
        setSize(300, 300);
        setLocation(150, 200);
        setVisible(true);
    }

    public void buildUI() {
        hdx = new JLabel("Enter some text in the box: ");

        doc = new JTextArea(5, 25);

        chk = new JButton("Get Analysis");
        chk.addActionListener(this);

        numWords = new JLabel("Number of words: ");
        numChars = new JLabel("Number of characters: ");
        sixMore = new JLabel("% of six letter words: ");

        JPanel ct = new JPanel();
        ct.add(hdx);
        ct.add(doc);
        ct.add(chk);
        ct.add(numWords);
        ct.add(numChars);
        ct.add(sixMore);

        Container cnt = getContentPane();
        cnt.setLayout(new BorderLayout());
        cnt.add("Center", ct);
    }

    public int wordsCount(String str) {
        StringTokenizer tk = new StringTokenizer(str);
        return tk.countTokens();
    }

    public double perSix(String str) {
        StringTokenizer tk = new StringTokenizer(str);
        int i = 0;

        while (tk.hasMoreTokens()) {
            if (tk.nextToken().length() >= 6) i++;
        }

        return (i / tk.countTokens()) * 100.0;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chk) {
            numWords.setText("Number of words: " + wordsCount(doc.getText()));
            numChars.setText("Number of characters: " + doc.getText().length());
            sixMore.setText("% of six letter words: " + perSix(doc.getText()) + "%");
        }
    }

    public static void main(String[] args) {
        new Document("DOCUMENT ANALYSIS UI");
    }
}
