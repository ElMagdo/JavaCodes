import java.util.Scanner;

public class HorizontalBars {
    public static void printBar(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void bargraph(int a, int b, int c, int d) {
        printBar(a);
        printBar(b);
        printBar(c);
        printBar(d);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.close();
    }
}
