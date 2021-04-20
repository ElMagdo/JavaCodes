package JavaJavaJava.Task5.Investment;

import java.util.Scanner;
import java.text.NumberFormat;

public class BankCDUI {
    public static void run() {
        Scanner inp = new Scanner(System.in);

        double p, r, n;

        NumberFormat dollars = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();

        System.out.println("************************ OUTPUT ********************");
        System.out.println("Compare daily and annual compounding for a Bank CD.");

        System.out.print("Input CD initial principal, e.g. 1000.55 >");
        p = inp.nextDouble();

        System.out.print("Input CD interest rate, e.g. 6.5 >");
        r = inp.nextDouble();

        System.out.print("Input the number of years to maturity, e.g., 10.5 >");
        n = inp.nextDouble();

        inp.close();

        BankCD bank = new BankCD(p, r, n);
        
        System.out.println("For Principal = " + dollars.format(p) + " Rate= " + percent.format(r) + " Years= " + n);
        System.out.println("The maturity value compounded yearly is: " + dollars.format(bank.yearlyCD()));
        System.out.println("The maturity value compounded daily is: " + dollars.format(bank.dailyCD()));
        System.out.println("************************ OUTPUT ********************");
    }

    public static void main(String[] args) {
        run();
    }
}
