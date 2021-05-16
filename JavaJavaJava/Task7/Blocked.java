import java.util.StringTokenizer;
import java.util.Scanner;

public class Blocked {
    public static void block(int n, String str) {
        StringTokenizer st = new StringTokenizer(str);
        String s = "";

        while (st.hasMoreTokens()) {
            s += st.nextToken();
        }

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (i%n == 0) {
                sb.insert(i, ' ');
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String txt;
        int n;

        System.out.print("Enter the text: ");
        txt = in.nextLine();

        System.out.print("Enter the size of each block: ");
        n = in.nextInt();
        
        in.close();
    }
}