import java.util.Scanner;

public class PrintPatterns {
    public static void printRow(int s, int e, String c) {
        for (int i = s; i <= e; i++)
            System.out.print(c);
    }

    public static void firstShape(int n) {
        for (int i = 1; i <= n; i++) {
            printRow(0, i, "  ");
            printRow(0, n-i, "* ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the shapes: ");
        int sz = in.nextInt();

        in.close();
    }
}
