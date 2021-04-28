import java.util.Scanner;

public class AsteriskBox {
    public static void box(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++)
                System.out.print('*');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.close();
    }
}
