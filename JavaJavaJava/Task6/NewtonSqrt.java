public class NewtonSqrt {
    public static int squareRoot(double g, double r) {
        int i = 0;

        while (g != Math.sqrt(r)) {
            g = ((r / g) + g) / 2;
            i++;
        }

        return i;
    }
}
