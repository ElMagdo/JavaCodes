import java.util.Scanner;

public class PrintString {
    public static void printChar(char c, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.close();
    }
}
