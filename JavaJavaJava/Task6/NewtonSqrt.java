import java.util.Scanner;

public class NewtonSqrt {
    public static int squareRoot(double g, double r) {
        int i = 0;

        while (g != Math.sqrt(r)) {
            g = ((r / g) + g) / 2;
            i++;
        }

        return i;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.close();
    }
}
