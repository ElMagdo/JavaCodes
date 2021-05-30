package Task2;

import java.util.Scanner;

public class Expressions {
    public static void evaluate(double a, String op, double b) {
        double ans = 0;
        boolean chk = true;

        if (op == "+") ans = a + b;
        else if (op == "-") ans = a - b;
        else if (op == "*") ans = a * b;
        else if (op == "/") ans = a / b;
        else chk = false;

        if (chk) System.out.println(a + " " + op + "" + b + " = " + ans);
        else System.out.println("INVALID operator '" + op + "'!!");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       System.out.println("Welcome to the Expression Evaluation Program");
       System.out.println("Enter an expression such as: 3.5 + 4");
       System.out.println("Enter 0 to exit...");
        in.close();
    }
}
