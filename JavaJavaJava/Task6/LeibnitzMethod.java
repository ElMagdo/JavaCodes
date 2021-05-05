import java.util.Scanner;

public class LeibnitzMethod {
    public static int iterations(double s, double e) {
        int it = 0, i = 1;
        double sum = 0.0;

        do {
            sum = (it%2 == 0) ? sum + (1.0/i) : sum - (1.0/i);
            i += 2;
            it++;

            if ((4*sum >= s) && (4*sum >= e)) {
                System.out.println("sum = " + 4*sum);
                return it;
            }
        }
        while(true);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double start, end;

        System.out.print("Enter the start boundary value of PI: ");
        start = in.nextDouble();

        System.out.print("Enter end(stop) boundary value of PI: ");
        end = in.nextDouble();
        in.close();
    }
}
