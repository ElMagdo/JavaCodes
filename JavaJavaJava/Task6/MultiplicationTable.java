import java.util.Scanner;

public class MultiplicationTable {
    public static void uptoSquare(int n) {
        for (int i = 1; i <= n; i++)
            System.out.print(i * n + "   ");
    }

    public static void table(int l) {
        System.out.print("    ");
        for (int i = 1; i <= l; i++)
            System.out.print(i + "   ");

        System.out.println();

        for (int i = 1; i <= l; i++) {
            System.out.print(i + "   ");
            uptoSquare(i);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of multiplication table: ");
        int N = in.nextInt();
        in.close();

        table(N);
    }
}
