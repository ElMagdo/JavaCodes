package Task1;

import java.util.Scanner;

public class CountChange {

    public static void convert(double q, double d, double n, double p) {
        double dollars = (q * 0.25) + (d * 0.10) + (n * 0.05) + (p * 0.01);
        System.out.println("Your change is: $" + dollars);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double quarters, dimes, nickels, pennies;

        System.out.print("Enter number of Quarters: ");
        quarters = in.nextDouble();
        System.out.print("Enter number of Dimes: ");
        dimes = in.nextDouble();
        System.out.print("Enter number of Nickels: ");
        nickels = in.nextDouble();
        System.out.print("Enter number of Pennies: ");
        pennies = in.nextDouble();
        convert(quarters, dimes, nickels, pennies);

        in.close();
    }
}
