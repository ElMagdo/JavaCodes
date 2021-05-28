package Task1;

public class CountEggs {
    public static void count(int n) {
        int gross, dozen, extra;
        gross = n / 144;
        extra = n % 144;

        dozen = extra / 12;
        extra = extra % 12;

        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + extra);
    }
}
