package Task2;

public class Divisors {
    public static int getNumberOfDivisors(int n) {
        int d = 0;

        for (int i = 1; i < n/2; i++) {
            if (n%i == 0) d++;
        }

        return d;
    }

    public static String getHighest(int l, int u) {
        int mx = 0;
        String str = "tie";

        for (int i = l; i <= u; i++) {
            if (mx > getNumberOfDivisors(i)) {
                str = mx + " with " + i;
            }
        }

        return str;
    }
}
