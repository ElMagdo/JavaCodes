package Task2;

import java.util.Scanner;

public class Divisors {
    public static int getNumberOfDivisors(int n) {
        int d = 0;

        for (int i = 1; i < n/2; i++) {
            if (n%i == 0) d++;
        }

        return d;
    }

    public static String getHighest(int l, int u) {
        int mx = 0;
        String str = "tie";

        for (int i = l; i <= u; i++) {
            if (mx > getNumberOfDivisors(i)) {
                str = mx + " with " + i;
            }
        }

        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter lower bound: ");
        int l = in.nextInt();

        System.out.print("Enter upper bound: ");
        int u = in.nextInt();
        in.close();

        System.out.println("The integer with the highest number of divisors is");
    }
}
