import java.util.Scanner;

public class HorizontalBars {
    public static void printBar(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    public static void barGraph(int a, int b, int c, int d) {
        printBar(a);
        printBar(b);
        printBar(c);
        printBar(d);
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

        barGraph(a, b, c, d);
    }
}