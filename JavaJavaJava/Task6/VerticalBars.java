import java.util.Scanner;

public class VerticalBars {
    public static void displayBar(int a, int b, int c, int d) {
        int mx = Math.max(Math.max(a, b), Math.max(c, d));
        String ch = "** ", sp = "   ";

        for (int i = mx; i > 0; i--) {
            if (i <= a) System.out.print(ch);
            else System.out.print(sp);

            if (i <= b) System.out.print(ch);
            else System.out.print(sp);

            if (i <= c) System.out.print(ch);
            else System.out.print(sp);

            if (i <= d) System.out.print(ch);
            else System.out.print(sp);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d;

        System.out.print("Enter the 4 values of the Bar chart: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();

        in.close();

        displayBar(a, b, c, d);
    }
}
