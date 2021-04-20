package JavaJavaJava.Task5.Investment;

import java.util.Scanner;
import java.text.NumberFormat;

public class BankCDUI {
    public static void run() {
        Scanner inp = new Scanner(System.in);
        double p, r, n;

        System.out.println("************************ OUTPUT ********************");
        System.out.println("Compare daily and annual compounding for a Bank CD.");

        System.out.print("Input CD initial principal, e.g. 1000.55 >");
        p = inp.nextInt();

        System.out.print("Input CD interest rate, e.g. 6.5 >");
        r = inp.nextInt();

        System.out.println("Input the number of years to maturity, e.g., 10.5 >");
        n = inp.nextInt();
        
        System.out.println("For Principal = $2,500.00 Rate= 7.8% Years= " + n);
        System.out.println("The maturity value compounded yearly is $3,639.43");
        System.out.println("The maturity value compounded daily is: $3,692.30");
        System.out.println("************************ OUTPUT ********************");
    }

    public static void main(String[] args) {
        run();
    }
}
