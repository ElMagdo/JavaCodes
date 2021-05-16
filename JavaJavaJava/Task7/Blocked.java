import java.util.StringTokenizer;

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
}