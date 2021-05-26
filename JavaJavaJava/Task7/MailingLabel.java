import java.util.StringTokenizer;

public class MailingLabel {
    public static void display(String str) {
        StringTokenizer tk = new StringTokenizer(str, ":");

        System.out.println("====================");
        while (tk.hasMoreTokens()) {
            System.out.println(tk.nextToken());
        }
        System.out.println("====================");
    }
}
