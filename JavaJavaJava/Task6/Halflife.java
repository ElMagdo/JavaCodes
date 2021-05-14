public class Halflife {
    public static int decay(double y) {
        int v = 100, j = 100, i = 0;

        while (j > 0.02*v) {
            i += y;
            j *= 0.5;
        }

        return i;
    }
}
