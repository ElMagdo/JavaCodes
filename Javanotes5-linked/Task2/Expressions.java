package Task2;

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
}
