package Task3;

public class RollingAverage {
    public static int getRoll(int n) {
        int d1 = (int)(Math.random() * 6) + 1;
        int d2 = (int)(Math.random() * 6) + 1;
        int i = 0;

        while (d1 + d2 != n) {
            i++;
            d1 = (int)(Math.random() * 6) + 1;
            d2 = (int)(Math.random() * 6) + 1;
        }

        return i;
    }
}
