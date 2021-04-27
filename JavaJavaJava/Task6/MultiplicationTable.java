import java.util.Scanner;

public class MultiplicationTable {
    public static void uptoSquare(int n) {
        for (int i = 1; i <= n; i++)
            System.out.print(i * n + " ");
    }

    public static void table(int l) {
        for (int i = 1; i <= l; i++)
            System.out.print(" " + i);

        System.out.println();

        for (int i = 1; i <= l; i++) {
            uptoSquare(i);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.close();
    }
}
