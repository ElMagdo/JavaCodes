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
}
