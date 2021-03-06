import java.util.Scanner;

public class NewtonSqrt {
    public static int squareRoot(double g, double r) {
        int i = 0;
        double j = g;

        while (g != Math.sqrt(r)) {
            g = ((r / g) + g) / 2.0;
            //System.out.println(g + " " + Math.sqrt(r));
            i++;

            //Check for repetition of sqrt of nearest precision
            if (g == j || g == Math.sqrt(r)) return i;
            j = g;
        }

        return i;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double guess, number;

        System.out.print("Enter the number you want its sqrt: ");
        number = in.nextDouble();

        System.out.print("Guess the sqrt: ");
        guess = in.nextDouble();

        in.close();

        System.out.println("It took " + squareRoot(guess, number) + " guesses!");
    }
}
