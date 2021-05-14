import java.util.Scanner;

public class Halflife {
    public static int decay(double y) {
        int v = 100, j = 100, i = 0;

        while (j > 0.02*v) {
            i += y;
            j *= 0.5;
        }

        return i;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        double years;

        System.out.print("Enter the name of the radioactive substance: ");
        name = in.next();

        System.out.print("Enter the half-life of the substance: ");
        years = in.nextDouble();
        in.close();
    }
}
