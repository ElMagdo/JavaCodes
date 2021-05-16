import java.util.StringTokenizer;

public class Blocked {
    public static void block(int n, String str) {
        StringTokenizer st = new StringTokenizer(str);
        String s = "";

        while (st.hasMoreTokens()) {
            s += st.nextToken();
        }
    }
}