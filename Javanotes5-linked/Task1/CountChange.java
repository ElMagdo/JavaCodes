package Task1;

import java.util.Scanner;

public class CountChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int quarters, dimes, nickels, pennies;

        System.out.print("Enter number of Quarters: ");
        quarters = in.nextInt();
        System.out.print("Enter number of Dimes: ");
        dimes = in.nextInt();
        System.out.print("Enter number of Nickels: ");
        nickels = in.nextInt();
        System.out.print("Enter number of Pennies: ");
        pennies = in.nextInt();

        in.close();
    }
}
