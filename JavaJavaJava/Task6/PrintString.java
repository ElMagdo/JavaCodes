import java.util.Scanner;

public class PrintString {
    public static void printChar(String c, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String ch = in.next();

        System.out.print("Enter a positive integer: ");
        int N = in.nextInt();

        printChar(ch, N);

        in.close();
    }
}
