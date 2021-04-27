public class MultiplicationTable {
    public void uptoSquare(int n) {
        for (int i = 1; i <= n; i++)
            System.out.print(i * n + " ");
    }

    public static void table(int l, int w) {
        for (int i = 1; i <= w; i++)
            System.out.print("\t" + i);
    }
}
