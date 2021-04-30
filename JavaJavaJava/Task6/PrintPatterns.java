import java.util.Scanner;

public class PrintPatterns {
    public static void printRow(int s, int e, char c) {
        for (int i = s; i <= e; i++)
            System.out.print(c);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.close();
    }
}
