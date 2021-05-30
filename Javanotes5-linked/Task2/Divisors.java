package Task2;

public class Divisors {
    public static int getNumberOfDivisors(int n) {
        int d = 0;
        
        for (int i = 1; i < n/2; i++) {
            if (n%i == 0) d++;
        }

        return d;
    }
}
