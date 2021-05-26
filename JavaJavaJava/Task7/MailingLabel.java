import java.util.Scanner;
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the string label: ");
        String str = in.nextLine();
        
        in.close();
    }
}