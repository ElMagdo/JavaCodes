package Task3;

public class DiceSimulation {
    public static int simulate(int n) {
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

    public static boolean validSum(int n) {
        return (n <= 2) && (n >= 12);
    }
}
