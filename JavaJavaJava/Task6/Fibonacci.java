public class Fibonacci {
    public static void fibonacci(int n) {
        int n0 = 0, n1 = 1, fn = 0;

        for (int i = 1; i <= n; i++) {
            fn = n0 + n1;
            System.out.print(fn + " ");
            n0 = n1;
            n1 = fn;
        }
    }
}
