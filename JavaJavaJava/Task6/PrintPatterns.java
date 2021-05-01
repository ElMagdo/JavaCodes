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

    public static void secondShape(int n) {
        for (int i = 1; i <= n; i++) {
            printRow(0, n-i, "* ");
            printRow(0, i, "  ");
            System.out.println();
        }
    }

    public static void thirdShape(int n) {
        printRow(1, n, "* ");
        System.out.println();
        
        int j = (n - 2);
        for (int i = 1; i <= (n - 2)/2; i++) {
            printRow(1, i, "  ");
            System.out.print("* ");
            printRow(1, j - 1 - i, "  "); j--;
            System.out.print("* ");

            System.out.println();
        }
        
        j = 0;
        for (int i = (n - 2)/2; i > 0; i--) {
            printRow(1, i, "  ");
            System.out.print("* ");
            printRow(1, j, "  "); j += 2;
            System.out.print("* ");

            System.out.println();
        }

        printRow(1, n, "* ");
        System.out.println();
    }

    public static void fourthShape(int n) {
        printRow(1, n, "* ");
        System.out.println();

        for (int i = 1; i <= n-2; i++) {
            printRow(1, n-i-1, "  ");
            System.out.println('*');
        }

        printRow(1, n, "* ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the shapes: ");
        int sz = in.nextInt();

        fourthShape(sz);

        in.close();
    }
}
