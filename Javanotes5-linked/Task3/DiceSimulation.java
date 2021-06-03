package Task3;

import java.util.Scanner;

public class DiceSimulation {
    public static int simulate(int n) {
        int d1 = (int)(Math.random() * 6) + 1;
        int d2 = (int)(Math.random() * 6) + 1;
        int i = 0;

        while (d1 + d2 != n) {
            i++;
            d1 = (int)(Math.random() * 6) + 1;
            d2 = (int)(Math.random() * 6) + 1;
        }

        return i;
    }

    public static boolean isValidSum(int n) {
        return (n <= 2) && (n >= 12);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter dice sum (a number between 2 and 12): ");
        int n = in.nextInt();

        if (isValidSum(n)) System.out.println("Number of throws to get sum: " + simulate(n));
        else System.out.println("ERROR!! Invalid dice sum...");

        in.close();
    }
}
