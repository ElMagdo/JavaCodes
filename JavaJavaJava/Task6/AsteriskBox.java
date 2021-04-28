import java.util.Scanner;

public class AsteriskBox {
    public static void box(int r, int c) {
        for (int i = 1; i <= c; i++) {
            System.out.print(" * ");
        }

        System.out.println();

        for (int j = 1; j <= c-1; j++) {
            System.out.print(" * ");

            for (int i = 1; i <= r-2; i++)
                System.out.print("   ");

            System.out.print(" * ");
            System.out.println();
        }

        for (int i = 1; i <= c; i++) {
            System.out.print(" * ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = in.nextInt();

        System.out.print("Enter the number of columns: ");
        int col = in.nextInt();
        in.close();

        box(row, col);

        System.out.println();
    }
}
