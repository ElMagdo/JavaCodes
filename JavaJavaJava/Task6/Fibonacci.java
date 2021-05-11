import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(int n) {
        int n0 = 0, n1 = 1, fn = 0;

        if (n == 1) System.out.print(n-1);
        if (n == 2) System.out.print("0 " + (n-1));

        if (n > 2) {
            System.out.print("0 1 ");
            for (int i = 1; i <= n-2; i++) {
                fn = n0 + n1;
                System.out.print(fn + " ");
                n0 = n1;
                n1 = fn;
            }
        }

        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive number to generate Fibonacci series: ");
        int n = in.nextInt();
        in.close();

        fibonacci(n);
    }
}
