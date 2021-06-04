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

    public static double getAvgRoll(int n, int r) {
        int tot = 0;

        for (int i = 0; i < r; i++) tot += getRoll(n);

        return Double.parseDouble(tot / r + "");
    }

    public static void main(String[] args) {
        System.out.println("\t\tTotal on Dice\t\t\tAverage Number of Rolls");
        System.out.println("\t\t-------------\t\t\t-----------------------");
    }
}
