public class VerticalBars {
    public static void displayBar(int a, int b, int c, int d) {
        int mx = Math.max(Math.max(a, b), Math.max(c, d));
        String ch = "** ", sp = "   ";

        for (int i = mx; i > 0; i--) {
            if (i <= a) System.out.print(ch);
            else System.out.print(sp);

            if (i <= b) System.out.print(ch);
            else System.out.print(sp);

            System.out.println();
        }
    }
}
